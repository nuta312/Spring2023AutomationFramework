package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.testHomework;

import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class SelectHomework extends BaseTest {
    @Test
    public  void  testselectdemo() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        selectHelper.getSelectRandom(selectPage.select);
    }
}
