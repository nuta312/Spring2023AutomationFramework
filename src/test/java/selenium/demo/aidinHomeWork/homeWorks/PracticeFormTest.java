package selenium.demo.aidinHomeWork.homeWorks;

import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.demo.aidinHomeWork.pages.PracticeFormPage;

public class PracticeFormTest extends BaseTest {
    @Test
    public void demoTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        PracticeFormPage page = new PracticeFormPage();

        page.fillUpTheForm("Aidin","Iskenderov","aidin@gmail.com", "other","0772342576",
                 "sports","Mederova 8/1");
        Thread.sleep(3000);
    }
}
