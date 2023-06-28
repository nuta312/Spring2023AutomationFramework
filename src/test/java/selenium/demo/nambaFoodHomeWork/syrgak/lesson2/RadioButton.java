package selenium.demo.nambaFoodHomeWork.syrgak.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseTest{
    @Test
    void radioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadioBtn = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadioBtn.click();
        WebElement yesResult = driver.findElement(By.tagName("p"));
        Assert.assertTrue(yesResult.getText().contains("You have selected Yes"));
        Assert.assertTrue(yesRadioBtn.isEnabled());

        //impressiveRadio

        WebElement impressiveRadio = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadio.click();
        Assert.assertTrue(yesResult.getText().contains("You have selected Impressive"));
        WebElement doYouLikeThisSite = driver.findElement(By.xpath("//div[text()='Do you like this site"));
        Assert.assertTrue(doYouLikeThisSite.isDisplayed());

    }
}
