package selenium.demo.nambaFoodHomeWork.ChikaHomeWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class CheckBox extends BaseTest {
    @Test
    void checkBox() {
        driver.get("https://demoqa.com/checkbox");
        driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Desktop']")).isDisplayed());
        driver.findElement(By.xpath("//span[text()='Desktop']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='You have selected :']//..")).isDisplayed());
        driver.findElement(By.xpath("(//button[@aria-label='Toggle'])[3]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='rct-text'])[5]/label/span[3]")).getText(), "Office");
        driver.findElement(By.xpath("(//span[@class='rct-text'])[5]/label")).click();
        driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
    }
    @Test
    void check () throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//a[@id='droppableExample-tab-revertable']")).click();
        WebElement dropme = driver.findElement(By.cssSelector("div#revertable"));
        WebElement droped = driver.findElement(By.xpath("(//div[@id='droppable'])[3]"));
        actions.clickAndHold(dropme)
                .moveToElement(droped).release().perform();
        Thread.sleep(5000);
    }
}
