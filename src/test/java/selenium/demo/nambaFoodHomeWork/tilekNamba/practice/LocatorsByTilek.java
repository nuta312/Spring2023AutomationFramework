package selenium.demo.nambaFoodHomeWork.tilekNamba.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LocatorsByTilek extends BaseTestbyTilek{


    @Test
    void byTagNameTest(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement studentRegForm = driver.findElement(By.tagName("h5"));
        String studentForm = studentRegForm.getText();
        System.out.println(studentForm);
    }

    @Test
    void byClassName(){
        driver.get("https://demoqa.com/automation-practice-form");
        String name = driver.findElement(By.className("form-label")).getText();
        System.out.println(name);
    }

    @Test
    void byLinkTextTest(){
        driver.get("https://demoqa.com/links");
        String homeLink = driver.findElement(By.linkText("Home")).getText();
        System.out.println(homeLink);
    }

    @Test
    void byPartialLinkTest(){
        driver.get("https://demoqa.com/links");
        String someText = driver.findElement(By.partialLinkText("Request")).getText();
        System.out.println(someText);
    }

    @Test
    void byCssTest(){
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("#userName")).sendKeys("Some Name");
    }
}
