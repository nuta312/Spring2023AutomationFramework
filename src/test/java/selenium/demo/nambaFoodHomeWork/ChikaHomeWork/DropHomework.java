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
    void accept () throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.cssSelector("a#droppableExample-tab-accept")).click();
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.xpath("//div[text()='Not  Acceptable']/../following-sibling::div/p")).getText(),"Drop here");
        WebElement notAcceptable = driver.findElement(By.xpath("//div[text()='Not  Acceptable']"));
        WebElement dropHere = driver.findElement(By.xpath("//div[text()='Not  Acceptable']/../following-sibling::div"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(notAcceptable).moveToElement(dropHere).release().perform();
        Thread.sleep(2000);
        assertEquals(driver.findElement(By.xpath("//div[text()='Not  Acceptable']/../following-sibling::div/p")).getText(),"Drop here");
        Thread.sleep(3000);
        WebElement acceptable = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[2]"));
        actions.clickAndHold(acceptable).moveToElement(dropHere).release().perform();
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.xpath("(//div[@id='droppable'])[2]/p")).getText(),"Dropped!");
        Thread.sleep(2000);

    }
    @Test
    void prevent () throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[contains(text(),'Prevent P')]")).click();
    }
}
