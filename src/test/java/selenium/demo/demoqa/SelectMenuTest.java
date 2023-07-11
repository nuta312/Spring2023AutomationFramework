package selenium.demo.demoqa;

import com.digitalnomads.selenium.ui.pages.SelectMenu;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class SelectMenuTest extends BaseTest {

    @Test
    void SelectMenuTest() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        SelectMenu selectMenu = new SelectMenu();
        selectMenu.selectColors();
        Thread.sleep(5000);

    }

}
