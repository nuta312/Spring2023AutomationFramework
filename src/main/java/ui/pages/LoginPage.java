package ui.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "userName")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(id = "newUser")
    public WebElement newUserButton;

    @FindBy(id = "name")
    public WebElement invalidUserNameOrPassword;


    @Step("Enter user Name")
    public LoginPage enterUserName(String username){
        elementActions.inputText(userNameField,username);
        return this;
    }
    @Step("Enter password")
    public LoginPage enterPassword(String password){
        elementActions.inputText(passwordField, password);
        return this;
    }

    @Step("click login button")
    public LoginPage clickLoginButton(){
        elementActions.scrollDown(loginButton);
        elementActions.clickTheButton(loginButton);
        return this;
    }

    @Step("Click new user button")
    public LoginPage clickNewUserButton(){
        elementActions.clickTheButton(newUserButton);
        return this;
    }


}
