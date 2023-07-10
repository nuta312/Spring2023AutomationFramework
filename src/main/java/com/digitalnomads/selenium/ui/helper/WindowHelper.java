package com.digitalnomads.selenium.ui.helper;

import com.digitalnomads.selenium.ui.drivers.Driver;
import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;

public class WindowHelper {

    private WebDriver driver;

    private WindowHelper(){
        driver = Driver.getDriver();
    }
    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refreshThePage(){
        driver.navigate().refresh();
    }

    public Set<String> getWindowTabs(){
        return driver.getWindowHandles();
    }

    public void switchToTab(int index){
        LinkedList<String> tabId = new LinkedList<>(getWindowTabs());
        if(index < 0 || index > tabId.size()){
            throw new IllegalArgumentException("Invalid Index0" + index);
        }
        driver.switchTo().window(tabId.get(index));
    }

    public void switchToParentTab(){
        LinkedList<String> tabId = new LinkedList<>(getWindowTabs());
        driver.switchTo().window(tabId.get(0));
    }

    public void switchToParentWithChildClose(){
        switchToParentTab();
        LinkedList<String> tabId = new LinkedList<>(getWindowTabs());
        for(int i = 1; i < tabId.size(); i++){
            driver.switchTo().window(tabId.get(i)).close();
        }

    }
}
