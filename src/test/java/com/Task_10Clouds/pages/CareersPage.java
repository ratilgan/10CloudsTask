package com.Task_10Clouds.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersPage extends BasePage {

    @FindBy (xpath = "//h2[@class='job-offer__title']")
    public List<WebElement> openRoles;

    @FindBy(xpath = "//button[@class='Buttons__StyledButton-ellota-0 gKrBxG button']")
    public WebElement cookiesAgreeButton;

    @FindBy (css = "div[class^='Select__StyledSelect']")
    public WebElement allDepartmentsDropdown;

    @FindBy (xpath = "(//ul)[3]/li")
    public List<WebElement> allDepartmentsList;




}
