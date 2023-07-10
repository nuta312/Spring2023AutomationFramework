package com.digitalnomads.selenium.ui.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;

public class DropDownHelper {

    public static void selectUsingVisibleText(WebElement element, String txt){
        Select select = new Select(element);
        select.selectByVisibleText(txt);
    }

    public static void selectUsingValue(WebElement element, String val){
        Select select = new Select(element);
        select.selectByValue(val);
    }

    public static void selectUsingIndex(WebElement element, int index){
        new Select(element).selectByIndex(index);
    }

    public static List<String > getAllDropDownsVal(WebElement locator){
        Select select = new Select(locator);
        List<WebElement> elements = select.getOptions();
        List<String> valueList = new LinkedList<>();
        for(WebElement element : elements){
            valueList.add(element.getText());
        }
        return valueList;
    }
}
