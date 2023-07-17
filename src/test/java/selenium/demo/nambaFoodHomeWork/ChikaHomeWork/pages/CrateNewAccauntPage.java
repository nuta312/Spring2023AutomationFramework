package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages;

import com.digitalnomads.selenium.ui.pages.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.helper.ApgredeMethod;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.user.User;


public class CrateNewAccauntPage  extends BasePage {

    public ApgredeMethod apgredeMethod = new ApgredeMethod();
    @FindBy(css = "input#firstname")
    public WebElement firstName;

    @FindBy(css = "input#lastname")
    public WebElement lastName;

    @FindBy(css = "input#email_address")
    public WebElement emailAddress;

    @FindBy(css = "input#password")
    public WebElement password;

    @FindBy(css = "input#password-confirmation")
    public WebElement passwordConfirmation;

    @FindBy(css = "button.action.submit.primary")
    public WebElement submit;

    public  void writeAll(User user){
        apgredeMethod.writeText(firstName,user.getUserFirstName())
                .writeText(lastName,user.getUserLastName())
                .writeText(emailAddress,user.getUserEmail())
                .writeText(password,user.getUserPassword())
                .writeText(passwordConfirmation,user.getUserPassword())
                .waitAndMoveClick(submit);
    }
}
