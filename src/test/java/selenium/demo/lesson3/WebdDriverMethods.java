package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.util.ArrayList;

public class WebdDriverMethods extends BaseTest {

    @Test
    void demo() throws InterruptedException {
        driver.get("https://nambafood.kg/");   // Похож на get но более удобный чтобы переходить вперед и назад
        driver.findElement(By.xpath("(//a[contains(@class,'menu-link')])[1]")).click();
        Thread.sleep(3000);    // Сон
        driver.navigate().back();   // Назад
        Thread.sleep(3000);
        driver.navigate().forward();  // Вперед
        Thread.sleep(3000);
        driver.navigate().refresh();  // Обнова страницы
        System.out.println(driver.getCurrentUrl());    // Возвращает страницу на которой находимся
        System.out.println(driver.getTitle());         // Возвращает название страницы
        System.out.println(driver.getPageSource());    // Возвращает весь HTML код

    }

    @Test
    void demo2() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/browser-windows");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);
    }
}
