package ui.helper;

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

    public static void selectUsingValue(WebElement element,String txt){
        Select select = new Select(element);
        select.selectByValue(txt);
    }

    public static void selectUingIndex(WebElement element, int index){
        Select select = new Select(element);
        select.deselectByIndex(index);
    }

    public static void selectRandom(WebElement element){
        Select select = new Select(element);
        Random random = new Random();
        int randomly  = random.nextInt(select.getOptions().size());
        select.selectByIndex(randomly);
    }

    public static List<String> getAllDropDownValues(WebElement element){
        Select select = new Select(element);
        List<WebElement>elementList = select.getOptions();
        List<String> valueList = new LinkedList<>();
        for (WebElement element1: elementList){
            valueList.add(element1.getText());
        }
        return valueList;
    }




}
