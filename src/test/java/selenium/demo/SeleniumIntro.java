package selenium.demo;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.time.Duration;
public class SeleniumIntro {
    @Test
            public void textBoxTest(){
        WebDriverManager.chromedriver().setup(); //setup chrome driver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//waiting the elements paige
        driver.get("https://demoqa.com/text-box");
        WebElement userName= driver.findElement(By.id("userName"));
        userName.sendKeys("Altynai Tulenbaeva ");
        WebElement userEmail=driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("tulenbaevaltyn@gmail.com");
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Ulan");
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Ulan");
        WebElement submitBtn=driver.findElement(By.id("submit"));
        submitBtn.click();
        WebElementActions.scrollToElement(driver, submitBtn);
        WebElement resultName= driver.findElement(By.id("name"));
        Assert.assertTrue(resultName.getText().contains("Altynai Tulenbaeva"));
        WebElement resultEmail= driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains("tulenbaevaltyn@gmail.com"));
        WebElement resultCurrentAddress=driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains("Ulan"));
        WebElement resultPermanentAddress=driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains("Ulan"));
    }
}
