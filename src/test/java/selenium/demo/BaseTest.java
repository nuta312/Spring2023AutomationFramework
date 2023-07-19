package selenium.demo;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ui.helper.ElementActions;
import ui.driversFactory.MainDriver;
import ui.pages.TextBox;

public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;

    @BeforeClass
    public void setUpBrowser(){
        driver = MainDriver.getDriver();
        elementActions = new ElementActions();

    }
    @AfterClass
    public void tearDown(){
//       MainDriver.closeDriver();
    }


}
