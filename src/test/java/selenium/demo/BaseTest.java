package selenium.demo;


import com.digitalnomads.selenium.ui.helper.WebElementActions;
import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    public WebDriver driver;
    public WebElementActions elementActions;
    public TextBoxPage textBoxPage;


    @BeforeClass
    public void setUpBrowser(){
        driver = Driver.getDriver();
        elementActions = new WebElementActions();
        textBoxPage = new TextBoxPage();

    }
    @AfterClass
    public void tearDown(){
      Driver.closeDriver();
    }


}
