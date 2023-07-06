package selenium.demo.demo;

import com.digitalnomads.selenium.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import ui.customizedForWebElement.ElementActions;
import ui.pages.TextBox;

public class Demo1 extends BaseTest {

    @Test
    void textBoxTest() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");


        elementActions.inputText(textBox.userFullName, "Tilek")
                .inputText(textBox.userEmail, "tony@gmail.com")
                .inputText(textBox.currentAddress, "Bishkek")
                .inputText(textBox.permanentAddress, "Bishkek")
                .scrollDownToClick(textBox.submit);
        Thread.sleep(3000);
    }
}
