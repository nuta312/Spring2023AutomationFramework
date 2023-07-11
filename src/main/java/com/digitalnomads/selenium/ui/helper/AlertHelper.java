package com.digitalnomads.selenium.ui.helper;

import com.digitalnomads.selenium.ui.driverFactory.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver = Driver.getDriver();

    public AlertHelper(WebDriver driver){
        this.driver= driver;

    }
    public Alert switchtoAlert(){

        return driver.switchTo().alert();
    }

    public void acceptAlert(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.alertIsPresent());
        switchtoAlert().accept();

    }

    public void dismissAlert() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.alertIsPresent());
        switchtoAlert().dismiss();
    }

    public void sendKeysAlert(String txt) {
        switchtoAlert().sendKeys(txt);
        acceptAlert();
    }

    public boolean isAlertPresented() {
        try {
            acceptAlert();
            return true;
        } catch (NoAlertPresentException e) {
            System.out.println("no such alert");
            return false;
        }
    }

    public void acceptAlertIfPresented(){
        if(!isAlertPresented()){
            return;
        }
        acceptAlert();
    }
}
