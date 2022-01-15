package com.Task_10Clouds.step_definitions;

import com.Task_10Clouds.pages.CareersPage;
import com.Task_10Clouds.utilities.BrowserUtils;
import com.Task_10Clouds.utilities.ConfigurationReader;
import com.Task_10Clouds.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenQARolesStepDefs {

    CareersPage careersPage = new CareersPage();

    @Given("the user navigates to 10clouds home page")
    public void the_user_navigates_to_10clouds_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Given("clicks on {string} tab")
    public void clicks_on_tab(String string) {
        careersPage.careersTab.click();
    }

    @Then("validate that there is {int} {string} role open")
    public void validate_that_there_is_role_open(Integer expectedNumberOfRole, String expectedRoleName) {
       Integer actualNumberOfRole = 0;
        for (WebElement openRole : careersPage.openRoles) {
            if (openRole.getText().contains(expectedRoleName)){
                actualNumberOfRole ++;
            }
        }
        Assert.assertEquals("verify number of open roles",expectedNumberOfRole,actualNumberOfRole);
    }

    @When("the user selects {string} from All departments dropdown")
    public void theUserSelectsFromAllDepartmentsDropdown(String title) {

        Actions action = new Actions(Driver.get());
        action.moveToElement(careersPage.allDepartmentsDropdownSelectTag).doubleClick().build().perform();




    }

    @Then("validate that each result contains {string} or {string} in the title")
    public void validateThatEachResultContainsOrInTheTitle(String expectedJobTitle1, String expectedJobTitle2) {
        for (WebElement openRole : careersPage.openRoles) {
            Assert.assertTrue(openRole.getText().contains(expectedJobTitle1) || openRole.getText().contains(expectedJobTitle2));
        }
    }

}