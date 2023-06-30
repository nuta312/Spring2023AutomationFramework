package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class ActionsDemo extends BaseTest {
    @Test
    void demo1() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick= driver.findElement(By.id("doubleClickBtn"));
        Actions actions=new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        Assert.assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

        WebElement rightClick= driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform();
        Thread.sleep(5000);
        WebElement clickMe=driver.findElement(By.xpath("//button[text()='Click Me'"));
        Thread.sleep(3000);
        actions.clickAndHold();

    }

}
