package selenium.demo.login;

import com.digitalnomads.selenium.ui.driverFactory.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
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

    @Test
    void loginValidCredentials() {
        driver.get("https://demoqa.com/login");
        WebElement login = driver.findElement(By.xpath("//input[@placeholder='UserName']"));
        login.click();
        login.sendKeys("AM");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.click();
        password.sendKeys("Aigerim93!");
        WebElement login1 = driver.findElement(By.id("login"));
        login1.click();

    }

    @Test
    void registerWithoutClickingCaptcha() throws InterruptedException {
        driver.get("https://demoqa.com/register");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100);");


        elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                .writeText(registerPage.registerUserNameField, faker.name().username())
                .writeText(registerPage.registerUserPasswordField, "Digital23!");
        registerPage.registerBtn.sendKeys(Keys.ENTER);
        WebElement wrongCaptchaMessage = driver.findElement(By.xpath("//*[text()='Please verify reCaptcha to register!']"));
        Assert.assertTrue(wrongCaptchaMessage.isDisplayed());
        Thread.sleep(5000);

    }

    @Test
    void registeringWithNotValidPasswordOnlyLetters() throws InterruptedException {
        driver.get("https://demoqa.com/register");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100);");


        elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                .writeText(registerPage.registerUserNameField, faker.name().username())
                .writeText(registerPage.registerUserPasswordField, "Digital");


        driver.switchTo().frame(registerPage.captchaBtn);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("recaptcha-anchor"))).perform();
        driver.switchTo().parentFrame();
        Thread.sleep(1500);
        registerPage.registerBtn.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement wrongPasswordMessage = driver.findElement(By.xpath("//p[@class='mb-1']"));
        Assert.assertTrue(wrongPasswordMessage.isDisplayed());

    }

    @Test
    void registeringWithNotValidPasswordLettersWithNumbers() throws InterruptedException {
        driver.get("https://demoqa.com/register");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100);");


        elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                .writeText(registerPage.registerUserNameField, faker.name().username())
                .writeText(registerPage.registerUserPasswordField, "Digital12");


        driver.switchTo().frame(registerPage.captchaBtn);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("recaptcha-anchor"))).perform();
        driver.switchTo().parentFrame();
        Thread.sleep(1500);
        registerPage.registerBtn.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement wrongPasswordMessage = driver.findElement(By.xpath("//p[@class='mb-1']"));
        Assert.assertTrue(wrongPasswordMessage.isDisplayed());
        Thread.sleep(4000);


    }

    @Test
    void registeringWithNotValidPasswordLettersWithChar() throws InterruptedException {
        driver.get("https://demoqa.com/register");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100);");


        elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                .writeText(registerPage.registerUserNameField, faker.name().username())
                .writeText(registerPage.registerUserPasswordField, "Digital!");


        driver.switchTo().frame(registerPage.captchaBtn);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("recaptcha-anchor"))).perform();
        driver.switchTo().parentFrame();
        Thread.sleep(1500);
        registerPage.registerBtn.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement wrongPasswordMessage = driver.findElement(By.xpath("//p[@class='mb-1']"));
        Assert.assertTrue(wrongPasswordMessage.isDisplayed());
        Thread.sleep(4000);

    }
    @Test
    void registeringWithNotValidPasswordCharWithNum() throws InterruptedException {
        driver.get("https://demoqa.com/register");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100);");


        elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                .writeText(registerPage.registerUserNameField, faker.name().username())
                .writeText(registerPage.registerUserPasswordField, "12345!@#$%");


        driver.switchTo().frame(registerPage.captchaBtn);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("recaptcha-anchor"))).perform();
        driver.switchTo().parentFrame();
        Thread.sleep(1500);
        registerPage.registerBtn.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement wrongPasswordMessage = driver.findElement(By.xpath("//p[@class='mb-1']"));
        Assert.assertTrue(wrongPasswordMessage.isDisplayed());
}
    @Test
    void registeringWithNotValidPasswordNotEnoughElements() throws InterruptedException {
        driver.get("https://demoqa.com/register");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100);");


        elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                .writeText(registerPage.registerUserNameField, faker.name().username())
                .writeText(registerPage.registerUserPasswordField, "d1!");


        driver.switchTo().frame(registerPage.captchaBtn);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("recaptcha-anchor"))).perform();
        driver.switchTo().parentFrame();
        Thread.sleep(1500);
        registerPage.registerBtn.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement wrongPasswordMessage = driver.findElement(By.xpath("//p[@class='mb-1']"));
        Assert.assertTrue(wrongPasswordMessage.isDisplayed());
} @Test
    void notValidRegPasswordOnlyLowerCaseLetters() throws InterruptedException {
        driver.get("https://demoqa.com/register");
         JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
         js.executeScript("window.scrollBy(0,100)");

         elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                 .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                 .writeText(registerPage.registerUserNameField, faker.name().username())
                 .writeText(registerPage.registerUserPasswordField, "hello");
         driver.switchTo().frame(registerPage.captchaBtn);
         Actions actions = new Actions(driver);
         actions.click(driver.findElement(By.id("recaptcha-anchor"))).perform();
         driver.switchTo().defaultContent();
         Thread.sleep(2000);
         registerPage.registerBtn.sendKeys(Keys.ENTER);
         Thread.sleep(3000);
         WebElement wrongPasswordMessage = driver.findElement(By.xpath("//p[@class='mb-1']"));
         Assert.assertTrue(wrongPasswordMessage.isDisplayed());
    }

    @Test
    void notValidRegPasswordOnlyNum() throws InterruptedException {
        driver.get("https://demoqa.com/register");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,100)");

        elementActions.writeText(registerPage.registerUserFirstNameField, faker.name().firstName())
                .writeText(registerPage.registerUserLastNameField, faker.name().lastName())
                .writeText(registerPage.registerUserNameField,faker.name().username())
                .writeText(registerPage.registerUserPasswordField, "123456");
        driver.switchTo().frame(registerPage.captchaBtn);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("recaptcha-anchor"))).perform();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        registerPage.registerBtn.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement wrongPasswordMessage = driver.findElement(By.xpath("//p[@class='mb-1']"));
        Assert.assertTrue(wrongPasswordMessage.isDisplayed());

    }


    @Test
    void DateOFBirth() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,100)");
        WebElement subject = driver.findElement(By.xpath("//*[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
        subject.click();
        subject.sendKeys("M");
        subject.sendKeys(Keys.ENTER);
        Thread.sleep(5000);


    }
//    @Test (testName = "Login with valid credentials")
//    void loginWithValidCredentials(){
//        driver.get();
//        loginPage.enterUsername()

    }
