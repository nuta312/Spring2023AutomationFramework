package selenium.demo.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckButton extends BaseTestHome {

    @Test
    void checkButtonTest(){
        driver.get("https://demoqa.com/checkbox");
        WebElement home= driver.findElement(By.xpath("//*[@class = 'rct-title']"));
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

        WebElement desktopBtn = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[51]"));
        desktopBtn.click();
//        WebElement result1 = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
//        Assert.assertTrue(result1.getText().equals("//*[text()='You have selected :']"));

        WebElement notesBtn= driver.findElement(By.xpath("//*[text()='Notes']"));
        Assert.assertTrue(notesBtn.isDisplayed());

        WebElement commandsBtn= driver.findElement(By.xpath("//*[text()='Commands']"));
        Assert.assertTrue(commandsBtn.isDisplayed());

//        WebElement documentsBtn = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
//        Assert.assertTrue(documentsBtn.isDisplayed());
//
//        WebElement downloadsBtn = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
//        Assert.assertTrue(downloadsBtn.isDisplayed());




    }
}
