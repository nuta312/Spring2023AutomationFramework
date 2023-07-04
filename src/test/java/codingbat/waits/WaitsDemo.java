package codingbat.waits;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.time.Duration;

public class WaitsDemo extends BaseTest {

    //  Explicit wait
    @Test
    void demo1() throws InterruptedException {
        driver.get("https://demoqa.com/dynamic-properties");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));


        Thread.sleep(5000);


    }
}
