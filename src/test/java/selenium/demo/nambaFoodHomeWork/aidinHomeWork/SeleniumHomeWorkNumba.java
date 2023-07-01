package selenium.demo.nambaFoodHomeWork.aidinHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumHomeWorkNumba {
    @Test
    public void testNumba(){
        WebDriverManager.chromedriver().setup(); // setup chrome driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://nambafood.kg/?gclid=CjwKCAjwkeqkBhAnEiwA5U-uM1WbVpgurwwi-cn1QsHN33VMM7xBGZwMoLy-70DMfKgO-TC3avEIRBoCSHIQAvD_BwE");

        WebElement eda = driver.findElement(By.xpath("//a[@class=\"menu-link \"] [@href=\"/food\"]"));
        eda.click();

        WebElement natoinalCookie = driver.findElement(By.xpath("//img[@src=\"/image/468x318/39376.png\"]"));
        WebElementActions.scrollToElement(driver, driver.findElement(By.xpath("//h1[@class=\"title\"]")));
        natoinalCookie.click();

        WebElement faiza = driver.findElement(By.xpath("//img[@src=\"/image/125x125/43886.png\"]"));
        faiza.click();

        WebElementActions.scrollToElement(driver, driver.findElement(By.xpath("//a[@class=\"filter--item tag-38244\"]")));
        WebElement shorpo = driver.findElement(By.xpath("//div[@data-item-name=\"Шорпо\"]//button[@type=\"submit\"]"));
        shorpo.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement korzina = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cart']/a")));
        korzina.click();

        WebElement oformit = driver.findElement(By.xpath("//button[@class=\"order--btn order--access\"]"));
        oformit.click();

        WebElement userName = driver.findElement(By.xpath("//input[@id=\"food_order_client_name\"]"));
        userName.sendKeys("Jason Stadhem");

        WebElement userAdress = driver.findElement(By.xpath("//input[@id=\"food_order_address\"]"));
        userAdress.sendKeys("Brooklin Sreet 13");

        WebElementActions.scrollToElement(driver, driver.findElement(By.xpath("//label[@for=\"payments--change\"]")));
        WebElement finish = driver.findElement(By.xpath("//button[@class=\"order--btn order--access\"] [@id=\"payment_cash\"]"));
        finish.click();

//        driver.quit();
    }
}
