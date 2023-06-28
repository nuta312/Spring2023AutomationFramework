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
        if (desktop.isEnabled()){
            System.out.println("desktop yes");
        }

        WebElement documents = driver.findElement(By.xpath("//label[@for=\"tree-node-documents\"]"));
        Assert.assertTrue(documents.isEnabled());
        if (documents.isEnabled()){
            System.out.println("documents yes");
        }
        WebElement downloads = driver.findElement(By.xpath("//label[@for=\"tree-node-downloads\"]"));
        Assert.assertTrue(downloads.isEnabled());
        if (downloads.isEnabled()){
            System.out.println("downloads yes");
        }


    }
}
