package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class WebElementMethods extends BaseTest {
    /***  WebElement methods
     * 1. clear();
     *
     *
     * */

    @Test
    void demo() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.cssSelector("input#userName"));
        fullName.sendKeys("John Wick");
        Thread.sleep(3000);
        fullName.clear();
        Thread.sleep(3000);
        fullName.sendKeys("Chika");
        System.out.println(fullName.getAttribute("value"));
    }
}
