package lesson2;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RadioButton extends BaseTest {

    void radioButtonTest(){
        driver.get(("https://demoqa.com/radio-button"));
        WebElement yesRadioBtn=driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadioBtn.click();
        WebElement result=driver.findElement(By.tagName("p"));
        Assert.assertTrue(result.getText().contains("You have selected yes"));
        Assert.assertTrue(yesRadioBtn.isEnabled());

        WebElement impressiveRadioBtn=driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadioBtn.click();
        Assert.assertTrue(result.getText().contains("You have selected yes"));
WebElement dOYouLikeThisSite=driver.findElement(By.xpath("//label[@text()='Do you like this site']"));
Assert.assertTrue(dOYouLikeThisSite.isEnabled());

    }


}
