package selenium.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ui.customizedForWebElement.ElementActions;
import ui.driversFactory.MainDriver;
import ui.pages.TextBox;

import java.time.Duration;

public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;
    public TextBox textBox;

    @BeforeClass
    public void setUpBrowser(){
        driver = MainDriver.getDriver();
        elementActions = new ElementActions();
        textBox = new TextBox();
    }
    @AfterClass
    public void tearDown(){
       MainDriver.closeDriver();
    }


}
