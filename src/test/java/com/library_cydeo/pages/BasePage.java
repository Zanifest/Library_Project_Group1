package com.library_cydeo.pages;

import com.library_cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriverPool(), this);
    }

    @FindBy (xpath = "//input[@id='inputEmail']")
    public WebElement emailInputBox;

    @FindBy (xpath = "//input[@id='inputPassword']")
    public WebElement passwordInputBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;

}
