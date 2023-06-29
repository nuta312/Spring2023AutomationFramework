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
    public void textBoxTest() {

        WebDriverManager.chromedriver().setup();// setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("James Bond");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("james.bond@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Wall Street 221");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Trump Tower");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        WebElementActions.scrollToElement(driver, submitBtn);
        submitBtn.click();

        WebElement resultName = driver.findElement(By.id("name"));
        Assert.assertTrue(resultName.getText().contains("James Bond"));

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains("james.bond@gmail.com"));

        WebElement resultcurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultcurrentAddress.getText().contains("Wall Street 221"));

        WebElement resultpermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultpermanentAddress.getText().contains("Trump Tower"));



    }
}
