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
    @Test
    void acceptTest() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[@id=\"droppableExample-tab-accept\"]")).click();

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("notAcceptable"));
        WebElement target = driver.findElement(By.xpath("(//div[@id=\"droppable\"])[2]"));
        actions.dragAndDrop(source, target).perform();
        Assert.assertEquals(target.getText(), "Drop here");
        //перетаскиваем не действующий элемент ^^^

        WebElement sourceTrue = driver.findElement(By.id("acceptable"));
        actions.dragAndDrop(sourceTrue,target).perform();
        Assert.assertEquals(target.getText(), "Dropped!");
        //перетаскиваем действующий элемент ^^^

        Thread.sleep(3000);
    }
    @Test
    void PreventPropogation1() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/droppable");
        driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("dragBox"));
        WebElement target1 = driver.findElement(By.id("notGreedyDropBox"));
        WebElement target3 = driver.findElement(By.id("greedyDropBox"));

        actions.dragAndDropBy(source,300,0).perform();
        System.out.println(target1.getText());

        Assert.assertTrue(target1.getText().equals("Dropped!\n" +
                "Inner droppable (not greedy)"));
        Thread.sleep(3000);
    }
    @Test
    void PreventPropogation2() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/droppable");
        driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("dragBox"));
        WebElement target1 = driver.findElement(By.id("notGreedyDropBox"));
        WebElement target2 = driver.findElement(By.id("notGreedyInnerDropBox"));

        actions.moveToElement(source).clickAndHold().moveToElement(target2).release().perform();

        System.out.println(target1.getText());
        Thread.sleep(3000);

        Assert.assertEquals(target1.getText(),"Dropped!\n" +
                "Dropped!");
    }

}
