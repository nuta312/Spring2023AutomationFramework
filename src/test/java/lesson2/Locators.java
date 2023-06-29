package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Locators extends BaseTest{

    @Test
    void byTagNameTest(){
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/automation-practice-form");
            WebElement studentRegForm = driver.findElement(By.tagName("h5"));
            String studentForm = studentRegForm.getText();
            System.out.println(studentForm);
    }

    @Test
    void byClassNameTest(){
        driver.get("https://demoqa.com/automation-practice-form");
String name=driver.findElement(By.className("form-label")).getText();
        System.out.println(name);
    }

@Test
    void LinkTextTest(){
    driver.get("https://demoqa.com/links");
    String homeLink=driver.findElement(By.linkText("Home")).getText();
    System.out.println(homeLink);

}
@Test
void partialLinkTest(){
    driver.get("https://demoqa.com/links");
    String someLink=driver.findElement(By.partialLinkText("Request")).getText();
    System.out.println(someLink);
}
@Test
    void cssTest(){
    driver.get("https://demoqa.com/text-box");
    String cssLocator = driver.findElement(By.cssSelector("#userName")).getText();
    System.out.println(cssLocator);
}
}
