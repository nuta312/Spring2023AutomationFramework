package selenium.demo.nambaFoodHomeWork.HomeWorkJanyla;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ContactUsJanyla {
    public WebDriver driver;

    @BeforeClass
    public void setUpBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
        @Test
        public void testWeb(){
            driver.get("https://nambafood.kg/");
            String contactUs = driver.findElement(By.linkText("/html/body/main/section[8]/div[1]/h3[2]")).getText();
            System.out.println(contactUs);
        }


    }
