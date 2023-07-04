package seleniun.demo.homework.checkbox;

import com.digitalnomads.selenium.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class CheckBox extends BaseTest {
    @Test
    public void CheckBoxTest() {
        driver.navigate().to("https://demoqa.com/checkbox");
        WebElement home = driver.findElement(By.xpath("//*[@class = 'rct-title']"));
        home.click();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertTrue(result.getText().contains("You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile"));

        WebElement ok = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[48]"));
        ok.click();

        WebElement desktopClc = driver.findElement(By.xpath("//span[contains(text(),'Desktop')]"));
        Assert.assertTrue(desktopClc.isDisplayed());

        WebElement documentsClc = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
        Assert.assertTrue(documentsClc.isDisplayed());

        WebElement downloadsClc = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
        Assert.assertTrue(downloadsClc.isDisplayed());

        WebElement deskClc = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[51]"));
        deskClc.click();

        WebElement notesClc = driver.findElement(By.xpath("//*[text()='Notes']"));
        Assert.assertTrue(notesClc.isDisplayed());

        WebElement commandsClc = driver.findElement(By.xpath("//*[text()='Commands']"));
        Assert.assertTrue(commandsClc.isDisplayed());

        WebElement documentClc = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[58]"));
        documentClc.click();

        WebElement workSpaceClc = driver.findElement(By.xpath("//span[contains(text(),'WorkSpace')]"));
        Assert.assertTrue(workSpaceClc.isDisplayed());

        WebElement officeClc = driver.findElement(By.xpath("//span[contains(text(),'Office')]"));
        Assert.assertTrue(officeClc.isDisplayed());


        WebElement workSpaceClcResult = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[61]"));
        WebElementActions.scrollToElement(driver, workSpaceClcResult);
        workSpaceClcResult.click();

        WebElement react = driver.findElement(By.xpath("//span[text()='React']"));
        Assert.assertTrue(react.isDisplayed());

        WebElement angular = driver.findElement(By.xpath("//span[text()='Angular']"));
        Assert.assertTrue(angular.isDisplayed());

        WebElement veu = driver.findElement(By.xpath("//span[text()='Veu']"));
        Assert.assertTrue(veu.isDisplayed());

        WebElement office = driver.findElement(By.xpath("//span[text()='Office']"));
        Assert.assertTrue(office.isDisplayed());

        WebElement officeClcResult = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[64]"));
        officeClcResult.click();

        WebElement downloadsClcResult = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[75]"));
        downloadsClcResult.click();

        WebElement wordFile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]/svg"));
        Assert.assertTrue(wordFile.isDisplayed());

        WebElement excelFile = driver.findElement(By.xpath("//span[text()='Excel File.doc']"));
        Assert.assertTrue(excelFile.isDisplayed());

    }
}
