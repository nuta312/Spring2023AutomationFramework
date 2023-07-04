package selenium.demo.nambaFoodHomeWork.tilek.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.nambaFoodHomeWork.tilek.practice.BaseTestbyTilek;

public class WebElementMethods extends BaseTestbyTilek {

    /***
    WebElement methods
     click(), sendKeys(), getText(), clear(),getAttribute()
     */
    @Test
    void demo() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("John Wick");
        fullName.clear();
        Thread.sleep(5000);
        fullName.sendKeys("John Wick");
        String result = fullName.getAttribute("namespaceURI");
        System.out.println(result);
    }
}
