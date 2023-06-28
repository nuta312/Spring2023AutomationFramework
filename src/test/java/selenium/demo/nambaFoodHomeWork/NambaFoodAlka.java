package selenium.demo.nambaFoodHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFoodAlka {

    @Test
    public void nambaFoodTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://nambafood.kg/");

        WebElement food = driver.findElement(By.xpath("//a[@class=\"home--cat-item food\"]"));
        food.click();

        WebElement turkishKitchen = driver.findElement(By.xpath("//a[@href=\"/cafe/turietskaia-kukhnia\"]"));
        WebElementActions.scrollToElement(driver,turkishKitchen);
        turkishKitchen.click();

        WebElement usta = driver.findElement(By.xpath("//a[@href=\"/usta-turkish-restaurant\"]"));
        usta.click();

        WebElement tavuk = driver.findElement(By.xpath
                ("//div[@data-item-name=\"Тавук стейк\"]//button"));
        tavuk.click();

        WebElement steak = driver.findElement(By.xpath
                ("//div[@data-item-name=\"Стейк портерхаус\"]//button"));
        steak.click();

        Thread.sleep(2000);
        WebElement bucket = driver.findElement(By.xpath("//a[@onclick=\"ga('send', 'pageview', '/basket')\"]"));
        bucket.click();

        WebElement makeOrderBtn = driver.findElement(By.xpath("//button[@class=\"order--btn order--access\"]"));
        makeOrderBtn.click();

        WebElement userName = driver.findElement(By.id("food_order_client_name"));
        userName.sendKeys("Alka");

        WebElement userAddress = driver.findElement(By.id("food_order_address"));
        userAddress.sendKeys("Орозбекова 69");

        WebElement userFloor = driver.findElement(By.id("food_order_door_code"));
        userFloor.sendKeys("15/4");

        WebElement userPhone = driver.findElement(By.id("food_order_phone"));
        userPhone.sendKeys("0555353535");

        WebElement userMoney = driver.findElement(By.id("food_order_money_change"));
        userMoney.sendKeys("4000");

        WebElement orderBtn = driver.findElement(By.id("payment_cash"));
        orderBtn.click();

        WebElement resultName = driver.findElement
                (By.xpath("//span[text()='Ваше имя:']//following-sibling::span"));
        Assert.assertTrue(resultName.getText().contains("Alka"));

        WebElement resultAddress = driver.findElement
                (By.xpath("//span[text()='Адрес доставки:']//following-sibling::span"));
        Assert.assertTrue(resultAddress.getText().contains("Орозбекова 69"));

        WebElement resultFloor = driver.findElement
                (By.xpath("//span[text()='Квартира/Этаж:']//following-sibling::span"));
        Assert.assertTrue(resultFloor.getText().contains("15/4"));

        WebElement resultPhone = driver.findElement
                (By.xpath("//span[text()='Телефон:']//following-sibling::span"));
        Assert.assertTrue(resultPhone.getText().contains("555353535"));

        WebElement resultMoney = driver.findElement
                (By.xpath("//span[text()='Сдача с:']//following-sibling::span"));
        Assert.assertTrue(resultMoney.getText().contains("4000"));

    }
}
