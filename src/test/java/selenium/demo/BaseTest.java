package selenium.demo;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import ui.allure_report_listener.AllureReportListener;
import ui.config.FakeDataProvider;
import ui.helper.ElementActions;
import ui.driversFactory.MainDriver;



@Listeners(AllureReportListener.class)
public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;
    public FakeDataProvider fakeDataProvider;

    @BeforeClass
    public void setUpBrowser(){
        driver = MainDriver.getDriver();
        elementActions = new ElementActions();
        fakeDataProvider = new FakeDataProvider();

    }
    @AfterClass
    public void tearDown(){
       MainDriver.closeDriver();
    }


}
