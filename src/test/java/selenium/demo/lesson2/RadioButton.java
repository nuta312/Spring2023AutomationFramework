package selenium.demo.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseTest{
    @Test
    void radioButtonTest(){
        driver.get("http://demoqa.com/radio-button");
        WebElement yesRadioBtn=driver.findElement(By.xpath(""));
     yesRadioBtn.click();
     WebElement yesResult=driver.findElement(By.tagName("p"));
        Assert.assertTrue(yesResult.getText().contains("You have selected"));
    }
}
