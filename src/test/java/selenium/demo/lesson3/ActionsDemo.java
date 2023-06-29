package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import static org.testng.Assert.assertTrue;

public class ActionsDemo extends BaseTest {


    @Test
    void demo1() throws InterruptedException {

        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

        actions.doubleClick(doubleClick).perform();
        assertTrue(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).isDisplayed());

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform();
        Thread.sleep(5000);

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickMe).perform();
        Thread.sleep(3000);

    }

    @Test
    void homeWork() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/resizable");
        WebElement resize = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']"));
        actions.moveToElement(resize).perform();
        Thread.sleep(5000);
        actions.clickAndHold(resize).perform();
        Thread.sleep(3000);


    }
}