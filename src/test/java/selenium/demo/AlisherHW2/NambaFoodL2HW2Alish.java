package selenium.demo.AlisherHW2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2Alisher.BaseTest;

public class NambaFoodL2HW2Alish extends BaseTest {

    @Test
    void absoluteXpathNambaFood() {
        driver.get("https://nambafood.kg/");
        String fullNameText = driver.findElement(By.xpath("/html[1]/body[1]/main/section[5]/div[1]")).getText();
        System.out.println(fullNameText);
    }


}
