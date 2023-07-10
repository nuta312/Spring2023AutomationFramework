package selenium.demo.alertTest;

import com.digitalnomads.selenium.ui.helper.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.time.Duration;

public class AlertDemoTest extends BaseTest {
    @Test
    void alertDemo() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        AlertHelper alertHelper = new AlertHelper(driver);
        driver.findElement(By.id("alertButton")).click();
        alertHelper.acceptAlert();

        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();

        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();

        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeys("Aidin");
        Thread.sleep(5000);
    }
}
