package selenium.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IframeDemo extends BaseTest{
    @Test
    void test123(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        String txt = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(txt);

        driver.switchTo().defaultContent();
        String main = driver.findElement(By.xpath("//div[@class=\"main-header\"]")).getText();
        System.out.println(main);
    }
}
