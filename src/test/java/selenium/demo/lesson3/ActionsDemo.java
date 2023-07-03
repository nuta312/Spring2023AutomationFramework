package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static org.testng.AssertJUnit.assertTrue;

public class ActionsDemo extends BaseTest {


    @Test
    void demo3() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.cssSelector("button#doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        Thread.sleep(4000);
        assertTrue(driver.findElement(By.cssSelector("p#doubleClickMessage")).isDisplayed());

        WebElement rightclick = driver.findElement(By.cssSelector("button#rightClickBtn"));
        actions.contextClick(rightclick).perform();
        Thread.sleep(3000);
        WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickme).perform();
        Thread.sleep(3000);
    }

    @Test
    void demo4() throws InterruptedException {
        driver.navigate().to("https://www.imoving.com/full-inventory/#!/");
        Actions actions = new Actions(driver);
        WebElement furnecht = driver.findElement(By.xpath("//button[text()='Continue']"));
        actions.moveToElement(furnecht).pause(4000).perform();
        Thread.sleep(3000);
        actions.clickAndHold();

    }

}


