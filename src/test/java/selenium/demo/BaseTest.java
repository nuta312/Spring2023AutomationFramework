package selenium.demo;


import com.digitalnomads.selenium.AllureReportListener;
import com.digitalnomads.selenium.ui.config.FakeDataProvider;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(AllureReportListener.class)

public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textBoxPage;
    public FakeDataProvider fakeDataProvider;
    public SubmitPage submitPage;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public PracticeFormPage practiceFormPage;


    @BeforeClass
    public void setUpBrowser(){
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        fakeDataProvider = new FakeDataProvider();
        submitPage = new SubmitPage();
        practiceFormPage = new PracticeFormPage();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
    }
    @AfterClass
    public void tearDown(){
      Driver.closeDriver();
    }


}
