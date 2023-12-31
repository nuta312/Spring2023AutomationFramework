package selenium.demo.homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTestHome {

   public WebDriver driver;

   @BeforeClass

    public void setUpBrowser(){
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.manage().window().maximize();
   }

   @AfterClass

    public void tearDown(){
       driver.close();
       driver.quit();
   }
}
