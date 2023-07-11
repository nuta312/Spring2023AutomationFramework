package selenium.demo.login;

import com.digitalnomads.selenium.ui.driverFactory.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class LoginTest extends BaseTest {

    Faker faker = new Faker();


    @Test
    void loginWithNonRegisteredUser() {
        driver.get("https://demoqa.com/login");
        elementActions.writeText(loginPage.userNameField, faker.name().username())
                .writeText(loginPage.userPasswordField, faker.internet().password())
                .clickTheButton(loginPage.loginBtn);
        WebElement wrongMessage = driver.findElement(By.id("name"));
        Assert.assertTrue(wrongMessage.isDisplayed());
    }

    @Test
    void registerNewUser() throws InterruptedException {
        driver.get("https://demoqa.com/register");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100);");


        elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                .writeText(registerPage.registerUserNameField, faker.name().username())
                .writeText(registerPage.registerUserPasswordField, "Digital23!");


        driver.switchTo().frame(registerPage.captchaBtn);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("recaptcha-anchor"))).perform();
        driver.switchTo().parentFrame();
        Thread.sleep(1500);
        registerPage.registerBtn.sendKeys(Keys.ENTER);
        Thread.sleep(3000);



    }


}
