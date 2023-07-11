package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages;

import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectPage extends BasePage {
    @FindBy(id = "oldSelectMenu")
    public WebElement select;
}
