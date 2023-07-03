package selenium.demo.homeWorksLesson3;

import com.digitalnomads.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class DragAndDrop extends BaseTest {
    @Test
    void dragAndDropSimple() {
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement elementDragMe = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[1]"));
        elementDragMe.click();
        WebElementActions.scrollToElement(driver, elementDragMe);
        WebElement elementDrop = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(elementDragMe).moveToElement(elementDrop).release().perform();
        Assert.assertEquals(elementDrop.getText(), "Dropped!");
    }

    @Test
    void dragAndDropAccept() throws InterruptedException {
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement accept = driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
        accept.click();
        WebElementActions.scrollToElement(driver, accept);
        WebElement acceptable = driver.findElement(By.xpath("//div[text()='Acceptable']"));
        WebElement drop = driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[2]"));
        Actions action = new Actions(driver);
        action.clickAndHold(acceptable).moveToElement(drop).release().perform();
        Assert.assertEquals(drop.getText(), "Dropped!");
        driver.navigate().refresh();
        WebElement accept1 = driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
        accept1.click();
        WebElementActions.scrollToElement(driver, accept1);
        WebElement notAcceptable = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[3]"));
        WebElement drop1 = driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[2]"));
        action.clickAndHold(notAcceptable).moveToElement(drop1).release().perform();
        Assert.assertEquals(drop1.getText(), "Drop here");
    }

    @Test
    void preventPropogation() throws InterruptedException {
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement preventPropogationBtn = driver.findElement(By.id("droppableExample-tab-preventPropogation"));
        preventPropogationBtn.click();
        Thread.sleep(5000);
        WebElement elementDragMe = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[4]"));
        WebElementActions.scrollToElement(driver, elementDragMe);
        WebElement elementDrop = driver.findElement(By.id("notGreedyInnerDropBox"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(elementDragMe).perform();
        actions.moveToElement(elementDrop).release().perform();
        Assert.assertEquals(elementDrop.getText(), "Dropped!");
        WebElement greedyBtn = driver.findElement(By.id("greedyDropBoxInner"));
        actions.clickAndHold(elementDragMe).perform();
        actions.moveToElement(greedyBtn).release().perform();
        Assert.assertEquals(greedyBtn.getText(), "Dropped!");
    }

    @Test
    void revertDraggable() throws InterruptedException {
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement revertDraggable = driver.findElement(By.xpath("//a[@id='droppableExample-tab-revertable']"));
        revertDraggable.click();
        Thread.sleep(3000);
        WebElement willRevert = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[5]"));
        WebElementActions.scrollToElement(driver, willRevert);
        Point initialLocation=willRevert.getLocation();
        WebElement drop = driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[5]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(willRevert).moveToElement(drop).release().perform();
        Thread.sleep(3000);
        Point currentLocation=willRevert.getLocation();
        Assert.assertEquals(initialLocation, currentLocation);
        WebElement notRevert = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[6]"));
        actions.clickAndHold(notRevert).moveToElement(drop).release().perform();
        Assert.assertTrue(drop.isDisplayed());
        Assert.assertEquals(drop.getText(), "Dropped!");
//
    }
}

