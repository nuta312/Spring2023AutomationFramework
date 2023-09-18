package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.digitalnomads.selenium.ui.helper.DropDownHelper.*;

public class SelectDemo extends BaseTest{
    @Test
    void demo() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
//        selectUsingVisibleText(element,"Black");
//        selectUsingValue(element,"5");
//        selectUsingIndex(element,3);

        chooseRandomValueFromDropDown(element);


    }
}
