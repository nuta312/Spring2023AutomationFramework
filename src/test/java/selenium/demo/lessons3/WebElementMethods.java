package selenium.demo.lessons3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class WebElementMethods extends BaseTest {



    @Test
    void demo() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.sendKeys("Jaok");
        Thread.sleep(5000);
        fullName.clear();
        Thread.sleep(5000);
        fullName.sendKeys("Jaok");
        fullName.getAttribute("value");
        System.out.println(fullName);
    }
}
