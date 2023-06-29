package selenium.demo.nambaFoodHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NambaFoodHomeWorkAltynai {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://nambafood.kg/");
        WebElement foodSection = driver.findElement(By.linkText("Еда"));
        WebElementActions.scrollToElement(driver, foodSection);
        foodSection.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        js.executeScript("window.scrollBy(0, 200)");
        WebElement option = driver.findElement(By.linkText("ВСЕ ЗАВЕДЕНИЯ"));
        option.click();
        WebElement cuisine = driver.findElement(By.linkText("Европейская кухня"));
        cuisine.click();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 500)");
        WebElement cafe = driver.findElement(By.xpath("(//div[@class='cafe-item--thumb']/img)[2]"));
        cafe.click();
        WebElement order = driver.findElement(By.xpath("//div[@data-item-name='Английский завтрак']//button"));
        order.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement basket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='basket tk-basket']")));
        basket.click();
        js1.executeScript("window.scrollBy(0, 500)");
        WebElement makeOrder= driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
        makeOrder.click();
        WebElement userName= driver.findElement(By.id("food_order_client_name"));
        userName.sendKeys("Altynai Tulenbaeva");
        WebElement address= driver.findElement(By.id("food_order_address"));
        address.sendKeys("XXXX");
        WebElement doorCode= driver.findElement(By.id("food_order_door_code"));
        doorCode.sendKeys("XX");
        WebElement info= driver.findElement(By.id("food_order_additional_info"));
        info.sendKeys("На звонок не нажимать!");
        WebElement cashPay = driver.findElement(By.xpath("(//div[@class='input--wrap'])[5]/input"));
        WebElementActions.scrollToElement(driver,cashPay);
        cashPay.sendKeys("1000");
        WebElement finalOrder = driver.findElement(By.xpath("(//div[@class='order--actions'])[3]/button"));
        finalOrder.click();

    }

}



