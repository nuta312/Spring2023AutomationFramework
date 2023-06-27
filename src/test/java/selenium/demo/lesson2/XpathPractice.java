package selenium.demo.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathPractice extends BaseTest{
    @Test
    void xpathDemo1(){
        driver.get("https://demoqa.com/text-box");
        String fullNameText=driver.findElement(By.xpath("/html[1]/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[1]")).getText();
        System.out.println(fullNameText);

    }
    @Test
    void xpathFindByTextTest(){
        driver.get("https://demoqa.com/text-box");
        String fullNameText=driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
        System.out.println(fullNameText);
    }
    @Test
    void xpathFindByContainsTextTest(){
        driver.get("https://demoqa.com/text-box");
        String currentAddress=driver.findElement(By.xpath("//label[contains(text()='Current']")).getText();
        System.out.println(currentAddress);
    }
    @Test
    void xpathFindByNormalizeSpaceTest() {
        driver.get("https://nambafood.kg");
        String howNambaFoodWorks= driver.findElement(By.xpath("//div[normalize-space()='Как рработает NambaFood']")).getText();
        System.out.println(howNambaFoodWorks);
    }
    @Test
    void xpathSwitchToParentTest(){
        driver.get("https://demoqa.com/text-box");
        String currentAddress=driver.findElement(By.xpath("//label[@id='userName-label']/..")).getText();
        System.out.println(currentAddress);
    }
    @Test
    void xpathSwitchToFollowingSiblings(){
        driver.get("https://demoqa.com/text-box");
        WebElement element=driver.findElement(By.xpath("//div[@id='userName-wrapper']/div[1]/following-sibling::div"));
        System.out.println(element);
    }
    @Test
    void xpanthUsingIndexTest(){
        driver.get("https://demoqa.com/text-box");
        String name = driver.findElement(By.xpath("(//label [@class='form-label'])[3]")).getText();

    }
    }
