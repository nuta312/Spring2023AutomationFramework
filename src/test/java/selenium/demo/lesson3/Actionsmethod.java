package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import static org.testng.AssertJUnit.*;

public class Actionsmethod extends BaseTest {
    @Test
    void demo3() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleclik = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleclik).perform();
        assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());
        WebElement actio2 = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(actio2).perform();
        Thread.sleep(5000);
    }
}
