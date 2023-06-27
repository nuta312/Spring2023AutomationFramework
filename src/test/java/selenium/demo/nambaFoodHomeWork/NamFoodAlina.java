package selenium.demo.nambaFoodHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NamFoodAlina {
    @Test
    public void textBoxTest() {

        WebDriverManager.chromedriver().setup(); // setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // waiting the elements in page
        driver.get("https://nambafood.kg/?");

   WebElement submitBtn = driver.findElement(By.linkText("Еда"));
   WebElementActions.scrollToElement(driver, submitBtn);
   submitBtn.click();

//   WebElement submitBtn2 = driver.findElement(By.xpath());
//    WebElementActions.scrollToElement(driver, submitBtn2);
//    submitBtn2.click();
//

    }
    }
