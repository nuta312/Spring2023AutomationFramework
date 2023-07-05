package selenium.demo.demo;

import com.digitalnomads.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.time.Duration;

public class Demo1 extends BaseTest {
    @Test
    public void textBoxTest() {

//        WebDriverManager.chromedriver().setup(); // setup chrome driver
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize(); // to maximize the window
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // waiting the elements in page
        driver.get("https://demoqa.com/text-box");
        WebElement userName = driver.findElement(By.id("userName"));
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn = driver.findElement(By.id("submit"));
        WebElementActions.scrollToElement(driver, submitBtn);

        elementActions.writeText(textBoxPage.userFullName, "james Bond")
                .writeText(textBoxPage.userEmail, "aika@gmail.com")
                .writeText(textBoxPage.currentAddress, "Wall Street")
                .writeText(textBoxPage.permanentAddress, "Some address");


    }
}

