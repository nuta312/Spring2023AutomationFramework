package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.config.ConfigReader;
import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
Faker faker = new Faker();
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public ElementActions elementActions = new ElementActions();



}
