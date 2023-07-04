package selenium.demo.nambaFoodHomeWork.syrgak.ui.webElementActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.demo.nambaFoodHomeWork.syrgak.ui.driverFactory.Driver;

import java.time.Duration;

public class ElementActions {
    public ElementActions waitButtonToBeClickable (WebElement element){
        new WebElement(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public ElementActions waitButtonToBeDisplayed (WebElement element) throws IllegalAccessException {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public ElementActions clickTheButton (WebElement element){
        waitButtonToBeClickable(element);
        element.click();
        return this;
    }
    public ElementActions writeText(WebElement element, String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }

    private void waitElementToBeDisplayed(WebElement element) {
    }
}
