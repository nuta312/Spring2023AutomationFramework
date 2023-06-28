package selenium.demo.AlisherHW2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.lesson2Alisher.BaseTest;

public class ChechBoxTestAlish extends BaseTest {

    @Test
    void xpathSwitchToFollowSiblingTest() {
        driver.get("https://demoqa.com/text-box");
        String currentAddress = driver.findElement(By.xpath("//div[@id='userName-wrapper']/div[1]/following-sibling::div")).getText();
        System.out.println(currentAddress);
    }


}
