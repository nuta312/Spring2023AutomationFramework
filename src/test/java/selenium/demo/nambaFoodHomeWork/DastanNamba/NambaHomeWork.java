package selenium.demo.nambaFoodHomeWork.DastanNamba;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NambaHomeWork {

    @Test
    public static void NambaTest() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nambafood.kg/");


        WebElement menuLink = driver.findElement(By.xpath("(//a[contains(@class,'menu-link')])[1]"));
        menuLink.click();

        WebElement nationalFoodBtn = driver.findElement(By.xpath("(//a[contains(@class,'cat-item')])[1]"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", nationalFoodBtn);
        nationalFoodBtn.click();

        WebElement sunClubBtn = driver.findElement(By.xpath("//div[contains(text(),'Sun Club')]"));
        sunClubBtn.click();

        WebElement submitBtn1 = driver.findElement(By.xpath("(//button[@type = 'submit'])[5]"));
        submitBtn1.click();
        WebElement submitBtn2 = driver.findElement(By.xpath("(//button[@type = 'submit'])[7]"));
        submitBtn2.click();
        WebElement submitBtn3 = driver.findElement(By.xpath("(//button[@type = 'submit'])[10]"));
        submitBtn3.click();
        WebElement submitBtn4 = driver.findElement(By.xpath("(//button[@type = 'submit'])[15]"));
        submitBtn4.click();

        Thread.sleep(2000);


        WebElement basketBtn = driver.findElement(By.xpath("//a[@class='basket tk-basket']"));
        basketBtn.click();

        WebElement basketSubmitBtn = driver.findElement(By.xpath("(//button[@type = 'submit'])[5]"));
        basketSubmitBtn.click();

        WebElement fullName = driver.findElement(By.xpath("//input[@id = 'food_order_client_name']"));
        Actions actions = new Actions(driver);
        String actualFullName = "Сергей Михайлович";
        for (char character : actualFullName.toCharArray()) {
            actions.moveToElement(fullName).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

        WebElement foodOrderAddress = driver.findElement(By.xpath("//input[@id = 'food_order_address']"));
        String actualAddress = "Суусамыр 16";
        for (char character : actualAddress.toCharArray()) {
            actions.moveToElement(foodOrderAddress).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

        WebElement emptyArea = driver.findElement(By.tagName("body"));
        emptyArea.click();

        WebElement doorCode = driver.findElement(By.xpath("//input[@id = 'food_order_door_code']"));
        String doorNumber = "дом 50 / квартира 16";
        for (char character : doorNumber.toCharArray()) {
            actions.moveToElement(doorCode).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

        WebElement orderPhone = driver.findElement(By.xpath("//input[@id = 'food_order_phone']"));
        String phoneNumber = "0111222333";
        for (char character : phoneNumber.toCharArray()) {
            actions.moveToElement(orderPhone).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

        Thread.sleep(2000);

        WebElement extraInformation = driver.findElement(By.xpath("//textarea[@id='food_order_additional_info']"));
        String info = "No additional information";
        for (char character : info.toCharArray()) {
            actions.moveToElement(extraInformation).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

        WebElement moneyChange = driver.findElement(By.xpath("//input[@id='food_order_money_change']"));
        String money = "1500";
        for (char character : money.toCharArray()) {
            actions.moveToElement(moneyChange).click().sendKeys(String.valueOf(character)).pause(100).perform();
        }

        WebElement orderBtn = driver.findElement(By.xpath("//button[@id = 'payment_cash']"));
        orderBtn.click();

        Thread.sleep(2000);

        String xpath = "//span[text() = '%s:']//following-sibling::span";
        WebElement resultName = driver.findElement(By.xpath(String.format(xpath,"Ваше имя")));
        Assert.assertEquals(resultName.getText(),actualFullName);

        WebElement resultAddress = driver.findElement(By.xpath(String.format(xpath,"Адрес доставки")));
        Assert.assertTrue(resultAddress.getText().contains(actualAddress));

        WebElement resultDoorNumber = driver.findElement(By.xpath(String.format(xpath,"Квартира/Этаж")));
        Assert.assertTrue(resultDoorNumber.getText().contains(doorNumber));

        WebElement resultPhoneNumber = driver.findElement(By.xpath(String.format(xpath,"Телефон")));

        Assert.assertTrue(resultPhoneNumber.getText().contains(phoneNumber.substring(1)));

        WebElement resultMoney = driver.findElement(By.xpath(String.format(xpath,"Сдача с")));
        Assert.assertTrue(resultMoney.getText().contains(money));

        WebElement resultInfo = driver.findElement(By.xpath(String.format(xpath,"Доп. информация")));
        Assert.assertTrue(resultInfo.getText().contains(info));



    }
}
