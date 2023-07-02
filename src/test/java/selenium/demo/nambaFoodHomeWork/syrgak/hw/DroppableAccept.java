package selenium.demo.nambaFoodHomeWork.syrgak.hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;
public class DroppableAccept extends BaseTest{
    @Test
    void accept() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/droppable");
        WebElement acceptable = driver.findElement(By.id("acceptable"));
        WebElement dropBox = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
        actions.moveToElement(acceptable).clickAndHold(acceptable).moveToElement(dropBox).release().perform();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.xpath("//p[normalize-space()='Dropped!']"));
        Assert.assertEquals(result.getText(),"Dropped!");


    }
}
