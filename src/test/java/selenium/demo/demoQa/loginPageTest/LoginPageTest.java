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
    @Test
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
        loginPage.enterUserName(LoginCredentials.userName.getCredential())
                .enterPassword(LoginCredentials.password.getCredential())
                .clickLoginButton();
        Assert.assertTrue(profilePage.userNameValue.getText().contains(LoginCredentials.userName.getCredential()));
    }

    @Test(description = "login with invalid user name")
    void loginWithInvalidUserName(){
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(fakeDataProvider.generateFakeFirstName())
                .enterPassword(LoginCredentials.password.getCredential())
                .clickLoginButton();
        Assert.assertTrue(loginPage.invalidUserNameOrPassword.getText().contains("Invalid username or password!"));
    }

    @Test(description = "Login with invalid password")
    void loginWithInvalidPassword(){
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(LoginCredentials.userName.getCredential())
                .enterPassword(fakeDataProvider.generateFakePassword())
                .clickLoginButton();
        Assert.assertTrue(loginPage.invalidUserNameOrPassword.getText().contains("Invalid username or password!"));
    }

}
