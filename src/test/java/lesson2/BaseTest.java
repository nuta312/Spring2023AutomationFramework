package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public abstract class BaseTest {
 public WebDriver driver;
@BeforeClass
 public void setUpBrowser(){
     WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.manage().window().maximize();

 }
@AfterClass
    public void tearDown(){
    driver.close();
    driver.quit();
    }


}
