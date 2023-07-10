package selenium.demo.demoQA;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;
import static com.digitalnomads.selenium.ui.helper.DropDownHelper.selectUsingVisibleText;

public class SelectPageTest extends BaseTest {

    @Test
    void demo(){
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        selectUsingVisibleText(element,"White");
    }
}
