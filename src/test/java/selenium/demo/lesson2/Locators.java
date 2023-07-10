package selenium.demo.lesson2;

import com.digitalnomads.selenium.ui.drivers.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class Locators extends BaseTest {

    @Test
    void byTagNameTest() {

        driver.get("https://demoqa.com/automation-practice-form");
        WebElement studentRegistrationForm = driver.findElement(By.tagName("h5"));
        String studentForm = studentRegistrationForm.getText();
        System.out.println(studentForm);


    }

    @Test
    void byClassNameTest() {
        driver.get("https://demoqa.com/automation-practice-form");
        String name = driver.findElement(By.className("form-label")).getText();
        System.out.println(name);
    }

    @Test
    public void LinkTextTest(){
        driver.get("https://demoqa.com/links");
        String HomeLink = driver.findElement(By.linkText("Home")).getText();
        System.out.println(HomeLink);

    }

    @Test
    void partialLinkTextTest(){
        driver.get("https://demoqa.com/links");
        String someText = driver.findElement(By.partialLinkText("Request")).getText();
        System.out.println(someText);
    }

    @Test
    void cssTest(){
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("#userName")).sendKeys("SomeName");
    }



}
