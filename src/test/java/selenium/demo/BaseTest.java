package selenium.demo;


import com.digitalnomads.driverFactory.Driver;
import com.digitalnomads.pages.TextBoxPage;
import com.digitalnomads.helper.ElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textbox;

    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        textbox = new TextBoxPage();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();

    }



}

