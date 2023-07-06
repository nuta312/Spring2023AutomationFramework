package selenium.demo.nambaFoodHomeWork.aidinHomeWork;

import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.demo.nambaFoodHomeWork.aidinHomeWork.pages.PracticeFormPage;

public class PracticeFormTest extends BaseTest {
    @Test
    public void demoTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        PracticeFormPage page = new PracticeFormPage();
        elementActions.scrollToElement(driver.findElement(By.xpath("//div[@id=\"userName-wrapper\"]")));
        page.fillUpTheForm("Aidin","Iskenderov","aidin@gmail.com", "male","0772342576",
                 "sports","Mederova 8/1");
        Thread.sleep(3000);
    }
}
