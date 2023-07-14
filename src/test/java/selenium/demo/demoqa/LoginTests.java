package selenium.demo.demoqa;

import enums.ErrorMessage;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static enums.LoginCredentials.johnPassword;
import static enums.LoginCredentials.johnUserName;

public class LoginTests extends BaseTest {
    @BeforeClass
    public void createNewUser(){
    }
    @Test(description = "Login with valid credentials")
    void loginWithValidCredentials() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPage.enterUsername(johnUserName.getCredential());
        loginPage.enterPassword(johnPassword.getCredential());
        loginPage.clickLogBnt();
        Assert.assertEquals(profilePage.profileTitle.getText(), "Profile");
        Thread.sleep(5000);
    }
    @Test(description = "Login with invalid username")
    void loginWithInvalidUsername() {
        driver.get("https://demoqa.com/login");
        loginPage.enterUsername(fakeDataProvider.generateFakeFullName());
        loginPage.enterPassword(johnPassword.getCredential());
        loginPage.clickLogBnt();
        Assert.assertEquals(loginPage.errorMessage.getText(), ErrorMessage.loginValidationError.getErrorMessage());
    }
    @Test(description = "Login with invalid password")
    void loginWithInvalidPassword() {
        driver.get("https://demoqa.com/login");
        loginPage.enterUsername(johnUserName.getCredential());
        loginPage.enterPassword(fakeDataProvider.generatePassword());
        loginPage.clickLogBnt();
        Assert.assertEquals(loginPage.errorMessage.getText(),ErrorMessage.loginValidationError.getErrorMessage());
    }
    @Test(description = "Login with invalid username and invalid password")
    void loginWithInvalidUsernameAndPassword() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPage.enterUsername(fakeDataProvider.generateFakeFullName());
        loginPage.enterPassword(fakeDataProvider.generatePassword());
        loginPage.clickLogBnt();
        Assert.assertEquals(loginPage.errorMessage.getText(), ErrorMessage.loginValidationError.getErrorMessage());
        Thread.sleep(5000);
    }
}

