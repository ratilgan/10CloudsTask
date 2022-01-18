package com.Task_10Clouds.pages;

import com.Task_10Clouds.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }



    public void navigateToTab(String tabName){
        Driver.get().findElement(By.linkText(tabName)).click();
    }




















}
