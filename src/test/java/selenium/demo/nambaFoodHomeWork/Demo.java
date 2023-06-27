package selenium.demo.nambaFoodHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo{
        @Test
    public void textBoxTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://nambafood.kg/");


            WebElement img = driver.findElement(By.id("https://nambafood.kg/new_design/static/img/icons/tech_farm.png?1686712302"));
            WebElementActions.scrollToElement(driver, img);

//            WebElement foodMenuLink = driver.findElement(By.id("/food"));
//            foodMenuLink.click();

    }
}
