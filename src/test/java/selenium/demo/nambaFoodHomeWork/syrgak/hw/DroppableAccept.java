package selenium.demo.nambaFoodHomeWork.syrgak.hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;
public class DroppableAccept extends BaseTest{
//    @Test
//    void accept() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        driver.get("https://demoqa.com/droppable");
//        driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']")).click();
//        WebElement acceptable =driver.findElement(By.id("acceptable"));
//        WebElement dropBox = driver.findElement(By.xpath("//div[text()='Not  Acceptable']/../following-sibling::div"));
//        actions.moveToElement(acceptable).clickAndHold(acceptable).moveToElement(dropBox).release().perform();
//        Thread.sleep(3000);
//        WebElement result = driver.findElement(By.xpath("//p[normalize-space()='Dropped!']"));
//        Assert.assertEquals(result.getText(),"Dropped!");
//    }
    @Test
    void notAcceptable() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']")).click();
        WebElement notAccept = driver.findElement(By.id("notAcceptable"));
        WebElement dropHere = driver.findElement(By.xpath("//div[text()='Acceptable']/../following-sibling::div\""));
        actions.moveToElement(notAccept).clickAndHold(notAccept).moveToElement(dropHere).release().perform();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-preventPropogation']"));
        Assert.assertEquals(result.getText(),"");

    }
}
