package selenium.demo.nambaFoodHomeWork.syrgak.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class WebElementMethods extends BaseTest {
    /***
     * WebElement Methods
     * click(),sendKeys(),
     */

    @Test
    void demo() throws InterruptedException{
        driver.get("https://demoqa.com/checkbox");
        WebElement fullname = driver.findElement(By.id("userName"));
        fullname.sendKeys("John Wick");
        Thread.sleep(5000);
        fullname.clear();
        Thread.sleep(5000);
        fullname.sendKeys("John Wick");
        System.out.println(fullname.getAttribute("value"));

    }
}
