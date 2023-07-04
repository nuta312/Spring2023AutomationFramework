package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.demo.WebElementMethods;

import java.time.Duration;

public class Locators  extends BaseTest {

    @Test
    void byTagName(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement studentRegForm = driver.findElement(By.tagName("h5"));
        String studentForm = studentRegForm.getText();
        System.out.println(studentForm);

        driver.close();
        driver.quit();


    }

    @Test
    void byClassNameTest(){
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

//    @Test
//    void partialLinkText() {
//        driver.get("https://demoqa.com/links");
//        String someText = driver.findElement(By.partialLinkText("0hNrS")).getText();
//        System.out.println(someText);
//    }

    @Test
    void css(){
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("#userName")).sendKeys("SomeName");
    }
}
