package selenium.demo.nambaFoodHomeWork.aidinHomeWork.users;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.models.User;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.demo.BaseTest;

public class LoginPage {
    ElementActions elementActions = new ElementActions();
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login")
    public WebElement loginBtn;

    @FindBy(id = "newUser")
    public WebElement newUser;

    public void logIn(User user){
        elementActions.writeText(userName, user.getUserFullName()).writeText(password,user.getPassword())
                .clickTheButton(loginBtn);
    }

}
