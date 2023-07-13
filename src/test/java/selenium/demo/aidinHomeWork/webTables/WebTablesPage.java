package selenium.demo.aidinHomeWork.webTables;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage extends BasePage {
    public WebTablesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "delete-record-1")
    public WebElement delete1;

    @FindBy(id = "delete-record-2")
    public WebElement delete2;

    @FindBy(id = "delete-record-3")
    public WebElement delete3;

    @FindBy(id = "addNewRecordButton")
    public WebElement addUserBtn;

    public void deleteAllUsers(){
        driver.get("https://demoqa.com/webtables");
        elementActions.clickTheButton(delete1).clickTheButton(delete2).clickTheButton(delete3);
    }
}
