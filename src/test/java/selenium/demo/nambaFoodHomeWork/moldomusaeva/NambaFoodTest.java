package selenium.demo.nambaFoodHomeWork.moldomusaeva;

import com.digitalnomads.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFoodTest {

    @Test
    public void NambaFoodTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://nambafood.kg/");

        WebElement foodTab = driver.findElement(By.xpath("//li//a[normalize-space()='Еда']"));
        foodTab.click();

        WebElement nationalFood = driver.findElement(By.xpath("//div[@class='cat-item--prev']/img"));
        nationalFood.click();

        WebElement faizaRestaurant= driver.findElement(By.xpath("//a[@class='cafe-item ']"));
        faizaRestaurant.click();

        WebElement foodMampar = driver.findElement(By.xpath("//*[@id=\"305\"]/div/div[3]/div[2]/button"));
        foodMampar.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement basket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cart']/a")));
        basket.click();

        WebElement checkout = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
        checkout.click();

        WebElement userName = driver.findElement(By.id("food_order_client_name"));
        userName.sendKeys("Emirhan Baatyr");

        WebElement userAddress = driver.findElement(By.id("food_order_address"));
        userAddress.sendKeys("Chodronova 13");

        WebElement userPhoneNumber = driver.findElement(By.id("food_order_phone"));
        userPhoneNumber.sendKeys("0555555555");

        WebElement cashPay = driver.findElement(By.xpath("(//div[@class='input--wrap'])[5]/input"));

        WebElementActions.scrollToElement(driver,cashPay);

        cashPay.sendKeys("1000");
        WebElement order = driver.findElement(By.xpath("(//div[@class='order--actions'])[3]/button"));
        order.click();






    }




}
