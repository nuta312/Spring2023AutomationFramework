package selenium.demo.lesson3;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import static org.testng.Assert.assertTrue;

public class ActionsDemo extends BaseTest {


//    @Test
//    void demo1() throws InterruptedException {
//
//        Actions actions = new Actions(driver);
//        driver.get("https://demoqa.com/buttons");
//        WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//
//        actions.doubleClick(doubleClick).perform();
//        assertTrue(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).isDisplayed());
//
//        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
//        actions.contextClick(rightClick).perform();
//        Thread.sleep(5000);
//
//        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
//        actions.click(clickMe).perform();
//        Thread.sleep(3000);
//
//    }

    @Test
    void resizeTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/resizable");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 150);");
        Thread.sleep(5000);

        WebElement resizeBtn = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']"));
        Dimension expectedSize = new Dimension(500, 300);

        actions.moveToElement(resizeBtn).clickAndHold(resizeBtn).moveByOffset(500, 300).perform();
        Thread.sleep(5000);

        WebElement resultSize = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']"));
        Assert.assertEquals(resultSize.getSize(), expectedSize);

    }

    @Test(dependsOnMethods = "resizeTest")
    void droppableTestSimple() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/droppable");
        Thread.sleep(3000);


        WebElement dragMeBtn = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dragSpot = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));

        actions.moveToElement(dragMeBtn).clickAndHold(dragMeBtn).moveToElement(dragSpot).release().perform();
        Thread.sleep(3000);

        WebElement resultDragMe = driver.findElement(By.xpath("//p[normalize-space()='Dropped!']"));
        Assert.assertEquals(resultDragMe.getText(), "Dropped!");

    }

    @Test(dependsOnMethods = "droppableTestSimple")
    void droppableTestAccept() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement acceptBtn = driver.findElement(By.xpath("//a[@id = 'droppableExample-tab-accept']"));
        acceptBtn.click();
        Thread.sleep(3000);

        WebElement notAcceptableBtn = driver.findElement(By.cssSelector("#notAcceptable"));
        WebElement dragSpot = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));

        actions.moveToElement(notAcceptableBtn).clickAndHold(notAcceptableBtn).moveToElement(dragSpot).release().perform();
        Thread.sleep(2000);

        WebElement resultDragMe = driver.findElement(By.xpath("(//p[contains(text(),'Drop here')])[1]"));
        Assert.assertEquals(resultDragMe.getText(), "Drop here");

        WebElement acceptableBtn = driver.findElement(By.cssSelector("#acceptable"));
        actions.moveToElement(acceptableBtn).clickAndHold(acceptableBtn).moveToElement(dragSpot).release().perform();
        Thread.sleep(2000);

        WebElement acceptDropResult = driver.findElement(By.cssSelector("div[id='acceptDropContainer'] p"));
        Assert.assertEquals(acceptDropResult.getText(), "Dropped!");


    }
    @Test(dependsOnMethods = "droppableTestAccept")
    void DragSimple2() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/dragabble");
        WebElement drageMeBtn = driver.findElement(By.id("dragBox"));
        Point firstPosition = drageMeBtn.getLocation();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 150);");
        actions.dragAndDropBy(drageMeBtn,300,200).perform();
        Thread.sleep(3000);
        Point newPosition = drageMeBtn.getLocation();
        Assert.assertNotEquals(newPosition,firstPosition);
        Thread.sleep(3000);


    }


}