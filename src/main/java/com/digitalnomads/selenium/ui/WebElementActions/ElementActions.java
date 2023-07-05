package com.digitalnomads.selenium.ui.WebElementActions;

import com.digitalnomads.selenium.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions {

    public ElementActions waitButtonToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitElementToBeDisplayed(WebElement element){
         new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions clickTheButton (WebElement element){
        waitButtonToBeClickable(element);
        element.click();
        return this;
    }

    public ElementActions writeText(WebElement element, String text){
        waitElementToBeDisplayed(element);
        element.sendKeys(text);
        return this;
    }
}
