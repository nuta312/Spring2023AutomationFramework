package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.util.List;

public class FindElementDemo extends BaseTest {
    @Test
    void demo(){
        driver.get("https://www.amazon.com/s?k=iphone&crid=1XSVLVYLG51KY&sprefix=iphone%2Caps%2C267&ref=nb_sb_noss_2");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        List<WebElement>brands = driver.findElements(By.xpath("//div[@id='brandsRefinements']/ul/span/li/span/a/span"));
        for (WebElement element :brands) {
            System.out.println(element.getText());
        }
    }
}
