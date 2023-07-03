package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;

public class WebDriverMethods extends BaseTest {
    @Test
    void demo() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.cssSelector("a.menu-link[href='/food']")).click();
        driver.findElement(By.xpath("(//div[@class='cat-item--prev'])[2]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
    }

    @Test
    void demo2() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.cssSelector("button#tabButton")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(0));
    }

}