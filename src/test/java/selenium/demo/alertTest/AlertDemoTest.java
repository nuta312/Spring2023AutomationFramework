package selenium.demo.alertTest;

import com.digitalnomads.selenium.ui.helper.AlertHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class AlertDemoTest extends BaseTest {
    @Test
    void alerDemo() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.id("alertButton")).click();
        AlertHelper alertHelper = new AlertHelper(driver);
//        Thread.sleep(2000);
//        alertHelper.acceptAlert();

        Thread.sleep(2000);
        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dissmissAlert();
        Thread.sleep(2000);
        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendAlert("Chikago");
        Thread.sleep(3000);
    }
}
