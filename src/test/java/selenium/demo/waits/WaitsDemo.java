package selenium.demo.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class WaitsDemo extends BaseTest {

//    Explicit wait

@Test
    void demo1() throws InterruptedException {
    driver.get("https://demoqa.com/dynamic-properties");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter"))).click();

    Thread.sleep(5000);

}

}
