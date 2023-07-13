package selenium.demo;


import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import selenium.demo.nambaFoodHomeWork.aidinHomeWork.login.LoginPage;
import selenium.demo.nambaFoodHomeWork.aidinHomeWork.login.ProfilePage;
import selenium.demo.nambaFoodHomeWork.aidinHomeWork.login.RegistrePage;

public abstract class BaseTest {
    public ProfilePage profilePage = new ProfilePage();
    public RegistrePage registrePage = new RegistrePage();
    public LoginPage loginPage = new LoginPage();
    public  PracticeFormPage practiceFormPage;

    public WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textBoxPage;
    public Faker faker = new Faker();

    @BeforeClass
    public void setUpBrowser(){
        driver = Driver.getDriver();

        practiceFormPage = new PracticeFormPage();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();

    }
    @AfterClass
    public void tearDown(){
      Driver.closeDriver();
    }


}
