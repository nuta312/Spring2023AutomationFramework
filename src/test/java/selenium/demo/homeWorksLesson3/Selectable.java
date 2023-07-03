package selenium.demo.homeWorksLesson3;

import com.digitalnomads.WebElementActions;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class Selectable extends BaseTest {
    @Test
    void selectable() throws InterruptedException {
        driver.get("https://demoqa.com/selectable");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement theFirstElement = driver.findElement(By.xpath("//li[text()='Cras justo odio']"));
        WebElementActions.scrollToElement(driver, theFirstElement);
        Thread.sleep(3000);
        theFirstElement.click();
        WebElement theSecondElement = driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in']"));
        theSecondElement.click();
        WebElement theThirdElement = driver.findElement(By.xpath("//li[text()='Morbi leo risus']"));
        theThirdElement.click();
        WebElement theForthElement = driver.findElement(By.xpath("//li[text()='Porta ac consectetur ac']"));
        theForthElement.click();
        Assert.assertTrue(theFirstElement.isEnabled());
        WebElement resultFirst = driver.findElement(By.xpath("(//li[@class='mt-2 list-group-item active list-group-item-action'])[1]"));
        Assert.assertEquals(theFirstElement, resultFirst);
        Assert.assertTrue(theSecondElement.isEnabled());
        WebElement resultSecond = driver.findElement(By.xpath("(//li[@class='mt-2 list-group-item active list-group-item-action'])[2]"));
        Assert.assertEquals(theSecondElement, resultSecond);
        Assert.assertTrue(theThirdElement.isEnabled());
        WebElement resultThird = driver.findElement(By.xpath("(//li[@class='mt-2 list-group-item active list-group-item-action'])[3]"));
        Assert.assertEquals(theThirdElement, resultThird);
        Assert.assertTrue(theForthElement.isEnabled());
        WebElement resultForth= driver.findElement(By.xpath("(//li[@class='mt-2 list-group-item active list-group-item-action'])[4]"));
        Assert.assertEquals(theForthElement, resultForth);



    }

    @Test
    void grid() {
        driver.get("https://demoqa.com/selectable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement clickGrid = driver.findElement(By.xpath("//a[@id='demo-tab-grid']"));
        clickGrid.click();
        WebElementActions.scrollToElement(driver, clickGrid);
        WebElement theFirstElement = driver.findElement(By.xpath("//li[text()='One']"));
        WebElementActions.scrollToElement(driver, theFirstElement);
        theFirstElement.click();
        WebElement theSecondElement = driver.findElement(By.xpath("//li[text()='Two']"));
        theSecondElement.click();
        WebElement theThirdElement = driver.findElement(By.xpath("//li[text()='Three']"));
        theThirdElement.click();
        WebElement theForthElement = driver.findElement(By.xpath("//li[text()='Four']"));
        Assert.assertTrue(theFirstElement.isEnabled());
        WebElement firstResult= driver.findElement(By.xpath("(//li[@class='list-group-item active list-group-item-action'])[1]"));
        Assert.assertEquals(theFirstElement,firstResult);
        Assert.assertTrue(theSecondElement.isEnabled());
        WebElement secondResult=driver.findElement(By.xpath("(//li[@class='list-group-item active list-group-item-action'])[2]"));
        Assert.assertEquals(theSecondElement, secondResult);
        Assert.assertTrue(theThirdElement.isEnabled());
        WebElement thirdResult=driver.findElement(By.xpath("(//li[@class='list-group-item active list-group-item-action'])[3]"));
        Assert.assertEquals(theThirdElement, thirdResult);

    }
}