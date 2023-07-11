package com.digitalnomads.selenium.ui.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DropDownHelper {

    public static void selectUsingVisibleText(WebElement element, String txt){
        Select select = new Select(element);
        select.selectByVisibleText(txt);
        }

        public static void selectUsingValue(WebElement element, String txt){
        Select select = new Select(element);
        select.selectByValue((txt));

        }
        public static void selectUsingIndex(WebElement element, int index){
        Select select = new Select(element);
                select.selectByIndex(index);
        }
        public static List<String> getAllDropDownValues(WebElement locator){
        Select select = new Select(locator);
        List<WebElement> elementList = select.getOptions();
        List <String> valueList = new LinkedList<>();

        for(WebElement element: elementList){
            valueList.add(element.getText());
        }
        return valueList;
    }
//    public static void selectRandomColor(WebElement element){
//        Random random= new Random();
//        List <String> colors= List.of("Red", "Black", "Yellow", "Purple", "White" +
//                "Indigo", "Aqua", "Voilet", "Green", "Magenta");
//        int index = random.nextInt();
//        String color= colors.get(index);
//        selectUsingVisibleText(element, color);
    }




