package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login.testLogin;

import com.digitalnomads.selenium.ui.enums.ErrorMessages;
import com.digitalnomads.selenium.ui.enums.LoginCredentials;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login.pages.LoginPages;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login.user.UserFake;

import static com.digitalnomads.selenium.ui.enums.LoginCredentials.*;
import static org.testng.AssertJUnit.*;


public class TestLogin extends BaseTest {
    LoginPages loginPages = new LoginPages();
    public Faker faker = new Faker();
    public UserFake userFaker = new UserFake(faker.name().firstName(), faker.name().lastName(), "john", "HelloWorld312!");

    @Test
    public void logintest() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPages.enteruserName(johnUserName.getCredentials());
        loginPages.enterPassword(johnPassword.getCredentials());
        loginPages.clickLoginBtn();
        assertEquals(profilePage.element.getText(),"Profile");
    }
    @Test
    public void loginTestWitchFaceUserName() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPages.enteruserName(faker.name().firstName());
        loginPages.enterPassword(johnPassword.getCredentials());
        loginPages.clickLoginBtn();
        assertEquals(loginPages.error.getText(), ErrorMessages.loginValidtion.getErrorMessage());
    }
    @Test
    public void loginWitchFacePassword() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPages.enteruserName(johnUserName.getCredentials());
        loginPages.enterPassword(faker.internet().password(8,10));
        loginPages.clickLoginBtn();
        assertEquals(loginPages.error.getText(), ErrorMessages.loginValidtion.getErrorMessage());
    }
    @Test
    public void loginWitchFacePasswordAndUserName() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPages.enteruserName(faker.name().username());
        loginPages.enterPassword(faker.internet().password(8,10));
        loginPages.clickLoginBtn();
        assertEquals(loginPages.error.getText(), ErrorMessages.loginValidtion.getErrorMessage());
    }


    @Test
    public void TestValid() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPages.userName.sendKeys(userFaker.getFakeUserName());
        loginPages.password.sendKeys(userFaker.getFakeNumber());
        Thread.sleep(2000);
        loginPages.loginBtn.click();
        Thread.sleep(4000);
        assertTrue(loginPages.logout.isDisplayed());
        assertTrue(loginPages.deleteAccountBtn.isDisplayed());
        assertTrue(loginPages.table.isDisplayed());

    }

    @Test
    public void TestNotValidUsername() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPages.userName.sendKeys(faker.name().username());
        loginPages.password.sendKeys(userFaker.getFakeNumber());
        Thread.sleep(2000);
        loginPages.loginBtn.click();
        Thread.sleep(4000);
        assertTrue(loginPages.error.isDisplayed());

    }

    @Test
    public void TestNotValidPassword() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPages.userName.sendKeys(userFaker.getFakeUserName());
        loginPages.password.sendKeys(faker.number().digits(9));
        Thread.sleep(2000);
        loginPages.loginBtn.click();
        Thread.sleep(4000);
        assertTrue(loginPages.error.isDisplayed());

    }

    @Test
    public void NotValidVallue() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPages.userName.sendKeys(faker.name().username());
        loginPages.password.sendKeys(faker.number().digits(9));
        Thread.sleep(2000);
        loginPages.loginBtn.click();
        Thread.sleep(4000);
        assertTrue(loginPages.error.isDisplayed());

    }

    @Test
    public void Testvalid() throws InterruptedException {
        driver.get("https://demoqa.com/login");

        driver.findElement(By.id("newUser")).click();
        loginPages.newfirstName.sendKeys(userFaker.getFakeUserFirstName());
        loginPages.newlastName.sendKeys(userFaker.getFakeUserLastName());
        loginPages.newuserName.sendKeys(userFaker.getFakeUserName());
        loginPages.newUserPassword.sendKeys(userFaker.getFakeNumber());
        WebElement element = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
        Thread.sleep(2000);
        driver.switchTo().frame(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(loginPages.imnotrob).click().perform();
        Thread.sleep(3000);


        Thread.sleep(20000);
        driver.switchTo().parentFrame();

        WebElement webelment = driver.findElement(By.cssSelector("button#register"));
        elementActions.scrollToElement(webelment);
        webelment.click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        TestValid();
        Thread.sleep(5000);
    }

}
