package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.driverFactory.Driver;
import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BasePage {
    @FindBy(id="userName")
    public WebElement userFullName;

    @FindBy(id="userEmail")
    public WebElement userEmail;

    @FindBy(id="currentAddress")
    public WebElement userCurrentAddress;

    @FindBy (id="permanentAddress")
    public WebElement userPermanentAddress;

    @FindBy(id="submit")
    public WebElement submit;
    @FindBy(id = "name")
    public WebElement resultFullName;

    @FindBy(id = "email")
    public WebElement resultEmail;

    @FindBy(xpath = "//p[@id=\"currentAddress\"]")
    public WebElement resultCurrentAddress;

    @FindBy(xpath = "//p[@id=\"permanentAddress\"]")
    public WebElement resultPermanentAddress;

    public TextBoxPage fillUpTheForm(User userDetails) {
        elementActions.writeText(userFullName, userDetails.getFullName())
                .writeText(userEmail, userDetails.getUserEmail())
                .writeText(userCurrentAddress, userDetails.getUserCurrentAddress())
                .writeText(userPermanentAddress, userDetails.getUserPermanentAddress())
                .scrollToElement(submit)
                .clickTheButton(submit);
        return this;


    }



}
