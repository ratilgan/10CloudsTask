package com.Task_10Clouds.pages;

import com.Task_10Clouds.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(linkText = "Careers")
    public WebElement careersTab;




















}
