package selenium.demo.nambaFoodHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NamFoodAlina {
    @Test
    public void NambaFood() {

        WebDriverManager.chromedriver().setup(); // setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // waiting the elements in page
        driver.get("https://nambafood.kg/?");

        WebElement food = driver.findElement(By.linkText("Еда"));
        food.click();

       WebElement dessert = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/div/a[11]/div[1]/img"));
       dessert .click();

       WebElement cafe = driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div[3]/a[3]/div[2]/div[1]/div"));
        cafe.click();

        WebElement order = driver.findElement(By.xpath("//*[@id=\"188\"]/div/div[15]/div[2]/button"));
       order.click();

       WebElement cart=driver.findElement(By.xpath("//*[@id=\"cart\"]"));
       cart.click();

        WebElement confirm= driver.findElement(By.xpath("/html/body/main/section/div[1]/div[5]/div[11]/a/button"));
        confirm.click();

       WebElement inputName=driver.findElement(By.id("food_order_client_name"));
       inputName.sendKeys("Alina");

       WebElement inputAddress=driver.findElement(By.xpath("//*[@id=\"food_order_address\"]"));
       inputAddress.sendKeys("Akhunbaeva 98");

       WebElement inputFLat=driver.findElement(By.xpath("//*[@id=\"food_order_door_code\"]"));
       inputFLat.sendKeys("45");

        WebElement change=driver.findElement(By.xpath("//*[@id=\"food_order_money_change\"]"));
        change.sendKeys("1000");

        WebElement finish=driver.findElement(By.xpath("//*[@id=\"payment_cash\"]"));
        finish.click();

    }
    }
