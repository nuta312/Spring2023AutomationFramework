package selenium.demo.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.time.Duration;

public class Demo1 extends BaseTest {
    @Test
    public void textBoxTest() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");



        elementActions.writeText(textBoxPage.userFullName, "James Bond")
                .writeText(textBoxPage.userEmail, "james@BondCom")
                .writeText(textBoxPage.currentAddress, "Wall street 23")
                .writeText(textBoxPage.currentAddress, "Some address");
        Thread.sleep(5000);
    }
}
