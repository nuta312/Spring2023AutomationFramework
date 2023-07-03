package selenium.demo.homeWorksLesson3;

import com.digitalnomads.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class Sortable extends BaseTest {
    @Test
    void sortable() throws InterruptedException {
        driver.get("https://demoqa.com/sortable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement theFirstElement = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[1]"));
        WebElementActions.scrollToElement(driver, theFirstElement);
        Point coordinateA = theFirstElement.getLocation();
        WebElement theFifthElement = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[5]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(theFirstElement).moveToElement(theFifthElement).release().perform();
        Point coordinateB = theFifthElement.getLocation();
        Thread.sleep(5000);
        Assert.assertEquals(coordinateA.getX(), coordinateB.getX());


    }

    @Test
    void grid() throws InterruptedException {
        driver.get("https://demoqa.com/sortable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement grid = driver.findElement(By.xpath("//a[@id='demo-tab-grid']"));
        WebElementActions.scrollToElement(driver, grid);
        grid.click();
        WebElement theFirstElement = driver.findElement(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][1]"));
        String one=theFirstElement.getText();
        WebElement theFifthElement = driver.findElement(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][5]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(theFirstElement).moveToElement(theFifthElement).release().perform();
        String five=theFifthElement.getText();
        Thread.sleep(5000);
        Assert.assertEquals(one, five);

    }
}
