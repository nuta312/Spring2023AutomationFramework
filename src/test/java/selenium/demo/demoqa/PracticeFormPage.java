package selenium.demo.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class PracticeFormPage extends BaseTest {

    @Test
    void subject() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement element = driver.findElement(By.id("subjectsInput"));

        elementActions.writeTextWithEnter(element, "Maths");
        Thread.sleep(5000);
    }



}



