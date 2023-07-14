package selenium.demo;


import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.helper.SelectHelper;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login.pages.LoginPages;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login.pages.ProfilePage;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages.SelectPage;

public abstract class BaseTest {
    public LoginPages loginPages;
    public PracticeFormPage practiceFormPage;
    public WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textBoxPage;
    public SelectHelper selectHelper;
    public SelectPage selectPage;
public ProfilePage profilePage;
    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
loginPages= new LoginPages();
        practiceFormPage = new PracticeFormPage();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        selectHelper = new SelectHelper();
        selectPage = new SelectPage();
profilePage = new ProfilePage();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }


}
