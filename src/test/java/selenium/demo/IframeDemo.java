package selenium.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IframeDemo extends  BaseTest{

    @Test
    void test123(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("//div[@class='main-header']")).getText());
    }
}
