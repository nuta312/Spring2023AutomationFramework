package selenium.demo.nambaFoodHomeWork.tilek.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.nambaFoodHomeWork.tilek.practice.BaseTestbyTilek;

import java.util.ArrayList;

public class WebDriverMethods extends BaseTestbyTilek {

    /**
     difference between get() and navigate().to()
     в navigate() есть методы обновления браузера,назад или вперед
     */
    @Test
    void demo() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("(//a[@class='menu-link '])[1]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());//current address of website
        System.out.println(driver.getTitle());  // title of web page
        System.out.println(driver.getPageSource());  //full code of web page
    }

    @Test
    void demo2() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        WebElement text = driver.findElement(By.id("sampleHeading"));
        Assert.assertTrue(text.isDisplayed());
        driver.close();
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
    }
}
