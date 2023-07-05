package codingbat.kamiii;

import com.digitalnomads.webElementActions.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class Demo1  extends BaseTest {

    @Test
    public void textBoxTest() {

      driver.get("https://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.id("userName"));
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));



    }
}
