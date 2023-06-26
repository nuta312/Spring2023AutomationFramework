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
    public void NambaFoodDemoTest(){

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

        //WebElement chooseWhatToEat = driver.findElement(By.cssSelector("a[data-item-name='Бургер с томленой бараниной']"));












    }
}
