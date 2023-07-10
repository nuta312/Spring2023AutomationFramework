package com.digitalnomads.selenium.ui.helper;


import com.digitalnomads.selenium.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;

public class DropDownHelper {

    public static void selectUsingVisibleText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void selectUsingValue(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByValue(text);
    }

    public static void selectUsingIndex(WebElement element, int text) {
        Select select = new Select(element);
        select.selectByIndex(text);
    }

    public static List<String> getAllDropDownValues(WebElement element) {
        Select select = new Select(element);
        List<WebElement> elementsList = select.getOptions();
        List<String> valueList = new LinkedList<>();
        for (WebElement element1 : elementsList) {
            valueList.add(element1.getText());
        }
        return valueList;
    }


}
