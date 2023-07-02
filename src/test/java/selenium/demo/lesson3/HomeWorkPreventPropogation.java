package selenium.demo.lesson3;

import com.digitalnomads.selenium.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class HomeWorkPreventPropogation extends BaseTest {
    @Test
    void preventPropogation() {
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement preventPropogationBtn = driver.findElement(By.id("droppableExample-tab-preventPropogation"));
        preventPropogationBtn.click();
        WebElement elementDragMe = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[4]"));
        WebElementActions.scrollToElement(driver, elementDragMe);
        WebElement elementDrop = driver.findElement(By.id("notGreedyInnerDropBox"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(elementDragMe).perform();
        actions.moveToElement(elementDrop).release().perform();
        WebElement greedyBtn=driver.findElement(By.id("greedyDropBoxInner"));
        actions.clickAndHold(elementDragMe).perform();
        actions.moveToElement(greedyBtn).release().perform();
    }
}
