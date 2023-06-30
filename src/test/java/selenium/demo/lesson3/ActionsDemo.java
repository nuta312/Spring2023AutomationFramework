package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static org.testng.AssertJUnit.assertTrue;

public class ActionsDemo extends BaseTest {

    @Test
    void demo1() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform(); // right click
        Thread.sleep(5000);

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickMe).perform();
        Thread.sleep(5000);
    }
}


