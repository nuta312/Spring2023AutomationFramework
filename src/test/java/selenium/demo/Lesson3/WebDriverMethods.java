package selenium.demo.Lesson3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2Alisher.BaseTest;

import java.util.ArrayList;

public class WebDriverMethods extends BaseTest {

    @Test
    void demo() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("(//a[@class='menu-link '])[1]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
    }

    @Test
    void demp() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);

    }


}
