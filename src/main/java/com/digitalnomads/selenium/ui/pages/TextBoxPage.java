package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {


    @FindBy(id = "userName")
    public WebElement userFullName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(xpath = "//p[@id='name']")
    public WebElement resultName;

    @FindBy(xpath = "//p[@id='email']")
    public WebElement resultEmail;

    @FindBy(xpath = "//p[@id='currentAddress']")
    public WebElement resultCurrentAddress;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement resultPermanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitBtn;

    public TextBoxPage fillUpTheForm(User userDetails) {
        elementActions.writeText(userFullName,userDetails.getUserFullName())
                .writeText(userEmail,userDetails.getUserEmail())
                .writeText(currentAddress,userDetails.getUserCurrentAddress())
                .writeText(permanentAddress,userDetails.getUserPermanentAddress()).scrollToElement(submitBtn)
                .clickTheButton(submitBtn);
        return this;

    }

}
