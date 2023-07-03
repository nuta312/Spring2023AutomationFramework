package selenium.demo.nambaFoodHomeWork.baiasov.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WebDriverMethods extends BaseTest{

    @Test
    void demo() throws InterruptedException{
        driver.navigate().to("https://nambafood.kg/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"food-page-slider\"]/div[2]/div"));
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
    void demo2() throws InterruptedException{
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);
    }
}
