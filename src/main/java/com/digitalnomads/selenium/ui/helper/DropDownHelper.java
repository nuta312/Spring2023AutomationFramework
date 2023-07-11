package com.digitalnomads.selenium.ui.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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

    public static List<String> getAllDropDownsVal(WebElement locator){
        Select select = new Select(locator);
        List<WebElement> elements = select.getOptions();
        List<String> valueList = new LinkedList<>();
        for(WebElement element : elements){
            valueList.add(element.getText());
        }
        return valueList;
    }

    public static String selectUsingRandom(WebElement element){
        Random random = new Random();
        int randomInt = random.nextInt(6);
        new Select(element).selectByIndex(randomInt);
        return getAllDropDownsVal(element).get(randomInt);
    }
}
