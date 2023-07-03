package selenium.demo.nambaFoodHomeWork.tilekNamba;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.nambaFoodHomeWork.tilekNamba.practice.BaseTestbyTilek;

public class DemoqaTest extends BaseTestbyTilek {

    @Test
    void checkBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");
        WebElement homeTitle = driver.findElement(By.xpath("//span[@class = 'rct-checkbox']"));
        homeTitle.click();

        WebElement scrollDownBtn = driver.findElement(By.xpath("//button[@class = 'rct-collapse rct-collapse-btn']"));
        scrollDownBtn.click();
        WebElement dekstopResult = driver.findElement(By.xpath("//span[text()='Desktop']"));
        WebElement documentsResult = driver.findElement(By.xpath("//span[text()='Documents']"));
        WebElement downloadsResult = driver.findElement(By.xpath("//span[text()='Downloads']"));
        Assert.assertTrue(dekstopResult.isDisplayed());
        Assert.assertTrue(documentsResult.isDisplayed());
        Assert.assertTrue(downloadsResult.isDisplayed());

        WebElement scrollDownDekstop = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[2]"));
        scrollDownDekstop.click();
        WebElement notes = driver.findElement(By.xpath("//span[text()='Notes']"));
        WebElement commands = driver.findElement(By.xpath("//span[text()='Commands']"));
        Assert.assertTrue(notes.isDisplayed());
        Assert.assertTrue(commands.isDisplayed());

        WebElement scrollDownDocuments= driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[3]"));
        scrollDownDocuments.click();
        WebElement workSpace = driver.findElement(By.xpath("//span[text()='WorkSpace']"));
        WebElement office = driver.findElement(By.xpath("//span[text()='Office']"));
        Assert.assertTrue(workSpace.isDisplayed());
        Assert.assertTrue(office.isDisplayed());

        WebElement scrollDownDownloads= driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[6]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", scrollDownDownloads);
        scrollDownDownloads.click();
        WebElement wordFile = driver.findElement(By.xpath("//span[text()='Word File.doc']"));
        WebElement excelFile = driver.findElement(By.xpath("//span[text()='Excel File.doc']"));
        Assert.assertTrue(wordFile.isDisplayed());
        Assert.assertTrue(excelFile.isDisplayed());


    }
}
