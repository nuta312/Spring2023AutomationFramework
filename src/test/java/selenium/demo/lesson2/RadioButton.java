package selenium.demo.lesson2;

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
        WebElement result = driver.findElement(By.tagName("p"));
        Assert.assertTrue(result.getText().contains("You have selected Yes"));
        Assert.assertTrue(yesRadioBtn.isEnabled());

        //impressiveRadio

        WebElement impressiveRadioBtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadioBtn.click();
        Assert.assertTrue(result.getText().contains("You have selected Impressive"));
        WebElement doULikeThisSite = driver.findElement(By.xpath("//div[text()='Do you like the site?']"));
        Assert.assertTrue(doULikeThisSite.isDisplayed());

    }
}
