package selenium.demo.nambaFoodHomeWork.HomeWorkJanyla;

import com.digitalnomads.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class Resizable extends BaseTest {

    @Test
    void resizable1() {
        driver.get("https://demoqa.com/resizable");

        WebElement clickConsole = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]"));
        WebElementActions.scrollToElement(driver, clickConsole);
        Actions actions = new Actions(driver);
        actions.clickAndHold(clickConsole).moveByOffset(500, 300).release().perform();


    }

    @Test
    void sortableList() {
        driver.get("https://demoqa.com/sortable");
        WebElement sort1 = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[1]"));
        WebElement sort2 = driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[2]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sort1).moveToElement(sort2).release().perform();

    }

    @Test
    void sortableGrid() {
        driver.get("https://demoqa.com/sortable");
        WebElement sortGrid = driver.findElement(By.xpath("//a[@id='demo-tab-grid']"));
        sortGrid.click();
    }
}

