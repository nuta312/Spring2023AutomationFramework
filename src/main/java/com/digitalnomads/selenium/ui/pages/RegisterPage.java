package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{



        @FindBy(id = "firstname")
        public WebElement registerUserFirstNameField;

        @FindBy(id = "lastname")
        public WebElement registerUserLastNameField;

        @FindBy(id = "userName")
        public WebElement registerUserNameField;

        @FindBy(id = "password")
        public WebElement registerUserPasswordField;

        @FindBy(xpath = "//iframe[@role = 'presentation']")
        public WebElement captchaBtn;

        @FindBy(id = "register")
        public WebElement registerBtn;
}
