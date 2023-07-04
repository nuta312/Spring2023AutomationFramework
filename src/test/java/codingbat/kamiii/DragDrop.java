package codingbat.kamiii;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class DragDrop  extends BaseTest {

    @Test
    void dragMe() throws InterruptedException {

        driver.get("https://demoqa.com/droppable");
        WebElement drag=driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[1]"));
        WebElement drop=driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[1]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.clickAndHold(drag).moveToElement(drop).release().perform();


        String droppedText = drop.getText();
        String expectedText = "Dropped!";

        Assert.assertEquals(expectedText, droppedText);

//        driver.quit();


    }

    
}
