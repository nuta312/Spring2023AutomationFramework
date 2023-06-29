package selenium.demo.nambaFoodHomeWork.syrgak;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFoodTestSyrgak {
    @Test
    public void testWeb(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nambafood.kg");
        WebElement foodTab = driver.findElement(By.xpath("//a[@class=\"home--cat-item food\"]"));
        foodTab.click();
        WebElement sushiWeb = driver.findElement(By.xpath("//a[@href=\"/cafe/sushi\"]//div[@class=\"cat-item--title\"]"));
        sushiWeb.click();
        WebElement sushiDvePalochki = driver.findElement(By.xpath("//a[@href=\"/dve-palochki\"]"));
        sushiDvePalochki.click();
        WebElement sushiTobiko = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[37]"));
        sushiTobiko.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement orderBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn menu-link']/a")));
        orderBtn.click();
        WebElement makeOrder = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
        makeOrder.click();
        WebElement writeName = driver.findElement(By.id("food_order_client_name"));
        writeName.sendKeys("Jakshylykov Salavat");
        WebElement writeAddress = driver.findElement(By.id("food_order_address"));
        writeAddress.sendKeys("Xxx 141");
        WebElement additionalInfo = driver.findElement(By.id("food_order_additional_info"));
        additionalInfo.sendKeys("Позвонить перед приездом");
        WebElement cashMoney = driver.findElement(By.xpath(" //li[@class='resp-tab-item resp-tab-active']"));
        cashMoney.click();
        WebElement exchangeMoney = driver.findElement(By.id("food_order_money_change"));
        exchangeMoney.sendKeys("1000");
        WebElement takeOrder = driver.findElement(By.id("payment_cash"));
        takeOrder.click();
















    }

}
