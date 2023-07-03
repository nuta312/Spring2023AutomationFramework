package selenium.demo.nambaFoodHomeWork.tilekNamba.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Xpath extends BaseTestbyTilek{

    @Test
    void byXpathDemo1(){
        driver.get("https://demoqa.com/text-box");
        String fullName = driver.findElement(By.xpath("/html[1]/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[1]")).getText();
        System.out.println(fullName);
    }

    @Test
    void  xpathFindByText(){
        driver.get("https://demoqa.com/text-box");
        String permanentAddress = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
        System.out.println(permanentAddress);
    }

    @Test
    void  xpathFindByContainsTextTest(){
        driver.get("https://demoqa.com/text-box");
        String currentAddress = driver.findElement(By.xpath("//label[contains(text(), 'Current')]")).getText();
        System.out.println(currentAddress);
    }

    @Test
    void  xpathFindByNormalizeSpaceText(){
        driver.get("https://nambafood.kg/");
        String nambaFood = driver.findElement(By.xpath("//div[normalize-space()='Как работает NambaFood']")).getText();
        System.out.println(nambaFood);
    }

    @Test
    void xpathSwitchToParentTest(){
        driver.get("https://demoqa.com/text-box");
        String name = driver.findElement(By.xpath("//label[@id='userName-label']/..")).getText();
        System.out.println(name);
    }

    @Test
    void  xpathSwitchToFollowingSiblingTest(){
        driver.get("https://demoqa.com/text-box");
        WebElement element = driver.findElement(By.xpath("//div[@id= 'userName-wrapper']/div[1]/following-sibling::div"));
    }

    @Test
    void xpathUsingIndexTest(){
        driver.get("https://demoqa.com/text-box");
            String str =driver.findElement(By.xpath("(//label[@class='form-label'])[3]")).getText();
        System.out.println(str);

    }

}
