package selenium.demo.homework2nariman;

import lesson2.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    @Test
    void checkboxbntTest(){
        driver.get("https://demoqa.com/checkbox");
        WebElement homebtn = driver.findElement(By.xpath("//label[@for='tree-node-home']"));
        homebtn.click();
       WebElement homebtncliked = driver.findElement(By.xpath(" /html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]"));
        Assert.assertTrue(homebtncliked.isEnabled());
    }
}
