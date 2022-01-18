package com.Task_10Clouds.step_definitions;

import com.Task_10Clouds.pages.CareersPage;
import com.Task_10Clouds.utilities.ConfigurationReader;
import com.Task_10Clouds.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class OpenQARolesStepDefs {

    CareersPage careersPage = new CareersPage();

    @Given("the user navigates to 10clouds home page")
    public void the_user_navigates_to_10clouds_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @And("clicks on {string} tab")
    public void clicksOnTab(String tabName) {
        careersPage.navigateToTab(tabName);
    }

    @Then("the user validates that there are {int} {string} roles open")
    public void validate_that_there_is_role_open(int expectedNumberOfRole, String expectedRoleName) {
       int actualNumberOfRole = 0;
        for (WebElement eachOpenRole : careersPage.openRoles) {
            if (eachOpenRole.getText().contains(expectedRoleName)){
                actualNumberOfRole ++;
            }
        }
        Assert.assertEquals("verify number of open roles",expectedNumberOfRole,actualNumberOfRole);
    }

    @When("the user selects {string} from All departments dropdown")
    public void theUserSelectsFromAllDepartmentsDropdown(String title) {
        careersPage.cookiesAgreeButton.click();
        careersPage.allDepartmentsDropdown.click();
        for (WebElement department : careersPage.allDepartmentsList) {
            if (department.getText().equals(title)){
                department.click();
            }
        }
    }

    @Then("the user validates that each result contains {string} or {string} in the title")
    public void validateThatEachResultContainsOrInTheTitle(String expectedJobTitle1, String expectedJobTitle2) {
        for (WebElement openRole : careersPage.openRoles) {
            Assert.assertTrue("verify results titles", openRole.getText().contains(expectedJobTitle1) || openRole.getText().contains(expectedJobTitle2));
        }
    }

    @Then("the user validates that there is NOT {int} {string} role open")
    public void validateThatThereIsNOTRoleOpen(int unExpectedNumberOfRole, String expectedRoleName) {
        int actualNumberOfRole = 0;
        for (WebElement openRole : careersPage.openRoles) {
            if (openRole.getText().contains(expectedRoleName)){
                actualNumberOfRole ++;
            }
        }
        Assert.assertNotEquals("verify number of open roles", unExpectedNumberOfRole, actualNumberOfRole);
    }



}
