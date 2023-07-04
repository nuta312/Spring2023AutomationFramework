package selenium.demo.nambaFoodHomeWork.HomeWorkJanyla;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        WebElementActions.scrollToElement(driver, foodSection);
        foodSection.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        js.executeScript("window.scrollBy(0, 200)");

        WebElement nationalFood = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/div/a[1]"));
        WebElementActions.scrollToElement(driver, nationalFood);
        nationalFood.click();

        WebElement cafe = driver.findElement(By.xpath("//div[@class='cafe-item--thumb']/img[@src='/image/125x125/148999.png']"));
        cafe.click();
        js.executeScript("window.scrollBy(0, 500)");
        WebElement food = driver.findElement(By.xpath("//div[@data-item-name='Закуска по-кавказски']//button"));
        food.click();

        WebElement basket = driver.findElement(By.xpath("//a[@class='basket tk-basket']"));
        basket.click();

        WebElement zakaz = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
        zakaz.click();

        WebElement name = driver.findElement(By.id("food_order_client_name"));
        name.sendKeys("JAN KI");

        WebElement address = driver.findElement(By.id("food_order_address"));
        address.sendKeys("AXUNBAEVA");

        WebElement doorCode = driver.findElement(By.id("food_order_door_code"));
        doorCode.sendKeys("10/5");

        WebElement number = driver.findElement(By.id("food_order_phone"));
        number.sendKeys("999999999");

        WebElement comments = driver.findElement(By.id("food_order_additional_info"));
        comments.sendKeys("Zlaya sobaka");

        WebElement money = driver.findElement(By.id("food_order_money_change"));
        money.sendKeys("1000");

        WebElement form = driver.findElement(By.xpath("//button[@class='order--btn order--access'][1]"));
        form.click();






    }
}