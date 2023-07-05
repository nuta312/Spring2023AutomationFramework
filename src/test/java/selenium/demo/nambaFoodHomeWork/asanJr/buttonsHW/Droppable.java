package selenium.demo.nambaFoodHomeWork.asanJr.buttonsHW;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class Droppable extends BaseTest {
    @Test
    public void simpleTest() {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        WebElement dragMeElement = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement dropHereElement = driver
                .findElement(By.xpath("//div[@id=\"simpleDropContainer\"]//div[@id=\"droppable\"]//p"));
        String dropHere = dropHereElement.getText();
        actions.dragAndDrop(dragMeElement, dropHereElement).perform();
        Assert.assertTrue(dropHereElement.getText().equals("Dropped!"));
        String dropped = dropHereElement.getText();
        Assert.assertNotEquals(dropped, dropHere);
    }

    @Test
    public void acceptTest() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Accept");
        WebElement notAcceptable = driver.findElement(By.xpath("//div[@id=\"notAcceptable\"]"));
        WebElement dropHereElement = driver
                .findElement(By.xpath("//div[@id=\"acceptDropContainer\"]//div[@id=\"droppable\"]//p"));
        Thread.sleep(3000);
        String dropHereTextBefore = dropHereElement.getText();
        actions.dragAndDrop(notAcceptable, dropHereElement).perform();

        String dropHereTextAfter = dropHereElement.getText();
        Assert.assertEquals(dropHereTextBefore, dropHereTextAfter);


        WebElement acceptable = driver.findElement(By.xpath("//div[@id=\"acceptable\"]"));
        String droppedTextBefore = dropHereElement.getText();
        actions.dragAndDrop(acceptable, dropHereElement).perform();

        String droppedTextAfter = dropHereElement.getText();
        Assert.assertNotEquals(droppedTextBefore, droppedTextAfter);
    }

    @Test
    public void PreventPropogationNotGreedy() {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Prevent Propogation");


        WebElement dragMeButton = driver.findElement(By.id("dragBox"));
        WebElement notGreedyInnerDropBox = driver.findElement(By.id("notGreedyInnerDropBox"));
        WebElement notGreedyDropBox = driver.findElement(By.id("notGreedyDropBox"));

        String notGreedyInnerText = notGreedyInnerDropBox.getText();
        String notGreedyDropBoxText = notGreedyDropBox.getText();

        actions.dragAndDrop(dragMeButton, notGreedyInnerDropBox).perform();

        String afterNotGreedyInnerText = notGreedyInnerDropBox.getText();
        String afterNotGreedyDropBoxText = notGreedyDropBox.getText();
        Assert.assertNotEquals(notGreedyInnerText, afterNotGreedyInnerText);
        Assert.assertNotEquals(notGreedyDropBoxText, afterNotGreedyDropBoxText);
    }

    @Test
    public void PreventPropogationGreedy() {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Prevent Propogation");


        WebElement greedyDropBox = driver.findElement(By.xpath("//div[@id=\"greedyDropBox\"]/p"));
        WebElement greedyDropBoxInner = driver
                .findElement(By.xpath("//div[@id=\"greedyDropBoxInner\"]//p"));
        WebElement dragBox = driver.findElement(By.id("dragBox"));

        String beforeGreedyDropBoxText = greedyDropBox.getText();
        String beforeGreedyDropBoxInnerText = greedyDropBoxInner.getText();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", greedyDropBoxInner);


        actions.dragAndDrop(dragBox, greedyDropBoxInner).perform();


        String afterGreedyDropBoxText = greedyDropBox.getText();
        String afterGreedyDropBoxInnerText = greedyDropBoxInner.getText();


        Assert.assertEquals(beforeGreedyDropBoxText, afterGreedyDropBoxText);
        Assert.assertNotEquals(beforeGreedyDropBoxInnerText, afterGreedyDropBoxInnerText);


        actions.dragAndDrop(dragBox, greedyDropBox).perform();
        String afterAfterGreedyDropBoxText = greedyDropBox.getText();
        Assert.assertNotEquals(afterGreedyDropBoxText, afterAfterGreedyDropBoxText);

    }


    @Test
    public void revertDraggable() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Revert Draggable");


        WebElement revertable = driver.findElement(By.xpath("//div[@id=\"revertable\"]"));
        WebElement droppable = driver
                .findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id=\"droppable\"]"));

        Point beforeRevertable = revertable.getLocation();
        String beforeDroppableText = droppable.getText();

        actions.dragAndDrop(revertable, droppable).perform();
        String afterDroppableText = droppable.getText();
        Assert.assertNotEquals(beforeDroppableText, afterDroppableText);
        Thread.sleep(1000);
        Point afterRevertable = revertable.getLocation();
        Assert.assertEquals(beforeRevertable, afterRevertable);


    }

    @Test
    public void revertNotDraggable() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        clickTab("Revert Draggable");

        WebElement notRevertable = driver.findElement(By.xpath("//div[@id=\"notRevertable\"]"));
        WebElement droppable = driver
                .findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id=\"droppable\"]"));


        Point beforeNotRevertable = notRevertable.getLocation();
        String beforeDroppableText = droppable.getText();

        actions.dragAndDrop(notRevertable, droppable).perform();
        String afterDroppableText = droppable.getText();
        Assert.assertNotEquals(beforeDroppableText, afterDroppableText);

        Point afterNotRevertable = notRevertable.getLocation();
        Assert.assertNotEquals(beforeNotRevertable, afterNotRevertable);
    }

    public void clickTab(String tabName) {
//        WebElement tab = driver.findElement(By.xpath("//a[text()='"+tabName+"]"));
        String xPath = String.format("//a[text()='%s']", tabName);
        WebElement tab = driver.findElement(By.xpath(xPath));
        tab.click();
    }

}
