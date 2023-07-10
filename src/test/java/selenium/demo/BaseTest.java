package selenium.demo;


import com.digitalnomads.selenium.ui.config.FakeDataProvider;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.models.Student;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import com.digitalnomads.selenium.ui.pages.SubmitPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textBoxPage;
    public FakeDataProvider fakeDataProvider;
    public SubmitPage submitPage;
    public PracticeFormPage practiceFormPage;


    @BeforeClass
    public void setUpBrowser(){
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        fakeDataProvider = new FakeDataProvider();
        submitPage = new SubmitPage();
        practiceFormPage = new PracticeFormPage();
    }
    @AfterClass
    public void tearDown(){
      Driver.closeDriver();
    }


}
