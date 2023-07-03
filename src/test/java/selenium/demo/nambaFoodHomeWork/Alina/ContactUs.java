package selenium.demo.nambaFoodHomeWork.Alina;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class ContactUs extends BaseTest {
    @Test
    void contactUs(){
        driver.get("https://nambafood.kg/");
        String contact=driver.findElement(By.xpath("/html/body/main/section[8]/div/h3[2]")).getText();
        System.out.println(contact);
    }
}

