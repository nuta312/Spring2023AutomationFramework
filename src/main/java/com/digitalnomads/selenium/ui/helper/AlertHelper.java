package com.digitalnomads.selenium.ui.helper;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AlertHelper {


    private WebDriver driver;


    public AlertHelper(WebDriver driver) {
        this.driver = driver;
    }

    public Alert switchToAlert() {
        return driver.switchTo().alert();
    }

    public void acceptAlert() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        switchToAlert().accept();
    }

    public void dismissAlert() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        switchToAlert().dismiss();
    }

    public void writeAlert(String text) {
        switchToAlert().sendKeys(text);
        acceptAlert();
    }

    public boolean isAlertPresented() {
        try {
            acceptAlert();
            return true;
        } catch (NoAlertPresentException e) {
            System.out.println("No such Alert");
            return false;
        }
    }

    public void acceptAlertIfPresented() {
        if (!isAlertPresented()) {
            return;
        }
        acceptAlert();
    }


}
