package selenium.demo.nambaFoodHomeWork.HomeWorkJanyla;

import lesson2.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactUsJanyla extends BaseTest {
        @Test
        public void testWeb(){
            driver.get("https://nambafood.kg/");
            String contactUs = driver.findElement(By.linkText("/html/body/main/section[8]/div[1]/h3[2]")).getText();
            System.out.println(contactUs);
        }


    }
