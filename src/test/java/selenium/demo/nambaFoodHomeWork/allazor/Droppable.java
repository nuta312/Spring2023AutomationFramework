package selenium.demo.nambaFoodHomeWork.allazor;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class Droppable extends BaseTest {

    @Test
    void simpleTest() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(dragMe,drop).perform();
        Assert.assertEquals("Dropped!", drop.getText());
    }

    @Test
    void acceptTest() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Accept");
        Thread.sleep(2000);


        WebElement notAcceptable = driver.findElement(By.id("notAcceptable"));
        WebElement drop = driver.findElement
                (By.xpath("//div[@id=\"droppableExample-tabpane-accept\"]//div[@id=\"droppable\"]"));
        String beforeDrop = drop.getText();
        actions.dragAndDrop(notAcceptable,drop).perform();
        Thread.sleep(5000);
        String afterDrop = drop.getText();
        Assert.assertEquals(beforeDrop,afterDrop);

        WebElement acceptable = driver.findElement(By.id("acceptable"));
        actions.dragAndDrop(acceptable,drop).perform();
        afterDrop =drop.getText();
        Assert.assertNotEquals(beforeDrop,afterDrop);

    }

    @Test
    void preventPropogationNotGreedyTest() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Prevent Propogation");
        Thread.sleep(2000);

        WebElement dragMe = driver.findElement(By.id("dragBox"));
        WebElement outerDrop = driver.findElement(By.id("notGreedyDropBox"));
        WebElement innerDrop = driver.findElement(By.id("notGreedyInnerDropBox"));
        actions.dragAndDrop(dragMe,innerDrop).perform();
        String outerDropText = outerDrop.getText();
        Assert.assertEquals(outerDropText,"Dropped!\nDropped!");
    }

    @Test
    void preventPropogationGreedyTest() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Prevent Propogation");
        Thread.sleep(2000);

        WebElement dragMe = driver.findElement(By.id("dragBox"));
        WebElement outerDrop = driver.findElement(By.id("greedyDropBox"));
        WebElement innerDrop = driver.findElement(By.id("greedyDropBoxInner"));

        actions.dragAndDrop(dragMe,innerDrop).perform();
        Thread.sleep(2000);
        String innerDropText = innerDrop.getText();
        Assert.assertEquals(innerDropText,"Dropped!");

        actions.clickAndHold(dragMe).moveToElement(outerDrop,0,-70).release().perform();
        String outerDropText = outerDrop.getText();
        Assert.assertEquals(outerDropText,"Dropped!\nDropped!");
    }

    @Test
    void revertDraggable() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Revert Draggable");
        Thread.sleep(2000);

        WebElement willRevert = driver.findElement(By.id("revertable"));
        WebElement  drop = driver.findElement
                (By.xpath("//div[@id=\"droppableExample-tabpane-revertable\"]//div[@id=\"droppable\"]"));
        Point pointBefore = willRevert.getLocation();
        actions.dragAndDrop(willRevert,drop).perform();
        Thread.sleep(2000);
        Point pointAfter = willRevert.getLocation();

        Assert.assertEquals(pointBefore,pointAfter);

        WebElement notRevert = driver.findElement(By.id("notRevertable"));
        Point pointBefore1 = notRevert.getLocation();
        actions.dragAndDrop(notRevert,drop).perform();
        Point pointAfter1 = notRevert.getLocation();
        Assert.assertNotEquals(pointBefore1,pointAfter1);

    }

    public void clickTab(String tabName){
        WebElement tab = driver.findElement(By.xpath("//a[text()='"+tabName+"']"));
        tab.click();

    }
}
