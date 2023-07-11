package selenium.demo;

import com.digitalnomads.selenium.ui.helper.DropDownHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.digitalnomads.selenium.ui.helper.DropDownHelper.selectUsingRandom;
import static com.digitalnomads.selenium.ui.helper.DropDownHelper.selectUsingVisibleText;

public class SelectDemo extends BaseTest{
    @Test
    void demo() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        WebElement element = driver.findElement(By.id("oldSelectMenu"));
//        selectUsingVisibleText(element,"Black");
//        Thread.sleep(5000);

        System.out.println(selectUsingRandom(element));
        Thread.sleep(3000);
    }
}
