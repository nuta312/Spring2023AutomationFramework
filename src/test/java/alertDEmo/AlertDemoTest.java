package alertDEmo;

import com.digitalnomads.selenium.ui.helper.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.time.Duration;
//public class AlertDemoTest extends BaseTest {
//    @Test
//    void alerDemo() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
////        driver.findElement(By.id("alertButton")).click();
//        AlertHelper alertHelper = new AlertHelper(driver);
////        Thread.sleep(2000);
////        alertHelper.acceptAlert();
//
//        Thread.sleep(2000);
//        driver.findElement(By.id("timerAlertButton")).click();
//        alertHelper.acceptAlert();
//        Thread.sleep(2000);
//        driver.findElement(By.id("confirmButton")).click();
//        alertHelper.dissmissAlert();
//        Thread.sleep(2000);
//        driver.findElement(By.id("promtButton")).click();
//        alertHelper.sendAlert("Chikago");
//        Thread.sleep(3000);
//    }
//}

public class AlertDemoTest extends BaseTest {

    @Test
    void alertDemo() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        AlertHelper alertHelper = new AlertHelper(driver);
        alertHelper.acceptAlert();
        Thread.sleep(5000);
        driver.findElement(By.id("timerAlertButton")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alertHelper.acceptAlert();
        Thread.sleep(5000);

        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();
        Thread.sleep(5000);

        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("Digital Nomads");
        Thread.sleep(5000);


    }

}
