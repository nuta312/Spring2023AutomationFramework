package selenium.demo;

import com.digitalnomads.selenium.ui.helper.DropDownHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.digitalnomads.selenium.ui.helper.DropDownHelper.selectUsingVisibleText;

public class SelectDemo extends BaseTest{
    @Test
    void demo () throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        selectUsingVisibleText(element,"Black");
        DropDownHelper.selectUsingValue(element,"2");
        Thread.sleep(4000);

    }
}
