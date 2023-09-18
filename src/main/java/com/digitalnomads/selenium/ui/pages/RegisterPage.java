package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;
    @FindBy(id = "userName")
    public WebElement userName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//div[@class=\"recaptcha-checkbox-checkmark\"]")
    public WebElement captchaCheckBox;
    @FindBy(id = "register")
    public WebElement registerBtn;
    @FindBy(id = "gotologin")
    public WebElement backToLoginBtn;


}
