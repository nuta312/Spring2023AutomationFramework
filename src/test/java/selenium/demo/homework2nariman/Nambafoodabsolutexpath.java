package selenium.demo.homework2nariman;

import lesson2.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Nambafoodabsolutexpath extends BaseTest {
    @Test
    void absoluteXpathTest(){
    driver.get("https://nambafood.kg/");
        String sometext = driver.findElement(By.xpath("/html/body/main/section[8]/div/h3[2]")).getText();
        System.out.println(sometext);

    }
}
