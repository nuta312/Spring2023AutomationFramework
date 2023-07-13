package selenium.demo.nambaFoodHomeWork.aidinHomeWork.login;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(id = "name")
    public WebElement messageName;

    public void logIn(User user){
        elementActions.writeText(userName, user.getUserFullName()).writeText(password,user.getPassword())
                .clickTheButton(loginBtn);
    }

}
