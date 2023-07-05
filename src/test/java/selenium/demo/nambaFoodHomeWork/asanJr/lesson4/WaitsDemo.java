package selenium.demo.nambaFoodHomeWork.asanJr.lesson4;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.time.Duration;

public class WaitsDemo extends BaseTest {
    @Test
    void demo1() throws InterruptedException {
        driver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter"))).click();

        Thread.sleep(5000);
    }
}
