package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class WebElements extends BaseTest {
    @Test
    void  demo () throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        WebElement fullName =  driver.findElement(By.id("userName"));
        fullName.sendKeys("Jon Week");
        Thread.sleep(5000);
        fullName.clear();
        Thread.sleep(5000);
        fullName.sendKeys("Jon Wiik");
        System.err.println(fullName.getAttribute("value"));
    }
}
