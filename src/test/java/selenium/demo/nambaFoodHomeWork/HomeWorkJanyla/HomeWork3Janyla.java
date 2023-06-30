package selenium.demo.nambaFoodHomeWork.HomeWorkJanyla;

import lesson2.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork3Janyla extends BaseTest {
    @Test
    void checkBoxTest() throws InterruptedException {
        driver.get(("https://demoqa.com/checkbox"));

        WebElement clickHomeButton = driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']"));
        clickHomeButton.click();

        WebElement clickHome = driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']"));
        clickHome.click();

        WebElement clickDesktop = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]//*[name()='svg']"));
        clickDesktop.click();


        WebElement clickDocuments = driver.findElement(By.xpath("//li[2]//span[1]//button[1]//*[name()='svg']"));
        clickDocuments.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        Thread.sleep(2000);
        WebElement clickWorkSpace = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]//*[name()='svg']"));
        clickWorkSpace.click();

        WebElement clickOffice = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[2]//span[1]//button[1]//*[name()='svg']"));
        clickOffice.click();


        WebElement clickDownloads = driver.findElement(By.xpath("//li[3]//span[1]//button[1]//*[name()='svg']"));
        clickDownloads.click();


        WebElement result = driver.findElement(By.xpath("//div[@id='result']"));
        Assert.assertTrue(result.getText().contains("home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile"));
        Assert.assertTrue(result.isDisplayed());


//        WebElement result = driver.findElement(By.tagName("div"));
//        Assert.assertTrue(result.getText().contains("home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile"));
////        Assert.assertTrue(clickHome.isEnabled());


    }


}

