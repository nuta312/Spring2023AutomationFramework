package selenium.demo.nambaFoodHomeWork.aidinHomeWork;

import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.demo.nambaFoodHomeWork.aidinHomeWork.pages.PracticeFormPage;

import java.awt.image.Kernel;

public class PracticeFormTest extends BaseTest {
    @Test
    public void demoTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        PracticeFormPage page = new PracticeFormPage();

        page.fillUpTheForm("Aidin","Iskenderov","aidin@gmail.com", "other","0772342576",
                 "sports","Mederova 8/1");
        page.subjectsInput.sendKeys("English");
        page.subjectsInput.sendKeys(Keys.TAB);
        Thread.sleep(3000);
    }
}
