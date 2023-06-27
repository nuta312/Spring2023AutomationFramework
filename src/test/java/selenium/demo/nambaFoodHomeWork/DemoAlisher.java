package selenium.demo.nambaFoodHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoAlisher {

    @Test
    public void NambaFoodDemoTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nambafood.kg");

        WebElement typeFoodMenu = driver.findElement(By.cssSelector("a.home--cat-item.food"));
        typeFoodMenu.click();

        WebElement typeEuropeKitchenMenu = driver.findElement(By.cssSelector("a[href='/cafe/ievropieiskaia-kukhnia']"));
        typeEuropeKitchenMenu.click();

        WebElement typeGiraffeCoffee = driver.findElement(By.cssSelector("a[href='/giraffe']"));
        typeGiraffeCoffee.click();

        WebElement chooseWhatToEat = driver.findElement(By.xpath("//div[@data-item-name='Котлета по-киевски']//button[normalize-space()='Заказать']"));
        chooseWhatToEat.click();

        WebElement chooseBasket = driver.findElement(By.xpath("//a[@class='basket tk-basket']"));
        chooseBasket.click();

        WebElement order = driver.findElement(By.xpath(" //div[@class='order--actions']/a"));
        order.click();

        WebElement clientName = driver.findElement(By.id("food_order_client_name"));
        clientName.sendKeys("Ali Rus");

        WebElement clientAddress = driver.findElement(By.id("food_order_address"));
        clientAddress.sendKeys("Chukotka, Noname ave.");

        WebElement moneyChange = driver.findElement(By.id("food_order_money_change"));
        moneyChange.sendKeys("1000");

        WebElement submitBtn = driver.findElement(By.id("payment_cash"));
        WebElementActions.scrollToElement(driver, submitBtn);
        submitBtn.click();


    }
}
