package ui.helper;

import com.digitalnomads.selenium.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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

    public ElementActions clickAndFillUpAndTab(WebElement element, String text){
        clickTheButton(element);
        element.sendKeys(text);
        element.sendKeys(Keys.TAB);
        return this;
    }
    public ElementActions scrollDown(WebElement element){
        waitWebElementTobeDisplayed(element);
        WebElementActions.scrollToElement(MainDriver.getDriver(),element);
        return this;
    }

    public ElementActions clearAllEnterNewText(WebElement element, String txt) throws InterruptedException {
        waitWebElementTobeDisplayed(element);
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(txt);
        Thread.sleep(2000);
        element.sendKeys(Keys.ESCAPE);
        return this;
    }

    public ElementActions attachFile(WebElement element, String path){
        String filePath = path;
        element.sendKeys(filePath);
        return this;
    }

    public ElementActions scrollDownToBottomPage(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return this;
    }

}
