package selenium.demo.nambaFoodHomeWork.aidinNumba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

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
    @Test
    public void secondTest(){
        driver.get("https://demoqa.com/checkbox");
        WebElement down = driver.findElement(By.xpath("//button[@aria-label=\"Toggle\"]"));
        down.click();

        WebElement desktop = driver.findElement(By.xpath("(//button[@aria-label=\"Toggle\"])[2]"));
        desktop.click();

        WebElement documents = driver.findElement(By.xpath("(//button[@aria-label=\"Toggle\"])[3]"));
        documents.click();

        WebElement downloads = driver.findElement(By.xpath("(//button[@aria-label=\"Toggle\"])[6]"));
        downloads.click();
        // открытие всех вкладок

        driver.findElement(By.xpath("//label[@for=\"tree-node-notes\"]")).click(); // Notes click
        driver.findElement(By.xpath("//label[@for=\"tree-node-commands\"]")).click(); // Commands click
        WebElement desktopRes = driver.findElement(By.xpath("//label[@for=\"tree-node-desktop\"]"));
        Assert.assertTrue(desktopRes.isEnabled());
        if (desktopRes.isEnabled()){
            System.out.println("desktop Enabled");
        }
        // DesktopRes

        driver.findElement(By.xpath("//label[@for=\"tree-node-workspace\"]")).click();// workspace click
        driver.findElement(By.xpath("//label[@for=\"tree-node-office\"]")).click();// office click
        WebElement documentsRes = driver.findElement(By.xpath("//label[@for=\"tree-node-documents\"]"));
        Assert.assertTrue(documentsRes.isEnabled());
        if (documentsRes.isEnabled()){
            System.out.println("documents Enabled");
        }
        // DocumentsRes

        driver.findElement(By.xpath("//label[@for=\"tree-node-wordFile\"]")).click();// wordFile click
        driver.findElement(By.xpath("//label[@for=\"tree-node-excelFile\"]")).click();// excelFile click
        WebElement downloadsRes = driver.findElement(By.xpath("//label[@for=\"tree-node-downloads\"]"));
        Assert.assertTrue(downloadsRes.isEnabled());
        if (downloadsRes.isEnabled()){
            System.out.println("downloads Enabled");
        }

        WebElement res = driver.findElement(By.xpath("//div[@class=\"display-result mt-4\"]"));
        Assert.assertEquals(res.getText(), "You have selected :\n" +
                "home\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" +
                "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" +
                "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile" );
    }
}
