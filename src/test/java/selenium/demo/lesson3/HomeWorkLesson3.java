package selenium.demo.lesson3;

import com.digitalnomads.selenium.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class HomeWorkLesson3 extends BaseTest {
    @Test
    void clickButtonInDemoQA(){
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement elementDragMe=driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[1]"));
        elementDragMe.click();
        WebElementActions.scrollToElement(driver,elementDragMe);
        WebElement elementDrop=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(elementDragMe).perform();
        actions.moveToElement(elementDrop);
        actions.release(elementDrop).perform();
//        actions.perform();


//        actions.clickAndHold(elementDragMe).perform();
//        WebElement elementDrop=driver.findElement(By.id("droppable"));
//        actions.moveToElement(elementDrop);

    }

}
