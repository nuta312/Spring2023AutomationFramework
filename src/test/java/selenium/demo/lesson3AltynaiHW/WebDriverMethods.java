package selenium.demo.lesson3AltynaiHW;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

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
//    @Test
//    void demo() throws InterruptedException {
//        driver.navigate().to("https://demoqa.com/");
//        driver.findElement(By.id("tabButton")).click();
//        Thread.sleep(3000);


    }

