package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{
    @FindBy(xpath = "//div[text()='Profile']")
    public WebElement profileTitle;


}
