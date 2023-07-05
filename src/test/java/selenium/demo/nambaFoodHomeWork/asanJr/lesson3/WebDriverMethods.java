package selenium.demo.nambaFoodHomeWork.asanJr.lesson3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.util.ArrayList;

public class WebDriverMethods extends BaseTest {
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
    }

    @Test
    void demo2() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.id("//button[@id=\"tabButton\"]"));
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);

    }
}
