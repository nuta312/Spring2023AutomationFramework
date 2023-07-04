package selenium.demo.lesson3;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

import java.util.List;

public class SauceDemo extends BaseTest {



    Faker faker = new Faker();

    @DataProvider(name = "Data")
    public Object[][] dataOfValidUsers() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},

        };
    }


    @Test(dataProvider = "Data")
    void validLogin(String username, String password) {

        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));

        userName.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();

        WebElement successLogin = driver.findElement(By.xpath("//span[@class='title']"));
        Assert.assertTrue(successLogin.isDisplayed());
    }

    @Test(dependsOnMethods = "validLogin")
    void invalidLogin() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));

        String wrongUsername = faker.name().username();
        String wrongPassword = faker.internet().password();

        userName.sendKeys(wrongUsername);
        passwordField.sendKeys(wrongPassword);
        loginBtn.click();

        WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertTrue(errorMsg.isDisplayed());
        Thread.sleep(3000);

    }
    @Test
    void order() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));

        userName.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginBtn.click();

        List<WebElement> elements = driver.findElements(By.xpath("//button[normalize-space()='Add to cart']"));
        for(WebElement element : elements){
            element.click();
        }

        WebElement busket = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        busket.click();
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Dastan");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Baidolotov");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("722200");


        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//button[@id='finish']")).click();

        WebElement result = driver.findElement(By.xpath("//h2[@class='complete-header']"));

        Assert.assertEquals(result.getText(),"Thank you for your order!");












    }



}
