package selenium.demo.HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.time.Duration;
import java.time.Instant;

import static org.testng.AssertJUnit.*;

public class Droppable extends BaseTest {

    @Test
    void DroppableActionsTest() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);

        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement dropHere = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(dragMe,dropHere).perform();

        WebElement acceptBtn= driver.findElement(By.id("droppableExample-tab-accept"));
        acceptBtn.click();
        Thread.sleep(5000);

        WebElement acceptable = driver.findElement(By.xpath("//*[@id='acceptable']"));
        WebElement dropMeHere= driver.findElement(By.xpath("(//*[@id='droppable'])[2]"));
        actions.clickAndHold(acceptable).pause(Duration.ofSeconds(2)).moveToElement(dropMeHere).pause(Duration.ofSeconds(2)).release().build().perform();
        WebElement notAcceptable= driver.findElement(By.xpath("//*[@id='notAcceptable']"));
        actions.clickAndHold(notAcceptable).pause(Duration.ofSeconds(2)).moveToElement(dropMeHere).pause(Duration.ofSeconds(2)).release().build().perform();

        WebElement preventPropogationBtn= driver.findElement(By.id("droppableExample-tab-preventPropogation"));
        preventPropogationBtn.click();
        Thread.sleep(5000);

        WebElement dragBox= driver.findElement(By.xpath("//div[@id='dragBox']"));
        WebElement notGreedy = driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));
        actions.clickAndHold(dragBox).pause(Duration.ofSeconds(2)).moveToElement(notGreedy).pause(Duration.ofSeconds(2)).release().build().perform();
        WebElement dropped = driver.findElement(By.xpath("//div[@id='greedyDropBox']"));
        actions.clickAndHold(dragBox).pause(Duration.ofSeconds(2)).moveToElement(dropped).pause(Duration.ofSeconds(2)).release().build().perform();

//        WebElement revertDraggableBtn =driver.findElement(By.id("droppableExample-tab-revertable"));
//        revertDraggableBtn.click();
//        Thread.sleep(5000);
//
//        WebElement willRevert = driver.findElement(By.xpath("//div[@id='revertable']"));
//        WebElement dropItHere= driver.findElement(By.xpath("(//div[@id='droppable'])[3]"));
//        WebElement revertHere= driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[5]"));



        }
    @Test
    void resizableActionsTest() throws InterruptedException {
        driver.get("https://demoqa.com/resizable");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150);");
        Thread.sleep(5000);

        WebElement resizeBtn = driver.findElement(By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se']"));
        Dimension expectedSize= new Dimension(500,300);

        Actions action = new Actions(driver);
        action.moveToElement(resizeBtn).clickAndHold(resizeBtn).moveByOffset(500,300).perform();
        Thread.sleep(5000);

        WebElement resultSize=driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']"));
        assertEquals(resultSize.getSize(),expectedSize);


    }

}
