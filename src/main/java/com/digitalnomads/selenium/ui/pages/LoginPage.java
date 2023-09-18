package com.digitalnomads.selenium.ui.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "userName")
    public WebElement userNameField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "login")
    public WebElement loginBtn;
    @FindBy(id = "newUser")
    public WebElement newUserBtn;

    @FindBy(id = "name")
    public WebElement errorMessage;

    @Step("Enter user name")
    public LoginPage enterUserName(String userName) {
        elementActions.writeText(userNameField, userName);
        return this;
    }

    public LoginPage enterPassword(String userPassword) {
        elementActions.writeText(passwordField, userPassword);
        return this;
    }

    public LoginPage clickLogin() {
        elementActions.clickTheButton(loginBtn);
        return this;
    }


}
