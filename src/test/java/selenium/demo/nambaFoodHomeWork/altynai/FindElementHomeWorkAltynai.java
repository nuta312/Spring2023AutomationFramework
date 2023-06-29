package selenium.demo.nambaFoodHomeWork.altynai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class FindElementHomeWorkAltynai extends BaseTest {
    @Test
    void findElement() {
        driver.get("https://nambafood.kg/");
        String text = driver.findElement(By.xpath("/html/body/main/section[8]/div[1]/h3[2]")).getText();
        System.out.println(text);
    }

}
