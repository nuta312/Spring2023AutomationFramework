package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.userData.UserWebTables;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HelperStreamForWebElement {


    public static List<String> listAllperson(List<WebElement> list) {
        return list.stream().filter(e -> e.getText().length() > 1).map(e -> e.getText()).collect(Collectors.toList());
    }


    public static List<WebElement> filterByAge(List<WebElement> list, List<WebElement> ageList, int age) {
        List<String> strings = listAllperson(ageList);
        List<WebElement> result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (Integer.parseInt(strings.get(i)) > age) {
                System.out.println(list.get(i).getText() + ": " + ageList.get(i).getText());

            } else {
                result.add(list.get(i));
            }
        }
        return result;
    }


    public static void deleteByAge(WebDriver driver, int age) {
        List<WebElement> buttonDelete = driver.findElements(By.xpath(" //div[@class='rt-tr-group']/div/div/div/span[@title='Delete']"));
        List<WebElement> ageInfo = driver.findElements(By.xpath(" //div[@class='rt-tr-group']/div/div[3]"));
        for (int i = ageInfo.size()-1; i >-1 ; i--) {
            if (Integer.parseInt(ageInfo.get(i).getText()) < age) {
                buttonDelete.get(i).click();
            }
        }
    }

    public static String checkValueByText(List<WebElement> elements, String value) {
        int i = 0;
        WebElement result = null;
        WebElement result1 = null;
        for (i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().contains(value)) {
                result = elements.get(i);
                break;
            }
        }
        return (i == elements.size()) ? result1.getText() : result.getText();
    }

    public static List<String> checkValueByELement(List<WebElement> elements, UserWebTables userWebTables) {

        return elements.stream().filter(e->e.getText().contains(userWebTables.getFirstName())).map(e->e.getText()).collect(Collectors.toList());
    }


//                            Надо доработать
//    List<WebElement> buttonDelete = driver.findElements(By.xpath("//span[@title='Delete']"));
//        Thread.sleep(2000);
//    List<String> ages = StreamWebElementToList.listAllperson(list1);
//        for (int i = ages.size(); i>0; i--) {
//        if(Integer.parseInt(ages.get(i))<40){
//            buttonDelete.get(i).click();
//        }
//    }
}
