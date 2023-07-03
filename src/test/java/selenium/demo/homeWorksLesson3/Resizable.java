package selenium.demo.homeWorksLesson3;

import com.digitalnomads.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class Resizable extends BaseTest{
    @Test
    void resizable(){
        driver.get("https://demoqa.com/resizable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement elementOfResize= driver.findElement(By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se'][1]"));
        WebElementActions.scrollToElement(driver, elementOfResize);
        Actions actions=new Actions(driver);
        actions.clickAndHold(elementOfResize).moveByOffset(500, 300).release().perform();
        WebElement afterResize=driver.findElement(By.id("resizableBoxWithRestriction"));
        int widthAfterResize = afterResize.getSize().getWidth();
        int heightAfterResize = afterResize.getSize().getHeight();
        int expectedWidth = 500;
        int expectedHeight = 300;
        Assert.assertEquals(expectedWidth, widthAfterResize);
        Assert.assertEquals(expectedHeight, heightAfterResize);
    }

}
