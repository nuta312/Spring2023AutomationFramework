package selenium.demo.nambaFoodHomeWork.ChikaHomeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static org.testng.AssertJUnit.*;

public class DropHomework extends BaseTest {
    @Test
    void simple() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        WebElement dragme = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[1]"));
        WebElement drophere = driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[1]"));
        assertEquals(driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[1]/p")).getText(), "Drop here");
        actions.clickAndHold(dragme).moveToElement(drophere).release().perform();
        Thread.sleep(4000);
        assertEquals(driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable ui-state-highlight'])[1]/p")).getText(), "Dropped!");
    }

    @Test
    void accept() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.cssSelector("a#droppableExample-tab-accept")).click();
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.xpath("//div[text()='Not  Acceptable']/../following-sibling::div/p")).getText(), "Drop here");
        WebElement notAcceptable = driver.findElement(By.xpath("//div[text()='Not  Acceptable']"));
        WebElement dropHere = driver.findElement(By.xpath("//div[text()='Not  Acceptable']/../following-sibling::div"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(notAcceptable).moveToElement(dropHere).release().perform();
        Thread.sleep(2000);
        assertEquals(driver.findElement(By.xpath("//div[text()='Not  Acceptable']/../following-sibling::div/p")).getText(), "Drop here");
        Thread.sleep(3000);
        WebElement acceptable = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[2]"));
        actions.clickAndHold(acceptable).moveToElement(dropHere).release().perform();
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.xpath("(//div[@id='droppable'])[2]/p")).getText(), "Dropped!");
        Thread.sleep(2000);

    }

    @Test
    void prevent() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[contains(text(),'Prevent P')]")).click();
        WebElement dragMe = driver.findElement(By.xpath("//div[contains(text(),'Drag Me')]"));
        WebElement outerDropp = driver.findElement(By.cssSelector("div#notGreedyDropBox>p"));
        Thread.sleep(1000);
        assertEquals(outerDropp.getText(), "Outer droppable");
        Actions actions = new Actions(driver);
        actions.clickAndHold(dragMe).moveToElement(outerDropp).release().perform();
        assertEquals(outerDropp.getText(), "Dropped!");
        Thread.sleep(2000);
        WebElement innerDroppable = driver.findElement(By.cssSelector("div#notGreedyInnerDropBox"));
        assertEquals(driver.findElement(By.cssSelector("div#notGreedyInnerDropBox>p")).getText(), "Inner droppable (not greedy)");
        actions.clickAndHold(dragMe).moveToElement(innerDroppable).release().perform();
        assertEquals(driver.findElement(By.cssSelector("div#notGreedyInnerDropBox>p")).getText(), "Dropped!");
        Thread.sleep(2000);
        WebElement outer2Droppable = driver.findElement(By.cssSelector("div#greedyDropBox>p"));
        assertEquals(outer2Droppable.getText(), "Outer droppable");
        actions.clickAndHold(dragMe).moveToElement(outer2Droppable).release().perform();
        assertEquals(outer2Droppable.getText(), "Dropped!");
        Thread.sleep(2000);
        WebElement inner2 = driver.findElement(By.cssSelector("div#greedyDropBoxInner"));
        assertEquals(inner2.getText(), "Inner droppable (greedy)");
        actions.clickAndHold(dragMe).moveToElement(inner2).release().perform();
        assertEquals(inner2.getText(), "Dropped!");
        Thread.sleep(2000);
    }

    @Test
    void revert() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[contains(text(),'Revert')]")).click();
        WebElement willRevert = driver.findElement(By.cssSelector("div#revertable"));
        WebElement drophere = driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[5]"));
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.clickAndHold(willRevert).moveToElement(drophere).release().perform();
        assertTrue(driver.findElement(By.xpath("//div[@class='drop-box ui-droppable ui-state-highlight']/p")).isDisplayed());
        Thread.sleep(2000);
        WebElement notRevert = driver.findElement(By.cssSelector("div#notRevertable"));
        actions.clickAndHold(notRevert).moveToElement(drophere).release().perform();
        Thread.sleep(1000);
        WebElement simple = driver.findElement(By.cssSelector("div.left-pannel"));
        actions.clickAndHold(notRevert).moveToElement(simple).release().perform();
        Thread.sleep(3000);
    }

    @Test
    void resizable() throws InterruptedException {
        driver.get("https://demoqa.com/resizable");
        WebElement btn = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.clickAndHold(btn).moveByOffset(250,100).release().build().perform();
        WebElement btn2 = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[2]"));
        actions.scrollByAmount(500,500).perform();
        Thread.sleep(2000);
        actions.clickAndHold(btn2).moveByOffset(250, 200).release().build().perform();
        Thread.sleep(3000);
    }
}
