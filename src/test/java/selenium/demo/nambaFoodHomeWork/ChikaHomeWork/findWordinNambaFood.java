package selenium.demo.nambaFoodHomeWork.ChikaHomeWork;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class findWordinNambaFood extends BaseTest {
    @Test
    void findElement (){
        driver.get("https://nambafood.kg/");
        String word = driver.findElement(By.xpath(" /html/body/main/section[last()]/div/h3[2]")).getText();
        Assert.assertTrue(word.contains("Обращайтесь к нам!"));
    }
}
