package selenium.demo.lesson2;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.InstagramLoginPage;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import com.digitalnomads.selenium.ui.pages.SelectMenuPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textBoxPage;
    public InstagramLoginPage instagramLoginPage;
    public PracticeFormPage practiceFormPage;
    public SelectMenuPage selectMenuPage;
    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        instagramLoginPage = new InstagramLoginPage();
        practiceFormPage = new PracticeFormPage();
        selectMenuPage = new SelectMenuPage();

    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
