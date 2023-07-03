package codingbat.aidin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NambaOrder {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup(); //setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();     // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //waiting the elements
        driver.get("https://nambafood.kg/");

        WebElement userName = driver.findElement(By.cssSelector("home--cat-item food"));
        userName.sendKeys("Hugo Lone");
    }
}
