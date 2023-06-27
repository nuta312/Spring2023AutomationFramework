package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NambaFoodJanyla {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // setup chrome driver
                WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // waiting the elements in page
        driver.get("https://nambafood.kg/");

        WebElement foodSection = driver.findElement(By.linkText("Еда"));




    }
}