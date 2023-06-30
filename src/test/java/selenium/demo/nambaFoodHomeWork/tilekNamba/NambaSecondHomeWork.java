package selenium.demo.nambaFoodHomeWork.tilekNamba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.nambaFoodHomeWork.tilekNamba.practice.BaseTestbyTilek;

public class NambaSecondHomeWork extends BaseTestbyTilek {

    @Test
     void findWordByAbsoluteXpath(){
        driver.get("https://nambafood.kg/");
        WebElement word = driver.findElement(By.xpath("/html[1]/body/main/section[8]/div/h3[2]"));
        String result = word.getText();
        Assert.assertTrue(result.contains("Обращайтесь к нам!"));
    }
}
