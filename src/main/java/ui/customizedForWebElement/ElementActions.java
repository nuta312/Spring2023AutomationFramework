package ui.customizedForWebElement;

import com.digitalnomads.selenium.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.driversFactory.MainDriver;

import java.time.Duration;

public class ElementActions {

    public ElementActions waitButtonToBeClickable(WebElement element){
        new WebDriverWait(MainDriver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitWebElementTobeDisplayed(WebElement element){
        new WebDriverWait(MainDriver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions clickTheButton(WebElement element){
        waitButtonToBeClickable(element);
        element.click();
        return this;
    }

    public ElementActions inputText(WebElement element, String txt){
       waitWebElementTobeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }

    public ElementActions scrollDownToClick(WebElement element){
        waitWebElementTobeDisplayed(element);
       WebElementActions.scrollToElement(MainDriver.getDriver(),element);
       element.click();
       return this;
    }
}
