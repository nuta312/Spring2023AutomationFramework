package ui.pages;

import org.openqa.selenium.support.PageFactory;
import ui.driversFactory.MainDriver;
import ui.helper.ElementActions;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(MainDriver.getDriver(), this);
    }

    public ElementActions elementActions = new ElementActions();


}
