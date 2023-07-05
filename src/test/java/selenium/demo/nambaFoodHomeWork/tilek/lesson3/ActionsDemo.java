package selenium.demo.nambaFoodHomeWork.tilek.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.nambaFoodHomeWork.tilek.practice.BaseTestbyTilek;

import static org.testng.AssertJUnit.assertTrue;


public class ActionsDemo extends BaseTestbyTilek {

    @Test
    void demo1() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickonBtn = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClickonBtn).perform(); //double click
        assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));// right click
        actions.contextClick(rightClick).perform();
        Thread.sleep(5000);
        assertTrue(driver.findElement(By.id("rightClickMessage")).isDisplayed());

        WebElement clickMe = driver.findElement(By.xpath("//button[text()= 'Click Me']"));
        actions.click(clickMe).perform();
        assertTrue(driver.findElement(By.id("dynamicClickMessage")).isDisplayed());

    }
}
