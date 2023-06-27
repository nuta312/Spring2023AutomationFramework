package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class radiobutton extends BaseTest{
    @Test
    void radioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadiobtn = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadiobtn.click();
        WebElement yesresult = driver.findElement(By.tagName("p"));
        Assert.assertTrue(yesresult.getText().contains("You have selected Yes"));
        Assert.assertTrue(yesRadiobtn.isEnabled());

        //imprassiveRadio

        WebElement impressiveRadiobtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadiobtn.click();
        Assert.assertTrue(yesresult.getText().contains("You have selected Impressive"));
        WebElement doULikeThisSite= driver.findElement(By.xpath("//div[text()='Do you like the site']"));
        Assert.assertTrue(doULikeThisSite.isDisplayed());

    }
}
