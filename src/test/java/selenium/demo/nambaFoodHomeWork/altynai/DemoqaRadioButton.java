package selenium.demo.nambaFoodHomeWork.altynai;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class DemoqaRadioButton extends BaseTest {
    @Test
    void checkBoxTest() {
        driver.get(("https://demoqa.com/checkbox"));
//        WebElement homeButton = driver.findElement(By.xpath("//label[@for='tree-node-home']"));
//        homeButton.click();
        WebElement homeButton1 = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[1]"));
        homeButton1.click();
        WebElement desktopButton = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[2]"));
        WebElementActions.scrollToElement(driver, desktopButton);
        desktopButton.click();
        WebElement documentsButton = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[3]"));
        documentsButton.click();
        WebElement workSpaceButton = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[4]"));
        workSpaceButton.click();
        WebElement officeButton = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[5]"));
        WebElementActions.scrollToElement(driver, officeButton);
        officeButton.click();
        WebElement downloadsButton = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[6]"));
        downloadsButton.click();
        WebElement checkMarkButton = driver.findElement(By.xpath("//span[text()='Office']"));
        checkMarkButton.click();
        WebElement result = driver.findElement(By.xpath("//span[text()='You have selected :']"));
        Assert.assertTrue(result.getText().contains("You have selected :"));
        WebElement resultСheckMarkButtonOffice = driver.findElement(By.xpath("//span[text()='office']"));
        Assert.assertTrue(resultСheckMarkButtonOffice.getText().contains("office"));
        WebElement resultСheckMarkButtonPublic = driver.findElement(By.xpath("//span[text()='public']"));
        Assert.assertTrue(resultСheckMarkButtonPublic.getText().contains("public"));
        WebElement resultСheckMarkButtonPrivate = driver.findElement(By.xpath("//span[text()='private']"));
        Assert.assertTrue(resultСheckMarkButtonPrivate.getText().contains("private"));
        WebElement resultСheckMarkButtonClassified = driver.findElement(By.xpath("//span[text()='classified']"));
        Assert.assertTrue(resultСheckMarkButtonClassified.getText().contains("classified"));
        WebElement resultСheckMarkButtonGeneral= driver.findElement(By.xpath("//span[text()='general']"));
        Assert.assertTrue(resultСheckMarkButtonGeneral.getText().contains("general"));
        Assert.assertTrue(officeButton.isEnabled());



    }
}