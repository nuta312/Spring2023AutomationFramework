package selenium.demo.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckButton extends BaseTestHome {

    @Test
    void checkButtonTest() {
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

        WebElement pointer = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[48]"));
        pointer.click();

        WebElement desktopBtn = driver.findElement(By.xpath("//span[contains(text(),'Desktop')]"));
        Assert.assertTrue(desktopBtn.isDisplayed());

        WebElement documentsBtn = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
        Assert.assertTrue(documentsBtn.isDisplayed());

        WebElement downloadsBtn = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
        Assert.assertTrue(downloadsBtn.isDisplayed());

        WebElement deskBtn = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[51]"));
        deskBtn.click();

        WebElement notesBtn = driver.findElement(By.xpath("//*[text()='Notes']"));
        Assert.assertTrue(notesBtn.isDisplayed());

        WebElement commandsBtn = driver.findElement(By.xpath("//*[text()='Commands']"));
        Assert.assertTrue(commandsBtn.isDisplayed());

        WebElement documentBtn = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[58]"));
        documentBtn.click();

        WebElement workSpaceBtn = driver.findElement(By.xpath("//span[contains(text(),'WorkSpace')]"));
        Assert.assertTrue(workSpaceBtn.isDisplayed());
        WebElement officeBtn = driver.findElement(By.xpath("//span[contains(text(),'Office')]"));
        Assert.assertTrue(officeBtn.isDisplayed());

        WebElement workSpaceBtnResult = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[61]"));
        workSpaceBtnResult.click();
        WebElement react = driver.findElement(By.xpath("//span[text()='React']"));
        Assert.assertTrue(react.isDisplayed());

        WebElement angular = driver.findElement(By.xpath("//span[text()='Angular']"));
        Assert.assertTrue(angular.isDisplayed());

        WebElement veu = driver.findElement(By.xpath("//span[text()='Veu']"));
        Assert.assertTrue(veu.isDisplayed());

        WebElement office = driver.findElement(By.xpath("//span[text()='Office']"));
        Assert.assertTrue(office.isDisplayed());

        WebElement officeBtnRes = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[64]"));
        officeBtnRes.click();

//        WebElement publicBtn = driver.findElement(By.xpath("//span[text()='Public']"));
//        Assert.assertTrue(publicBtn.isDisplayed());

//        WebElement privateBtn = driver.findElement(By.xpath("//span[text()='Private']"));
//        Assert.assertTrue(privateBtn.isDisplayed());
//
//        WebElement classifiedBtn = driver.findElement(By.xpath("//span[text()='Classified']"));
//        Assert.assertTrue(classifiedBtn.isDisplayed());
//
//        WebElement generalBtn = driver.findElement(By.xpath("//span[text()='General']"));
//        Assert.assertTrue(generalBtn.isDisplayed());

        WebElement downloadsBtnResult = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[75]"));
        downloadsBtnResult.click();

        WebElement wordFile = driver.findElement(By.xpath("//span[text()='Word File.doc']"));
        Assert.assertTrue(wordFile.isDisplayed());

        WebElement excelFile = driver.findElement(By.xpath("//span[text()='Excel File.doc']"));
        Assert.assertTrue(excelFile.isDisplayed());

    }
}
