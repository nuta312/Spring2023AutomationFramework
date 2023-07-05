package selenium.demo.nambaFoodHomeWork.HomeWorkJanyla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class DropAndDrag extends BaseTest {

    @Test
    void dropAndDragSimple(){
        driver.get("https://demoqa.com/droppable");
        WebElement dragMe= driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions actions =new Actions(driver);
        actions.clickAndHold(dragMe).perform();
        WebElement dropMe=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        actions.moveToElement(dropMe).release().perform();
    }

    @Test
    void dropAndDragAccept() {
        driver.get("https://demoqa.com/droppable");
        WebElement dragMe = driver.findElement(By.xpath("//div[@id='acceptable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(dragMe).perform();
        WebElement dropMe = driver.findElement(By.xpath(""));
        actions.moveToElement(dropMe).release().perform();
    }



}
