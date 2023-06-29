package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class WebdDriverMethods extends BaseTest {

    @Test
    void demo() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("(//a[contains(@class,'menu-link')])[1]"));
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}
