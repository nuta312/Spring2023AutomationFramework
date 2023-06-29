package selenium.demo.nambaFoodHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo{
    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://nambafood.kg/");


            WebElement menuLink = driver.findElement(By.xpath("/html/body/header/section[2]/ul/li[1]/a"));
            menuLink.click();

            WebElement fastFoodBtn = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/div/a[6]/div[2]"));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", fastFoodBtn);
            fastFoodBtn.click();

            WebElement mcBurgerBtn = driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div[3]/a[3]/div[2]/div[1]/div[1]"));
            mcBurgerBtn.click();

            WebElement submitBtn1 = driver.findElement(By.xpath("//*[@id=\"531\"]/div/div[1]/div[2]"));
            submitBtn1.click();
            WebElement submitBtn2 = driver.findElement(By.xpath("//*[@id=\"285\"]/div/div[1]/div[2]/button"));
            submitBtn2.click();


            Thread.sleep(3000);


            WebElement basketBtn = driver.findElement(By.xpath("//a[@class='basket tk-basket']"));
            basketBtn.click();

            WebElement basketSubmitBtn = driver.findElement(By.xpath("(//button[@type = 'submit'])[5]"));
            basketSubmitBtn.click();

            WebElement fullName = driver.findElement(By.xpath("//input[@id = 'food_order_client_name']"));
            Actions actions = new Actions(driver);
            String actualFullName = "Асанов Усон";
            for (char character : actualFullName.toCharArray()) {
                actions.moveToElement(fullName).click().sendKeys(String.valueOf(character)).pause(100).perform();
            }

            WebElement foodOrderAddress = driver.findElement(By.xpath("//input[@id = 'food_order_address']"));
            String actualAddress = "Гебзе 126";
            for (char character : actualAddress.toCharArray()) {
                actions.moveToElement(foodOrderAddress).click().sendKeys(String.valueOf(character)).pause(100).perform();
            }

            WebElement emptyArea = driver.findElement(By.tagName("body"));
            emptyArea.click();

            WebElement doorCode = driver.findElement(By.xpath("//input[@id = 'food_order_door_code']"));
            String doorNumber = "дом  126";
            for (char character : doorNumber.toCharArray()){
                actions.moveToElement(doorCode).click().sendKeys(String.valueOf(character)).pause(100).perform();
            }

            WebElement orderPhone = driver.findElement(By.xpath("//input[@id = 'food_order_phone']"));
            String phoneNumber = "0333222555";
            for (char character : phoneNumber.toCharArray()){
                actions.moveToElement(orderPhone).click().sendKeys(String.valueOf(character)).pause(100).perform();
            }

            Thread.sleep(2000);

            WebElement extraInformation = driver.findElement(By.xpath("//textarea[@id='food_order_additional_info']"));
            String info = "нет";
            for(char character : info.toCharArray()){
                actions.moveToElement(extraInformation).click().sendKeys(String.valueOf(character)).pause(100).perform();
            }

            WebElement moneyChange = driver.findElement(By.xpath("//input[@id='food_order_money_change']"));
            String money = "5000";
            for(char character : money.toCharArray()){
                actions.moveToElement(moneyChange).click().sendKeys(String.valueOf(character)).pause(100).perform();
            }

            WebElement orderBtn = driver.findElement(By.xpath("//button[@id = 'payment_cash']"));
            orderBtn.click();

        }
}

