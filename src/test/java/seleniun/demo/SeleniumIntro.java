package seleniun.demo;

import com.digitalnomads.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumIntro {
    @Test
    public void textBoxTest() {


        WebDriverManager.chromedriver().setup(); //setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();       // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //waiting the elements
        driver.get("https://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("Hugo Lone");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("Hugo.Lone@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("wall street 11");


        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Baitik Baatyra");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        WebElementActions.scrollToElement(driver, submitBtn);
        submitBtn.click();

        WebElement resultName = driver.findElement(By.id("name"));
        Assert.assertEquals(resultName.getText(), "Name:Hugo Lone");

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains("Email:Hugo.Lone@gmail.com"));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains("wall street 11"));


        WebElement resultPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains("Baitik Baatyra"));



    }
}