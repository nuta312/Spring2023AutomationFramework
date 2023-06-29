package selenium.demo.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class CssSelector extends BaseTest {

    @Test
    void cssTest(){
        driver.get("https://nambafood.kg");
        // Находим элемент по классу с использованием CSS-селектора

        WebElement element = driver.findElement(By.cssSelector("a[href=\"/food\"]"));

//              "a[href^=\"fo"]"   -----perviy simvol
//
//              "a[href$=\"od"]" ---- poslednii symbol

        // "div:not(class)" ----- chego net iskat'

        WebElement element232 = driver.findElement(By.cssSelector("a.menu-link[href='/food']")); //----cherez tochku - poisk pri pomochi classa

//        WebElement element = driver.findElement(By.xpath("(//a[@class='menu-link '])[1]"));

        element.click();


    }




}
