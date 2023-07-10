package selenium.demo.demoQA;

import com.digitalnomads.selenium.ui.helper.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.time.Duration;

public class AlertDemoTests extends BaseTest {


    @Test
    void alertDemo() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        AlertHelper alertHelper = new AlertHelper(driver);
        alertHelper.acceptAlert();
        Thread.sleep(3000);


        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alertHelper.acceptAlert();
        Thread.sleep(3000);

        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();
        Thread.sleep(3000);

        driver.findElement(By.id("promtButton")).click();
        alertHelper.writeAlert("Dastan");
        Thread.sleep(3000);






    }





}