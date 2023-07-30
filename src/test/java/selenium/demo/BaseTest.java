package selenium.demo;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import ui.allure_report_listener.AllureReportListener;
import ui.config.FakeDataProvider;
import ui.helper.ElementActions;
import ui.driversFactory.MainDriver;
import ui.pages.LoginPage;
import ui.pages.ProfilePage;


@Listeners(AllureReportListener.class)
public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;
    public FakeDataProvider fakeDataProvider;
    public LoginPage loginPage;
    public ProfilePage profilePage;

    @BeforeClass
    public void setUpBrowser(){
        driver = MainDriver.getDriver();
        elementActions = new ElementActions();
        fakeDataProvider = new FakeDataProvider();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();

    }
    @AfterClass
    public void tearDown(){
       MainDriver.closeDriver();
    }


}
