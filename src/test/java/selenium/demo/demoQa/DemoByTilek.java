package selenium.demo.demoQa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;


public class DemoByTilek {

    @Test
            public void testNambaFood() {

        WebDriverManager.chromedriver().setup(); // setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // waiting the elements in page
        driver.get("https://nambafood.kg/");

        WebElement foodLink = driver.findElement(By.xpath("//a[contains(@class, 'menu-link') and contains(@href, '/food')]"));
        foodLink.click();


        WebElement comboElement = driver.findElement(By.xpath("//a[@href='/cafe/cocacola']"));
        comboElement.click();

        WebElement fcBish = driver.findElement(By.xpath("//img[@src='/image/125x125/132662.png']"));
        fcBish.click();

        WebElement combo1 = driver.findElement(By.xpath("//img[@src='/dish_image/146881.png']"));
        WebElement orderCombo1 = driver.findElement(By.xpath("//button[@class='status active bay_item']"));
        orderCombo1.click();

        WebElement orderedCard = driver.findElement(By.id("cart"));
        orderedCard.click();

        WebElement orderButton = driver.findElement(By.xpath("//button[contains(@class, 'order--btn') and contains(@class, 'order--access') and contains(text(), 'Оформить заказ')]"));
        orderButton.click();

        WebElement firstNameLastNameFill = driver.findElement(By.id("food_order_client_name"));
        firstNameLastNameFill.sendKeys("James Bond");
        Assert.assertEquals(firstNameLastNameFill.getAttribute("value"), "James Bond");

        WebElement address = driver.findElement(By.id("food_order_address"));
        address.sendKeys("Erkindik blvrd. 21", Keys.ENTER);



        WebElement floorApartment = driver.findElement(By.id("food_order_door_code"));
        floorApartment.sendKeys("4");
        Assert.assertTrue(floorApartment.getAttribute("value").contains("4"));

        WebElement mobilePhone = driver.findElement(By.id("food_order_phone"));
        mobilePhone.sendKeys("0 555 25 45 65");
        Assert.assertEquals(mobilePhone.getAttribute("value"), "0 555 25 45 65");

        WebElement additionalInfo = driver.findElement(By.id("food_order_additional_info"));
        additionalInfo.sendKeys("Проверка сайта, пожалуйста не принимайте этот заказ");

        WebElement orderNow = driver.findElement(By.xpath("//label[@for='delivery_now']"));
        orderNow.click();


        WebElement payment = driver.findElement(By.id("payments-tabs"));
        WebElement moneyInput = driver.findElement(By.id("food_order_money_change"));
        moneyInput.sendKeys("2000");
        Assert.assertEquals(moneyInput.getAttribute("value"),"2000");

        WebElement orderBtn = driver.findElement(By.id("payment_cash"));
        orderBtn.click();

    }

}
