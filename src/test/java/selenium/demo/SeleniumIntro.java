package selenium.demo;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.http.WebSocket;
import java.time.Duration;

public class SeleniumIntro {
        @Test
        public void Box(){
        WebDriverManager.chromedriver().setup(); // доступ к браузеру
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // на весь экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // ждать какое то время

        driver.get("https://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.id("userName")); // найти поле для ввода
        userName.sendKeys("James Bond");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("james.bond@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Walck Street 312");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Trum tower");

        WebElement submitBtn = driver.findElement(By.id("submit"));

        WebElementActions.scrollToElement(driver,submitBtn);
        submitBtn.click();

        WebElement resNname = driver.findElement(By.id("name"));
        Assert.assertTrue(resNname.getText().contains("James Bond"));

        WebElement resEmail = driver.findElement(By.id("email"));
        Assert.assertEquals(resEmail.getText(),"Email:james.bond@gmail.com");

        WebElement resCurrentAddres = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertEquals(resCurrentAddres.getText(), "Current Address :Walck Street 312");

        WebElement resPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertEquals(resPermanentAddress.getText(),"Permananet Address :Trum tower");

        driver.quit();
    }
}
