package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends BasePage {
    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = "p#name")
    public WebElement nameIsDisplay;

    @FindBy(css = "button#login")
    public WebElement loginBtn;



    @FindBy(id = "newUser")
    public WebElement newUserBtn;

    @FindBy(css = "input#firstname")
    public WebElement newfirstName;



    @FindBy(css = "input#lastname")
    public WebElement newlastName;


    @FindBy(css = "input#userName")
    public WebElement newuserName;


    @FindBy(css = "input#password")
    public WebElement newUserPassword;

    @FindBy(css = "label#recaptcha-anchor-label")
    public WebElement imnotrob;

    @FindBy(css = "p#name")
    public WebElement error;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
    public WebElement logout;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
    public WebElement deleteAccountBtn;

    @FindBy(xpath = "//div[@class='profile-wrapper']")
    public WebElement table;
public  LoginPages enteruserName(String username){
    elementActions.writeText(userName,username);
    return this;
}

    public  LoginPages enterPassword(String username){
        elementActions.writeText(password,username);
        return this;
    }

    public  LoginPages clickLoginBtn(){
       elementActions.clickTheButton(loginBtn);
        return this;
    }














}
