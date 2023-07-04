package selenium.demo;
import com.digitalnomads.selenium.ui.driverFactory.Driver;
import com.digitalnomads.selenium.ui.webElementActions.ElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;


    @BeforeClass
    public void setUpBrowser(){
        driver = Driver.getDriver();
        elementActions = new ElementActions();


    }
    @AfterClass
    public void tearDown(){
       Driver.closeDriver();
    }


}
