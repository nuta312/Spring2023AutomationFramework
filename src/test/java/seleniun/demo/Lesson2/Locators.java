package seleniun.demo.Lesson2;

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
        WebElement studentRegForm = driver.findElement(By.tagName("h5"));
        String studentForm = studentRegForm.getText();
        System.out.println(studentRegForm);

    }

    @Test
    void byClassNameTest() {
        driver.get("https://demoqa.com/automation-practice-form");
        String name = driver.findElement(By.className("form-label")).getText();
        System.out.println(name);


    }

    @Test
    void linkTextTest(){
        driver.get("https://demoqa.com/links");
        String homeLink = driver.findElement(By.linkText("Home")).getText();
        System.out.println(homeLink);

    }

    @Test
    void  partialLinkText(){
        driver.get("https://demoqa.com/links");
        String someText = driver.findElement(By.partialLinkText("Request")).getText();
        System.out.println(someText);
    }
    @Test
    void cssTest(){
        driver.get("https://demoqa.com/links");
        driver.findElement(By.cssSelector("#userName")).sendKeys("SomeName`");

    }
}
