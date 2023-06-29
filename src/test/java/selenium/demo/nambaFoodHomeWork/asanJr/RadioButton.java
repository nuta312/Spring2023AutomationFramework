package selenium.demo.nambaFoodHomeWork.asanJr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseTest{
    @Test
    void redioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadioButton = driver.findElement(By.xpath("//label[@for=\"yesRadio\"]"));
        yesRadioButton.click();

        WebElement yesRadioButtonResult = driver.findElement(By.tagName("p"));
        Assert.assertTrue(yesRadioButtonResult.getText().contains("You have selected"));
        Assert.assertTrue(yesRadioButtonResult.isEnabled());


        //impressiveRadio

        WebElement impressiveRadioButton = driver
                .findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadioButton.click();
        Assert.assertTrue(yesRadioButtonResult.getText().contains("You have selected"));
        WebElement doYouLikeThisSite = driver
                .findElement(By.xpath("//div[text()='Do you like the site?']"));
        Assert.assertTrue(doYouLikeThisSite.isDisplayed());
    }
}
