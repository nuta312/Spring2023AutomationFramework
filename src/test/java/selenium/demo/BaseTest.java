package selenium.demo;
import com.digitalnomads.selenium.ui.driverFactory.Driver;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import com.digitalnomads.selenium.ui.webElementActions.ElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public abstract class BaseTest {
    public WebDriver driver;
    public ElementActions elementActions;

    public TextBoxPage textBoxPage;


    @BeforeClass
    public void setUpBrowser() {
        driver=Driver.getDriver();
       elementActions= new ElementActions();
       textBoxPage = new TextBoxPage();
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
