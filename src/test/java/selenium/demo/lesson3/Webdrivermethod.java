package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.util.ArrayList;

public class Webdrivermethod extends BaseTest {


    @Test
    void demo() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("//a[@class='home--cat-item food']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
    }

    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        Thread.sleep(5000);
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);

    }


}
