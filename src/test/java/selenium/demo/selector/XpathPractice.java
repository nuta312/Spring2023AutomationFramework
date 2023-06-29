package selenium.demo.selector;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathPractice extends BaseTest {
    @Test
    void xpathDemo1() {
        driver.get("https://demoqa.com/text-box");
        String fullNameText = driver.findElement(By.xpath("/html[1]/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[1]")).getText();
        System.out.println(fullNameText);
    }

//    @Test
//    void xpathFindByTextTest() {
//        driver.get("https://demoqa.com/text-box");
//        String permanentAddress = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
//        System.out.println(permanentAddress);
//    }

    void xpathFindByContainsTextTest() {
        driver.get("https://demoqa.com/text-box");
        String current = driver.findElement(By.xpath("//label[contains(text(),'Current')]")).getText();
        System.out.println(current);
    }

    @Test
    void xpathByNormalizeSpaceTest() {
        driver.get("https://demoqa.com/text-box");
        String howNambaFoodWorks = driver.findElement(By.xpath("//div[normalize-space()='Как работает NambaFood']")).getText();
        System.out.println(howNambaFoodWorks);
    }

    void xpathSwitchToParentTest() {
        driver.get("https://nambafood.kg/");
        String currentAddress = driver.findElement(By.xpath("//label[@id")).getText();
        System.out.println(currentAddress);

    }

    void xpathCurrentAddress() {
        driver.get("https://nambafood.kg/");
        String currentAddress = driver.findElement(By.xpath("//div[@id='userName-wrapper']/div[1]/following-sibling::div")).getText();
        System.out.println(currentAddress);
    }
    @Test
    void xpathUsingIndexText(){
        WebElement element=driver.findElement(By.xpath("//label[@class='form-label'][3]"));
    }
}
