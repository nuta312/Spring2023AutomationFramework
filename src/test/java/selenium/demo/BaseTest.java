package selenium.demo;
import com.digitalnomads.selenium.ui.driverFactory.Driver;
import com.digitalnomads.selenium.ui.pages.LoginPage;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import com.digitalnomads.selenium.ui.pages.RegisterPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import selenium.demo.login.LoginTest;


public abstract class BaseTest {
    public WebDriver driver;
    public ElementActions elementActions;

    public TextBoxPage textBoxPage;
    public PracticeFormPage practiceFormPage;
    public LoginTest loginTest;
    public LoginPage loginPage;
    public RegisterPage registerPage;



    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        practiceFormPage = new PracticeFormPage();
        loginTest = new LoginTest();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();

    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
