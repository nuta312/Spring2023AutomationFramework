package selenium.demo.nambaFoodHomeWork.ismailov;

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


            WebElement menuLink = driver.findElement(By.xpath("(//a[@class='menu-link '])[1]"));
            menuLink.click();

            WebElement vseZavedeniyaBtn = driver.findElement(By.xpath("//h1[@class='title']"));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", vseZavedeniyaBtn);

        WebElement fastFootBtn = driver.findElement(By.xpath("(//div[@class='cat-item--title'])[6]"));
        fastFootBtn.click();


            WebElement mcBurgerBtn = driver.findElement(By.xpath("(//div[@class='cafe--name'])[3]"));
            mcBurgerBtn.click();

            WebElement submitBtn1 = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[6]"));
            submitBtn1.click();
            WebElement submitBtn2 = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[10]"));
            submitBtn2.click();
            WebElement submitBtn3 = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[12]"));
            submitBtn3.click();


            Thread.sleep(3000);


            WebElement basketBtn = driver.findElement(By.xpath("//a[@class='basket tk-basket']"));
            basketBtn.click();
            WebElement plusCola = driver.findElement(By.xpath("(//div[@class='count-button count-up'])[3]"));
            plusCola.click();

            WebElement basketSubmitBtn = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
            basketSubmitBtn.click();
        Thread.sleep(5000);

            WebElement fullName = driver.findElement(By.xpath("//input[@id='food_order_client_name']"));
        Actions actions = new Actions(driver);
        String actualFullName = "Асанов Усон";
        for (char character : actualFullName.toCharArray()) {
            actions.moveToElement(fullName).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }


            WebElement foodOrderAddress = driver.findElement(By.xpath("//input[@id='food_order_address']"));
        String actualAddress = "Гебзе 126";
        for (char character : actualAddress.toCharArray()) {
            actions.moveToElement(foodOrderAddress).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }


            WebElement doorCode = driver.findElement(By.xpath("//input[@id='food_order_door_code']"));
        String doorNumber = " дом 3 / квартира 221";
        for (char character : doorNumber.toCharArray()){
            actions.moveToElement(doorCode).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

            WebElement orderPhone = driver.findElement(By.xpath("//input[@id='food_order_phone']"));
        String phoneNumber = "0112555888";
        for (char character : phoneNumber.toCharArray()){
            actions.moveToElement(orderPhone).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

            WebElement extraInformation = driver.findElement(By.xpath("//textarea[@id='food_order_additional_info']"));
        String info = "Нет";
        for(char character : info.toCharArray()){
            actions.moveToElement(extraInformation).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }


            WebElement moneyChange = driver.findElement(By.xpath("//input[@id='food_order_money_change']"));
        String money = "5000";
        for(char character : money.toCharArray()){
            actions.moveToElement(moneyChange).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

            WebElement orderBtn = driver.findElement(By.xpath("//button[@id='payment_cash']"));
            orderBtn.click();

        }
}

