package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginPage {

    ElementActions elementActions = new ElementActions();

    public InstagramLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@aria-label='Phone number, username, or email']")
    public WebElement phoneNumUsernameOrEmail;
    @FindBy(xpath = "//input[@aria-label='Password']")
    public WebElement password;
    @FindBy(xpath = "//div[text()='Log in']/..")
    public WebElement loginBtn;
    public InstagramLoginPage login(String phone, String pass) {
        elementActions.writeText(phoneNumUsernameOrEmail, phone)
                .writeText(password, pass)
                .clickTheButton(loginBtn);
        return this;
    }
}
