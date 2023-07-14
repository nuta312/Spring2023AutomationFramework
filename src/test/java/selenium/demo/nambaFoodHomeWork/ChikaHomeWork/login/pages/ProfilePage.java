package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login.pages;

import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    @FindBy(xpath = "//div[text()='Profile']")
    public WebElement element;
}
