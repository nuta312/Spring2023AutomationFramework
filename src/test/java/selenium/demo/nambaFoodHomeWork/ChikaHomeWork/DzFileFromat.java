package selenium.demo.nambaFoodHomeWork.ChikaHomeWork;

import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class DzFileFromat extends BaseTest {
    @Test
    public void  dzdemotest1 () throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        practiceFormPage.writeall();
        Thread.sleep(4000);
    }

}
