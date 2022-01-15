package com.Task_10Clouds.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersPage extends BasePage {

    @FindBy (xpath = "//h2[@class='job-offer__title']")
    public List<WebElement> openRoles;

    @FindBy (css = "button.select--desktop")
    public WebElement allDepartmentsDropdown;

    @FindBy (xpath = "(//select[@class='select--mobile'])[1]")
    public WebElement allDepartmentsDropdownSelectTag;




}
