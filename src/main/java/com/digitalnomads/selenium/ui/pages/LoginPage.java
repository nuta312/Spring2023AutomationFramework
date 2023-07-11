package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "userName")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement userPasswordField;

    @FindBy(id = "login")
    public WebElement loginBtn;




}
