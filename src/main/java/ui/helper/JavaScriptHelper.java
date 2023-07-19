package ui.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import ui.driversFactory.MainDriver;

public class JavaScriptHelper {

    public JavaScriptHelper clickWithJs(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) MainDriver.getDriver();
        js.executeScript("arguments[0].click();", element);
        return this;
    }

    public JavaScriptHelper highlightElementAfterClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) MainDriver.getDriver();
        clickWithJs(element);
        js.executeScript("arguments[0].style.backgroundColor = 'red'", element);
        return this;
    }

    public JavaScriptHelper triggerAlert (String txt){
        JavascriptExecutor js = (JavascriptExecutor) MainDriver.getDriver();
        js.executeScript("alert('" + txt + "')");
        return this;
    }
}
