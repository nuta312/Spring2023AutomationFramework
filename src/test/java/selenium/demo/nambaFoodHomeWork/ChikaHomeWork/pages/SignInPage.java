package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages;

import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    @FindBy (id ="email" )
    public WebElement email;

    @FindBy (id ="pass" )
    public WebElement pasword;

    @FindBy (id ="send2" )
    public WebElement submit;

    @FindBy (xpath ="//div[@class='page messages']" )
    public WebElement errorMessage;


}
