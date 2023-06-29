package selenium.demo.nambaFoodHomeWork.Dastan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class CheckBox extends BaseTest {
    @Test
    void testRadioBtn() {

        WebElement homeBtn = driver.findElement(By.xpath("(//button[@class = 'rct-collapse rct-collapse-btn'])[1]"));
        homeBtn.click();
    }

    @Test(dependsOnMethods = "testRadioBtn")
    void checkBtnIsDisplayed() {
        WebElement desktopBtn = driver.findElement(By.xpath("//span[contains(text(),'Desktop')]"));
        Assert.assertTrue(desktopBtn.isDisplayed());

        WebElement documentsBtn = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
        Assert.assertTrue(documentsBtn.isDisplayed());

        WebElement downloadsBtn = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
        Assert.assertTrue(downloadsBtn.isDisplayed());
    }

    @Test(dependsOnMethods = "checkBtnIsDisplayed")
    void checkDesktopBtn() {
        WebElement desktopExt = driver.findElement(By.xpath("(//button[@class = 'rct-collapse rct-collapse-btn'])[2]"));
        desktopExt.click();
        WebElement notesBtn = driver.findElement(By.xpath("//span[contains(text(),'Notes')]"));
        WebElement commandsBtn = driver.findElement(By.xpath("//span[contains(text(),'Commands')]"));
        Assert.assertTrue(notesBtn.isDisplayed() && commandsBtn.isDisplayed());
    }

    @Test(dependsOnMethods = "checkDesktopBtn")
    void checkMark() {
        WebElement notesBtn = driver.findElement(By.xpath("//span[contains(text(),'Notes')]"));
        notesBtn.click();
        WebElement commandsBtn = driver.findElement(By.xpath("//span[contains(text(),'Commands')]"));
        commandsBtn.click();
        String listOfSelected = driver.findElement(By.xpath("//div[@id='result']")).getText();
        Assert.assertEquals(listOfSelected,"You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands");

    }


}
