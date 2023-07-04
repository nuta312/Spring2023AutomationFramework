package codingbat.kamiii;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class ReziableTest extends BaseTest {

    @Test
    void reziableBox () throws InterruptedException {

        driver.get("https://demoqa.com/resizable");


        WebElement resizableElement = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.clickAndHold(resizableElement).moveByOffset(500, 300).release().perform();



    }
}
