package selenium.demo.nambaFoodHomeWork.aidinHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class Droppable extends BaseTest {
    @Test
    void simpleTest() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        WebElement sourceEl = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        Point locationBefore = sourceEl.getLocation();
        WebElement targetEl = driver.findElement(By.xpath("(//div[@id=\"droppable\"])[1]"));
        actions.dragAndDrop(sourceEl,targetEl).perform();
        Point locationAfter = sourceEl.getLocation();
        Assert.assertNotEquals(locationBefore,locationAfter);
        Assert.assertEquals(targetEl.getText(),"Dropped!");
        Thread.sleep(3000);
    }
}
