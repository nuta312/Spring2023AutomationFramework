package selenium.demo.lesson2Alisher;

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

    @Test
    void xpathDemo2() {
        driver.get("https://demoqa.com/text-box");
        String permanentAddress = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
        System.out.println(permanentAddress);
    }

    @Test
    void xpathFindByContainsTextTest() {
        driver.get("https://demoqa.com/text-box");
        String currentAddress = driver.findElement(By.xpath("//[contains(text(),'Current')]")).getText();
        System.out.println(currentAddress);
    }

    @Test
    void xpathFindByNormalizeTextTest() {
        driver.get("https://demoqa.com/text-box");
        String howNambaFoodWork = driver.findElement(By.xpath("//div[normalize-space()='Как работает NambaFood']")).getText();
        System.out.println(howNambaFoodWork);
    }

    @Test
    void xpathSwitchToParentTest() {
        driver.get("https://demoqa.com/text-box");
        String fullName = driver.findElement(By.xpath("//label[@id='userName-label']/..")).getText();
        System.out.println(fullName);
    }

    @Test
    void xpathSwitchToFollowSiblingTest() {
        driver.get("https://demoqa.com/text-box");
        String currentAddress = driver.findElement(By.xpath("//div[@id='userName-wrapper']/div[1]/following-sibling::div")).getText();
        System.out.println(currentAddress);
    }
    @Test
    void xpathUsingIndexTest(){
        WebElement element = driver.findElement(By.xpath("(//label [@class='form-label'])[3]"));

    }




}
