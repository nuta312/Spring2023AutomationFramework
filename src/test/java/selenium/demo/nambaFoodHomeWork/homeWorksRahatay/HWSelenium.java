package selenium.demo.nambaFoodHomeWork.homeWorksRahatay;

import com.digitalnomads.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HWSelenium {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://nambafood.kg/");

        WebElement food = driver.findElement(By.xpath("//div[@class='home--cat-prev'][1]"));
        food.click();

        WebElement kitchen = driver.findElement(By.xpath("//div[@class='cat-item--title'][1]"));
        kitchen.click();

        WebElement faiza = driver.findElement(By.xpath("//img[@src=\"/image/125x125/43886.png\"]"));
        faiza.click();

        WebElementActions.scrollToElement(driver, driver.findElement(By.xpath("//a[@class=\"filter--item tag-1070\"]")));
        WebElement shawlyk = driver.findElement(By.xpath("//a[@class=\"filter--item tag-1070\"]"));
        shawlyk.click();

         WebElementActions.scrollToElement(driver, driver.findElement(By.xpath("//button[@class=\"status active bay_item\"][90]")));
         WebElement addOrder = driver.findElement(By.xpath("//button[@class=\"status active bay_item\"][90]"));
         addOrder.click();



    }

}



