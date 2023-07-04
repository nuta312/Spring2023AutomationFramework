package codingbat.kamiii;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class CheckBox  extends BaseTest {

    @Test
    void checkBox() throws InterruptedException {

        driver.get("https://demoqa.com/checkbox");
        WebElement checkBox = driver.findElement(By.xpath("//*[@class='rct-title']"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.click();
    }
}
