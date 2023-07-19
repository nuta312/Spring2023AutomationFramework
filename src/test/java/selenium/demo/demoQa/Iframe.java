package selenium.demo.demoQa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class Iframe extends BaseTest {

    @Test
    void iframeTest(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        driver.findElement(By.id("sampleHeading")).getText();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
    }
}
