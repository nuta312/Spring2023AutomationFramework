package selenium.demo.nambaFoodHomeWork.syrgak.lesson2.demoqa;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;


public class CheckBoxTestSyrgak extends BaseTest {
    @Test
    void checkBoxTest() {
        driver.get(("https://demoqa.com/checkbox"));
        WebElement clickHome = driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']"));
        clickHome.click();
        WebElement clickDesktop = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]//*[name()='svg']"));
        clickDesktop.click();
        WebElement clickNotes = driver.findElement(By.xpath("//label[@for='tree-node-notes']//span[@class='rct-checkbox']//*[name()='svg']"));
        clickNotes.click();
        WebElement clickCommands = driver.findElement(By.xpath("//label[@for='tree-node-commands']//span[@class='rct-checkbox']//*[name()='svg']"));
        clickCommands.click();
        WebElement clickDocuments = driver.findElement(By.xpath("//li[2]//span[1]//button[1]//*[name()='svg']"));
        clickDocuments.click();
        WebElement clickWorkSpace = driver.findElement(By.xpath("//body//div[@id='app']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]"));
        clickWorkSpace.click();
        WebElement clickWorkSpace2 = driver.findElement(By.xpath("//label[@for='tree-node-workspace']//span[@class='rct-checkbox']//*[name()='svg']"));
        clickWorkSpace2.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        WebElement clickOffice = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']//button[@title='Toggle']//*[name()='svg']"));
        clickOffice.click();
        WebElement clickOffice2 = driver.findElement(By.xpath("//label[@for='tree-node-office']//span[@class='rct-checkbox']//*[name()='svg']"));
        clickOffice2.click();
        WebElement clickDownloads = driver.findElement(By.xpath("//li[3]//span[1]//button[1]//*[name()='svg']"));
        clickDownloads.click();
        WebElement clickDownloads2 = driver.findElement(By.xpath("//label[@for='tree-node-downloads']//span[@class='rct-checkbox']//*[name()='svg']"));
        clickDownloads2.click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='result']")).isDisplayed());
//        Assert.assertTrue(result.getText().contains("You have selected : home,desktop,notes,commands,documents,workspace,react,angular,veu,office,public,private,classified,general,downloads,wordFile, excelFile"));
//        Assert.assertTrue(clickHome.isEnabled());
    }
}
