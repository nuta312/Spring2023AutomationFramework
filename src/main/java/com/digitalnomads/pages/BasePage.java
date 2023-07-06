package com.digitalnomads.pages;

import com.digitalnomads.driverFactory.Driver;
import com.digitalnomads.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    public ElementActions elementActions = new ElementActions();


}



