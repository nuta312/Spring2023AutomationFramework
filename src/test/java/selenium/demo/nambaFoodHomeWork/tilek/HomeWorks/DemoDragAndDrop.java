package selenium.demo.nambaFoodHomeWork.tilek.HomeWorks;

import com.digitalnomads.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.demo.nambaFoodHomeWork.tilek.practice.BaseTestbyTilek;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class DemoDragAndDrop extends BaseTestbyTilek {



    @Test
    void simpleTest(){
        driver.navigate().to("https://demoqa.com/droppable");
        WebElement dragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropHere = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
//        actions.clickAndHold(dragMe).moveToElement(dropHere).perform();
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe,dropHere).perform();
        assertTrue(driver.findElement(By.xpath("(//div[@id='droppable']/p)[1]")).isDisplayed());
    }

    @Test
    void acceptTest() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[text()='Accept']")).click();
        WebElement acceptable = driver.findElement(By.xpath("//div[text()='Acceptable']"));
        WebElement dropHere = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(acceptable,dropHere).perform();
        assertTrue(driver.findElement(By.xpath("(//div[@id='droppable']/p)[2]")).isDisplayed());
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[text()='Accept']")).click();
        WebElement notAcceptable = driver.findElement(By.xpath("//div[text()='Not  Acceptable']"));
        WebElement dropHere1 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
        actions.dragAndDrop(notAcceptable,dropHere1).perform();
            assertTrue(driver.findElement(By.xpath("(//div[@id='droppable'])[2]")).isDisplayed());
    }

    @Test
    void preventTest() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[text()='Prevent Propogation']")).click();
        Actions actions = new Actions(driver);
        WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag Me']"));
        WebElement outerBox = driver.findElement(By.xpath("//div[@id='notGreedyDropBox']/p"));
        actions.dragAndDrop(dragMe,outerBox).perform();
        assertTrue(driver.findElement(By.xpath("//div[@id='notGreedyDropBox']/p")).isDisplayed());

        WebElement movedDragMe = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[4]"));
        WebElement innerBox = driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']/p"));
        actions.dragAndDrop(movedDragMe,innerBox).click().perform();
        assertTrue(driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']/p")).getText().equals("Dropped!"));


        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[text()='Prevent Propogation']")).click();
        WebElement dragMe1 = driver.findElement(By.xpath("//div[text()='Drag Me']"));
        WebElement outBox = driver.findElement(By.xpath("//div[@id='greedyDropBox']/p"));
        WebElementActions.scrollToElement(driver,outBox);
        actions.dragAndDrop(dragMe1,outBox).perform();
        Thread.sleep(3000);
        assertTrue(driver.findElement(By.xpath("//div[@id='greedyDropBox']/p")).getText().equals("Dropped!"));

        WebElement box = driver.findElement(By.xpath("//div[@id='greedyDropBox']"));
        WebElement dragBox = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[4]"));
        WebElement inBox = driver.findElement(By.xpath("//div[@id='greedyDropBoxInner']/p"));
        WebElementActions.scrollToElement(driver,inBox);
        Thread.sleep(2000);
        actions.clickAndHold(dragBox).perform();
        actions.moveToElement(inBox).perform();
        actions.release().perform();
        assertTrue(driver.findElement(By.xpath("//div[@id='greedyDropBoxInner']/p")).getText().equals("Dropped!"));
    }

    @Test
    void revertTest() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[@id='droppableExample-tab-revertable']")).click();
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        WebElement reverBtn = driver.findElement(By.xpath("//div[@id='revertable']"));
        WebElement notRevertBtn = driver.findElement(By.xpath("//div[@id='notRevertable']"));
        WebElement mainBox = driver.findElement(By.xpath("(//div[@id='droppable'])[3]"));
        actions.dragAndDrop(reverBtn,mainBox).perform();
        assertTrue(driver.findElement(By.xpath("(//div[@id='droppable']/p)[3]")).getText().equals("Dropped!"));
        actions.dragAndDrop(notRevertBtn,mainBox).perform();
    }
}
