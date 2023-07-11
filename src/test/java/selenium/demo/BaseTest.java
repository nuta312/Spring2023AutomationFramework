package selenium.demo;


import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages.SelectHelper;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages.SelectPage;

public abstract class BaseTest {
    public PracticeFormPage practiceFormPage;
    public WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textBoxPage;
    public SelectHelper selectHelper;
    public SelectPage selectPage;

    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();

        practiceFormPage = new PracticeFormPage();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        selectHelper = new SelectHelper();
        selectPage = new SelectPage();

    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }


}
