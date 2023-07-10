package selenium.demo.lesson2;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.InstagramLoginPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textBoxPage;
    public InstagramLoginPage instagramLoginPage;

    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        instagramLoginPage = new InstagramLoginPage();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
