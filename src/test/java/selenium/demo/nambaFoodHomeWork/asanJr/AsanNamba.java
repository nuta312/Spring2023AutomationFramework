package selenium.demo.nambaFoodHomeWork.asanJr;

import com.digitalnomads.selenium.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AsanNamba {
    @Test
    public void nambaFoodTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nambafood.kg/");

        WebElement food = driver.findElement(By.xpath("//li//a[normalize-space()='Еда']"));
        food.click();

        WebElement turkishKitchen = driver.findElement(By.xpath("//a[@href=\"/cafe/turietskaia-kukhnia\"]"));
        WebElementActions.scrollToElement(driver, turkishKitchen);
        turkishKitchen.click();

        WebElement ustaRestaurant = driver.findElement(By.xpath("//a[@href=\"/usta-turkish-restaurant\"]"));
        WebElementActions.scrollToElement(driver, ustaRestaurant);
//        WebElementActions.clickJS(driver, ustaRestaurant);

        WebElement danaPirzola = driver.findElement(By.xpath("(//button[@type=\"submit\"])[5]"));
        danaPirzola.click();

        WebElement tavukSteak = driver.findElement(By.xpath("(//button[@type=\"submit\"])[6]"));
        tavukSteak.click();

        WebElement kobeSteak = driver.findElement(By.xpath("(//button[@type=\"submit\"])[7]"));
        kobeSteak.click();

        WebElement bonfileSous = driver.findElement(By.xpath("(//button[@type=\"submit\"])[9]"));
        bonfileSous.click();

        WebElement steakPorterHouse = driver.findElement(By.xpath("(//button[@type=\"submit\"])[10]"));
        steakPorterHouse.click();

        WebElement fumeSCheddr = driver.findElement(By.xpath("(//button[@type=\"submit\"])[11]"));
        fumeSCheddr.click();

        Thread.sleep(2000);
        WebElement cart = driver.findElement(By.xpath("//a[@class=\"basket tk-basket\"]"));
        cart.click();

        WebElement submitOffer = driver.findElement(By.xpath("//a[@href=\"/usta-turkish-restaurant/checkout\"]"));
        submitOffer.click();

        String name = "Бредд Питт";
        WebElement userName = driver.findElement(By.xpath("//input[@id=\"food_order_client_name\"]"));
        userName.sendKeys(name);

        String address = "Тоголо";
        WebElement userAddress = driver.findElement(By.xpath("//input[@id=\"food_order_address\"]"));
        userAddress.sendKeys(address);


        Thread.sleep(10000);
        WebElement togolokMoldo = driver.findElement(By.xpath("//div[text()='Тоголок Молдо 6']"));
        togolokMoldo.click();


        String kvEt = "6 этаж, 76 квартира";
        WebElement kvartiraEtaj = driver.findElement(By.xpath("//input[@id=\"food_order_door_code\"]"));
        kvartiraEtaj.sendKeys(kvEt);

        String number = "0777777777";
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id=\"food_order_phone\"]"));
        phoneNumber.sendKeys(number);

        String addInfo = "Хочу все свежее, горячее и побыстрее";
        WebElement additionalInfo = driver.findElement(By.id("food_order_additional_info"));
        additionalInfo.sendKeys(addInfo);

        WebElement mBank = driver.findElement(By.xpath("//li[@aria-controls=\"tab_item-1\"]"));
        mBank.click();

        WebElement inputPhoneNumber = driver.findElement(By.xpath("//input[@id=\"payment--kbk-phone\"]"));
        inputPhoneNumber.sendKeys(number.substring(1));

        WebElement submitOfferMBank = driver.findElement(By.xpath("//button[@id=\"payment_ibank\"]"));
        submitOfferMBank.click();


        //span[text()='Адрес доставки:']//following-sibling::span
        //span[text()='Квартира/Этаж:']//following-sibling::span
        //span[text()='Телефон:']//following-sibling::span
        //span[text()='Доп. информация:']//following-sibling::span
        //span[text()='Время доставки:']//following-sibling::span


        WebElement resultName = driver
                .findElement(By.xpath("//span[text()='Ваше имя:']//following-sibling::span"));
        Assert.assertEquals(resultName.getText(), name);

        WebElement resultAddress = driver
                .findElement(By.xpath("//span[text()='Адрес доставки:']//following-sibling::span"));
        Assert.assertTrue(resultAddress.getText().contains(address));


        WebElement resultKvartiraEtaj = driver
                .findElement(By.xpath("//span[text()='Квартира/Этаж:']//following-sibling::span"));
        Assert.assertEquals(resultKvartiraEtaj.getText(), kvEt);


        WebElement resultPhoneNumber = driver
                .findElement(By.xpath("//span[text()='Телефон:']//following-sibling::span"));
        Assert.assertEquals(resultPhoneNumber.getText(), number.substring(1));


        WebElement resultAdditionalInfo = driver
                .findElement(By.xpath("//span[text()='Доп. информация:']//following-sibling::span"));
        Assert.assertEquals(resultAdditionalInfo.getText(), addInfo);


        WebElement resultTimeDelivery = driver
                .findElement(By.xpath("//span[text()='Время доставки:']//following-sibling::span"));
        Assert.assertEquals(resultTimeDelivery.getText(), "Как можно скорее");

    }
}
