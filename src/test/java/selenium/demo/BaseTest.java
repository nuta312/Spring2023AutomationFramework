package selenium.demo;


import com.digitalnomads.driverFactory.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

    public abstract class BaseTest {
        public WebDriver driver;

        @BeforeClass
        public void setUpBrowser() {
            driver = Driver.getDriver();
        }

        @AfterClass
        public void tearDown() {
            Driver.closeDriver();
        }

    }

