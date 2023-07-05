package selenium.demo.nambaFoodHomeWork.Assakunova;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkAssakunovaNambaFood {

    @Test
    public void NambaFoodTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nambafood.kg/");

        WebElement eda = driver.findElement(By.xpath("//a[@class='menu-link '][1]"));
        eda.click();
        WebElement kitchen = driver.findElement(By.xpath("//a[text()='ВСЕ ЗАВЕДЕНИЯ']"));
        kitchen.click();
        WebElement makimania = driver.findElement(By.xpath("//div[@class = 'cafe--name'][contains(text(), 'Maki Mania')]"));
        //WebElementActions.scrollToElement(driver, makimania);
        makimania.click();

        WebElement firstDish = driver.findElement(By.xpath("//button[@type= 'submit'][@class = 'status active bay_item'][1]"));
        firstDish.click();

       /* WebElement soupBlock = driver.findElement(By.xpath("//a[@href = '#1002'][@class = 'filter--item tag-1002']"));
        soupBlock.click();*/

        WebElement hotDish = driver.findElement(By.xpath("(//button[@type= 'submit'][@class = 'status active bay_item'])[2]"));
        hotDish.click();

        WebElement salads = driver.findElement(By.xpath("(//button[@type= 'submit'][@class = 'status active bay_item'])[7]"));
        salads.click();

        WebElement beverage = driver.findElement(By.xpath("(//button[@type= 'submit'][@class = 'status active bay_item'])[58]"));
        beverage.click();

        WebElement clickKorzina = driver.findElement(By.xpath("//a[@class = 'basket tk-basket']"));
        clickKorzina.click();

        WebElement oformitZakaz = driver.findElement(By.xpath("//button[@class = 'order--btn order--access'][@type = 'submit']"));
        oformitZakaz.click();

        WebElement userName = driver.findElement(By.xpath("//input[@type='text'][@id = 'food_order_client_name']"));
        userName.sendKeys("Aygen");

        WebElement address = driver.findElement(By.xpath("//input[@type='text'][@id = 'food_order_address']"));
        address.sendKeys("Toktogul 19-1");

        WebElement apartment = driver.findElement(By.xpath("//input[@type='text'][@id = 'food_order_door_code']"));
        apartment.sendKeys("43");

        WebElement telephone = driver.findElement(By.xpath("//input[@type='text'][@id = 'food_order_phone']"));
        telephone.sendKeys("123456789");

        WebElement addInfo = driver.findElement(By.xpath("//textarea[@id = 'food_order_additional_info']"));
        addInfo.sendKeys("Do not put in plastic bag");

        WebElement moneyChange = driver.findElement(By.xpath("//input[@type='text'][@id = 'food_order_money_change']"));
        moneyChange.sendKeys("2000");

        WebElement order = driver.findElement(By.xpath("//button[@class = 'order--btn order--access'][@id = 'payment_cash']"));
        order.click();

        WebElement sumTotal = driver.findElement(By.xpath("//div[@class='sum-item--count price-total'][1]"));
        Assert.assertEquals(sumTotal.getText(), "1565  с");










    }
}
