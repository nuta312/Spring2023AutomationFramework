package selenium.demo;
import com.digitalnomads.selenium.ui.driverFactory.Driver;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public abstract class BaseTest {
    public WebDriver driver;
    public ElementActions elementActions;

    public TextBoxPage textBoxPage;
    public PracticeFormPage practiceFormPage;


    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        practiceFormPage = new PracticeFormPage();
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
