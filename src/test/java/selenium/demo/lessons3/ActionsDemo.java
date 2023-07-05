package selenium.demo.lessons3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import static org.testng.AssertJUnit.*;


public class ActionsDemo extends BaseTest {

    @Test
    void demo(){
        driver.navigate().to("https://demoqa.com/buttons");
        WebElement doubleClick= driver.findElement(By.id("doubleClickBtn"));
        Actions actions=new Actions(driver);
        actions.doubleClick(doubleClick).perform();
       assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

    }

    @Test
    void demo1() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement rightClick= driver.findElement(By.id("rightClickBtn"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightClick).perform();
        Thread.sleep(3000);

        WebElement clickMe= driver.findElement(By.xpath("//button[text='Click Me']"));
        actions.click(clickMe).perform();
        Thread.sleep(3000);

        actions.clickAndHold();// увеличивает размер

    }
}
