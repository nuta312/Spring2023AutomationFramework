package selenium.demo.AlisherHW2;

import com.digitalnomads.selenium.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2Alisher.BaseTest;

public class CheckBoxTestAlish extends BaseTest {

    @Test
    void expressionXpathChekBoxTest() {
        driver.get("https://demoqa.com/checkbox");
        WebElement submitBtnHome = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[1]"));
        submitBtnHome.click();

        WebElement submitBtnDesktop = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[2]"));
        submitBtnDesktop.click();

        WebElement submitBtnDocuments = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[3]"));
        submitBtnDocuments.click();

        WebElement submitBtnDownloads = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[4]"));
        submitBtnDownloads.click();

        WebElement tittleDesktop = driver.findElement(By.xpath("(//span[@class='rct-title'])[2]"));
        tittleDesktop.click();

        WebElement tittleReact = driver.findElement(By.xpath("(//span[@class='rct-title'])[7]"));
        tittleReact.click();

        WebElement result = driver.findElement(By.xpath("//div[@id='result']"));
        Assert.assertTrue(result.getText().contains("You have selected :"));
        Assert.assertTrue(result.getText().contains("desktop"));
        Assert.assertTrue(result.getText().contains("notes"));
        Assert.assertTrue(result.getText().contains("commands"));
        Assert.assertTrue(result.getText().contains("react"));











    }


}
