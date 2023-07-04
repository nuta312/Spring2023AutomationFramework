package seleniun.demo.homework.nambafood;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.StackTrace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFood {
    @Test
    public void textBoxTest() throws InterruptedException {


        WebDriverManager.chromedriver().setup(); //setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();     // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //waiting the elements
        driver.get("https://nambafood.kg/");

        WebElement menuBtn = driver.findElement(By.xpath("//a[@class='home--cat-item food']"));
        menuBtn.click();

        WebElement option = driver.findElement(By.linkText("ВСЕ ЗАВЕДЕНИЯ"));
        option.click();
        WebElement cuisine = driver.findElement(By.linkText("Национальная кухня"));
        cuisine.click();

        WebElement cafe = driver.findElement(By.linkText("Фаиза"));
        cafe.click();

        WebElement clickOrder = driver.findElement(By.xpath("//span[@id='305']//div[@class='card--wrap']//div[1]//div[2]//button[1]"));
        clickOrder.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement basket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cart']/a")));
        basket.click();

//        WebElement busketBtn = driver.findElement(By.xpath("//a[@class='basket tk-basket']//*[name()='svg']"));
//        busketBtn.click();

        WebElement checkout = driver.findElement(By.linkText("Оформить заказ"));
        checkout.click();

        WebElement userName = driver.findElement(By.xpath("//input[@id='food_order_client_name']"));
        userName.sendKeys("Tupac Shakur");

       // WebElement Address = driver.findElement(By.xpath("//input[@id='food_order_address']"));
        //Address.sendKeys("Space 1a");

        WebElement floor = driver.findElement(By.xpath("//input[@id='food_order_door_code']"));
        floor.sendKeys("45");

        WebElement phone = driver.findElement(By.xpath("//input[@id='food_order_phone']"));
        phone.sendKeys("0704105600");

        WebElement address = driver.findElement(By.xpath("//input[@id='food_order_address']"));
        address.sendKeys("Ankara 1");


        WebElement addInformation = driver.findElement(By.xpath("//textarea[@id='food_order_additional_info']"));
        addInformation.sendKeys("Без танца не возьмем заказ");

        WebElement cashPay = driver.findElement(By.xpath("//li[normalize-space()='MBank Online']"));
        cashPay.click();

        WebElement cashNumber = driver.findElement(By.xpath("//input[@id='payment--kbk-phone']"));
        cashNumber.sendKeys("704105600");

        WebElement order = driver.findElement(By.xpath("//button[@id='payment_ibank']"));
        order.click();

     //   Assert.assertTrue(driver.findElement(By.xpath("//div[@id='result']")).isDisplayed());

    }

    }
