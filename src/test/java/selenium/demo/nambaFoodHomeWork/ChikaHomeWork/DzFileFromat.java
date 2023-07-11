package selenium.demo.nambaFoodHomeWork.ChikaHomeWork;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static org.testng.AssertJUnit.*;

public class DzFileFromat extends BaseTest {
    @Test
    public void  dzdemotest1 () throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        practiceFormPage.writeall();
        practiceFormPage.submit.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }


}
