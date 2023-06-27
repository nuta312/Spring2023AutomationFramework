package selenium.demo.lesson2Alisher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RaioButton extends BaseTest{

    @Test
    void radioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadioBtn = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadioBtn.click();
        WebElement yesResult = driver.findElement(By.tagName("p"));
        Assert.assertTrue(yesResult.getText().contains("You have selected Yes"));
        Assert.assertTrue(yesRadioBtn.isEnabled());

        // impressive Radio

        WebElement impessiveRadioBtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impessiveRadioBtn.click();
        Assert.assertTrue(yesResult.getText().contains("You have selected Yes"));
        WebElement doULikeThisSite = driver.findElement(By.xpath("//div[text()='Doo you like this site]"));
        Assert.assertTrue(doULikeThisSite.isDisplayed());


    }



}
