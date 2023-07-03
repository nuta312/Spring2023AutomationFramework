package selenium.demo.nambaFoodHomeWork.baiasov.interaction_HW;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class Interaction extends Abstract_2{

    @Test

    void taskDroppable() throws InterruptedException{
        driver.navigate().to("https://demoqa.com/droppable");
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));
        Assert.assertTrue(targetElement.isEnabled());

        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();// I got it from internet
        Thread.sleep(3000);

        WebElement acceptBtn = driver.findElement(By.id("droppableExample-tab-accept"));
        acceptBtn.click();
        Thread.sleep(3000);

        WebElement acceptable = driver.findElement(By.xpath("//*[@id='acceptable']"));
        WebElement moveElement= driver.findElement(By.xpath("(//*[@id='droppable'])[2]"));
        Thread.sleep(3000);
        actions.clickAndHold(acceptable).moveToElement(moveElement).release().build().perform();
        Thread.sleep(3000);
        WebElement notAcceptable= driver.findElement(By.xpath("//*[@id='notAcceptable']"));
        actions.clickAndHold(notAcceptable).moveToElement(moveElement).release().build().perform();

        WebElement acceptElement = driver.findElement(By.tagName("body"));
        String pageContent = acceptElement.getText();


        // Check if the acceptable text is present
        if (pageContent.contains("Acceptable Text")){
            System.out.println("Acceptable Text found!");
            // Perform actions for acceptable text
        }else if (pageContent.contains("Not Acceptable Text")){
            System.out.println("Not Acceptable Text found!");
            // Perform actions for not acceptable text
        }else {
            System.out.println("Neither Acceptable nor Not Acceptable Text found!");
        }


        WebElement preventProBtn = driver.findElement(By.id("droppableExample-tab-preventPropogation"));
        preventProBtn.click();
        Thread.sleep(3000);

        WebElement dragBox= driver.findElement(By.xpath("//div[@id='dragBox']"));
        WebElement notGreedy = driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));
        Thread.sleep(3000);
        actions.clickAndHold(dragBox).moveToElement(notGreedy).release().build().perform();
        Thread.sleep(3000);
        WebElement dropped = driver.findElement(By.xpath("//div[@id='greedyDropBox']"));
        actions.clickAndHold(dragBox).moveToElement(dropped).release().build().perform();
        Thread.sleep(3000);

        WebElement revertBTN = driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-revertable\"]"));
        revertBTN.click();
        //  WebElement willRevert = driver.findElement(By.id("revertable"));
        //  actions.clickAndHold(willRevert).pause(Duration.ofSeconds(2)).moveToElement(moveElement).pause(Duration.ofSeconds(2)).release().build().perform();

    }

    @Test
    void taskResizeable() throws InterruptedException {



    }




















    @Test

    void taskResizable(){
        driver.navigate().to("https://demoqa.com/resizable");
        WebElement minElement = driver.findElement(By.id("resizableBoxWithRestriction"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(minElement).moveByOffset(500,300);
    }
}
