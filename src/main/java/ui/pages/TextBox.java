package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.driversFactory.MainDriver;

public class TextBox {

    public TextBox(){
        PageFactory.initElements(MainDriver.getDriver(), this);
    }

    @FindBy (id = "userName")
    public WebElement userFullName;

    @FindBy (id = "userEmail")
    public WebElement userEmail;

    @FindBy (id = "currentAddress")
    public WebElement currentAddress;

    @FindBy (id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy (id = "submit")
    public WebElement submit;
}
