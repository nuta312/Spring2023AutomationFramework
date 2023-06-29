package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class WebElementMethods extends BaseTest {

    /**
     WebElement methods
     click(),sendKeys(),getText(),clear(),getAttribute()
     */


    @Test
    void demo() throws  InterruptedException{
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("John Wick");
        Thread.sleep(5000);
        fullName.clear();
        Thread.sleep(5000);
        fullName.sendKeys("John Wick");
        System.out.println( fullName.getAttribute("value"));  // getAttribute --> берет значение у поля который ввели люди

    }

}
