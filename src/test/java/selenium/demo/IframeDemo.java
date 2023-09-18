package selenium.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IframeDemo extends BaseTest{
    @Test
    void test123(){
        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");
        String text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);

        driver.switchTo().defaultContent();
        String mainHeader = driver.findElement(By.xpath("//div[text()='Frames']")).getText();
        System.out.println(mainHeader);
    }
}
