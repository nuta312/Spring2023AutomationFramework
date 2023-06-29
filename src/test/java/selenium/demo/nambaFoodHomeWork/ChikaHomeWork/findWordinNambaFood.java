package selenium.demo.nambaFoodHomeWork.ChikaHomeWork;

import lesson2.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class findWordinNambaFood extends BaseTest {
    @Test
    void findElement (){
        driver.get("https://nambafood.kg/");
        String word = driver.findElement(By.xpath(" /html/body/main/section[last()]/div/h3[2]")).getText();
        Assert.assertTrue(word.contains("Обращайтесь к нам!"));
    }
}
