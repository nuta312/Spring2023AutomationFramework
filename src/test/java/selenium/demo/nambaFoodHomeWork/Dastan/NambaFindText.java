package selenium.demo.nambaFoodHomeWork.Dastan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class NambaFindText extends BaseTest {

    @Test
    void findTextNamba(){
        driver.get("https://nambafood.kg/");
        String text = driver.findElement(By.xpath("//h3[contains(text(),'Обращайтесь к нам!')]")).getText();
        System.out.println(text);


    }
}
