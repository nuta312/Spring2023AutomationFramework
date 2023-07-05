package selenium.demo.nambaFoodHomeWork.allazor;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class ContactUsNamba extends BaseTest {

    @Test
    void contactUsTest(){
        driver.get("https://nambafood.kg/");
        String contactUs = driver.findElement
                (By.xpath("/html/body/main/section[8]/div/h3[2]")).getText();
        System.out.println(contactUs);
        Assert.assertEquals(contactUs, "Обращайтесь к нам!");
    }
}
