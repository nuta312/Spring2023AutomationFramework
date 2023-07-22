package selenium.demo.demoQa.loginPageTest;


import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import ui.config.FakeDataProvider;
import ui.pages.LoginPage;
import ui.pages.ProfilePage;

public class LoginPageTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @BeforeClass(description = "register wth right credentials")
    void registerWithRightCredentials(){
        driver.get("https://demoqa.com/login");
        LoginPage log = new LoginPage();
        log.enterUserName(LoginCredentials.userName.getCredential())
                .enterPassword(LoginCredentials.password.getCredential())
                .clickNewUserButton();
    }

    @Test(description = "login with right credentials")
    void loginWithRightCredentials(){
        driver.get("https://demoqa.com/login");
        LoginPage log = new LoginPage();
        ProfilePage profile = new ProfilePage();
        log.enterUserName(LoginCredentials.userName.getCredential())
                .enterPassword(LoginCredentials.password.getCredential())
                .clickLoginButton();
        Assert.assertTrue(profile.userNameValue.getText().contains(LoginCredentials.userName.getCredential()));
        System.out.println(profile.userNameValue.getText());
    }

    @Test(description = "login with invalid user name")
    void loginWithInvalidUserName(){
        driver.get("https://demoqa.com/login");
        LoginPage log = new LoginPage();
        FakeDataProvider fake = new FakeDataProvider();
        log.enterUserName(fake.generateFakeFirstName())
                .enterPassword(LoginCredentials.password.getCredential())
                .clickLoginButton();
        Assert.assertTrue(log.invalidUserNameOrPassword.getText().contains("Invalid username or password!"));
    }

    @Test(description = "Login with invalid password")
    void loginWithInvalidPassword(){
        driver.get("https://demoqa.com/login");
        LoginPage log = new LoginPage();
        FakeDataProvider fake = new FakeDataProvider();
        log.enterUserName(LoginCredentials.userName.getCredential())
                .enterPassword(fake.generateFakePassword())
                .clickLoginButton();
        Assert.assertTrue(log.invalidUserNameOrPassword.getText().contains("Invalid username or password!"));
    }

}
