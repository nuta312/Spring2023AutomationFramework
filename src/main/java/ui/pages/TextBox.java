package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.model.User;

public class TextBox extends BasePage{


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

    @FindBy(xpath = "//p[@id='name']")
    public WebElement resultFullName;

    @FindBy(xpath = "//p[@id='email']")
    public WebElement resultEmail;

    @FindBy(xpath = "//p[@id='currentAddress']")
    public WebElement resultCurrentAddress;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement resultPermanentAddress;


    public TextBox fillUpTheTextBox(User userDetails){
        elementActions.inputText(userFullName, userDetails.getUserFullName())
                .inputText(userEmail, userDetails.getUserEmail())
                .inputText(currentAddress, userDetails.getUserCurrentAddress())
                .inputText(permanentAddress, userDetails.getUserPermanentAddress())
                .scrollDownToClick(submit);
        return this;
    }
}
