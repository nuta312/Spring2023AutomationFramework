package selenium.demo.nambaFoodHomeWork.aidinNumba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class Checkbox extends BaseTest {
    @Test
    public void checkboxTest(){
        driver.get("https://demoqa.com/checkbox");
        WebElement down = driver.findElement(By.xpath("//button[@aria-label=\"Toggle\"]"));
        down.click();
        driver.findElement(By.xpath("//label[@for=\"tree-node-home\"]")).click(); // галочка

        WebElement desktop = driver.findElement(By.xpath("//label[@for=\"tree-node-desktop\"]"));
        Assert.assertTrue(desktop.isEnabled());


    }
}
