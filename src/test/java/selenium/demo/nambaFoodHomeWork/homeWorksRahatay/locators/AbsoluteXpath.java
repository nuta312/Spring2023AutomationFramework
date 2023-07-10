package selenium.demo.nambaFoodHomeWork.homeWorksRahatay.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class AbsoluteXpath extends BaseTest {
    @Test
    void AbsoluteXpath(){
        driver.get("https://nambafood.kg/");
        String contactUs = driver.findElement(By.xpath("/html[1]/body/main/section[8]/div/h3[2]")).getText();
        System.out.println(contactUs);

    }
}
