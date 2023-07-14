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

    @FindBy(id="name")
    public WebElement errorMessage;

public   LoginPage enterUsername(String username){
    elementActions.writeText(userNameField, username);
    return this;
}
public  LoginPage enterPassword(String password){
    elementActions.writeText(userPasswordField, password);
    return this;
}
public LoginPage clickLogBnt(){
    elementActions.clickTheButton(loginBtn);
    return this;

}

}
