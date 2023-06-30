package selenium.demo.nambaFoodHomeWork.ChikaHomeWork;

import lesson2.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
}
