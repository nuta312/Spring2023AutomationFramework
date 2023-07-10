package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstagramLoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='username']")
    public WebElement phoneNumUserNameOrEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='_acan _acap _acas _aj1-']")
    public WebElement loginBtn;


    public InstagramLoginPage login(User userDetails) {
        elementActions.writeText(phoneNumUserNameOrEmail, userDetails.getUserEmail())
                .writeText(password, userDetails.getUserPassword())
                .clickTheButton(loginBtn);
        return this;
    }

}
