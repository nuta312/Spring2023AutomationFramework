package selenium.demo.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;


public class Demo1 extends BaseTest {

    @Test
    public void textBoxTest() {

        driver.get("https://demoqa.com/text-box");

        elementActions.writeText(textBoxPage.userFullName, "James Bond")
                .writeText(textBoxPage.userEmail, "james.bond@gmail.com")
                .writeText(textBoxPage.currentAddress, "Karakol")
                .writeText(textBoxPage.permanentAddress, "Karakol");


    }
}
