package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    public TextBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName")
    public WebElement userFullName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;
}
