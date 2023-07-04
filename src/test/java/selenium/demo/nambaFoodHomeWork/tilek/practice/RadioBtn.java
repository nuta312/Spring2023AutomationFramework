package selenium.demo.nambaFoodHomeWork.tilek.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RadioBtn extends BaseTestbyTilek{

    @Test
    void radioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadioBtn = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadioBtn.click();

        WebElement result = driver.findElement(By.tagName("p"));
        Assert.assertTrue(result.getText().contains("You have selected Yes"));
        Assert.assertTrue(yesRadioBtn.isDisplayed());

        //ImpressiveButton
        WebElement impressiveBtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveBtn.click();
        Assert.assertTrue(result.getText().contains("You have selected Impressive"));
        Assert.assertTrue(impressiveBtn.isDisplayed());

        WebElement doYouLikeThisSite = driver.findElement(By.xpath("//div[text() = 'Do you like the site?']"));
        Assert.assertTrue(doYouLikeThisSite.isDisplayed());
    }

}
