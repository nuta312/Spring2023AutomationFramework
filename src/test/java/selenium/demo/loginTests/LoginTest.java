package selenium.demo.loginTests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static com.digitalnomads.selenium.enums.ErrorMessages.loginValidationError;
import static com.digitalnomads.selenium.enums.LoginCredentials.johnPassword;
import static com.digitalnomads.selenium.enums.LoginCredentials.johnUserName;

@Epic("")
@Feature("")
public class LoginTest extends BaseTest {

    @Link("")
    @Epic("")
    @Feature("")
    @Owner("")
    @Description()
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Login with invalid Credentials")
    void loginWithInvalidCredentials(){
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(johnUserName.getCredential());
        loginPage.enterPassword(johnPassword.getCredential());
        loginPage.clickLogin();

        Assert.assertEquals(profilePage.profileTitle.getText(),"Profile");
    }

    @Test(description = "Login With Invalid UserDB Name")
    void loginWithInvalidUserName(){
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(fakeDataProvider.generateFakeFirstName());
        loginPage.enterPassword(johnPassword.getCredential());
        loginPage.clickLogin();

        Assert.assertEquals(loginPage.errorMessage.getText(),loginValidationError.getErrorMessage());
    }
    @Test(description = "Login With Invalid Password")
    void loginWithInvalidPassword(){
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(johnUserName.getCredential());
        loginPage.enterPassword(fakeDataProvider.generateFakePassword());
        loginPage.clickLogin();

        Assert.assertEquals(loginPage.errorMessage.getText(),loginValidationError.getErrorMessage());
    }

    @Test(description = "Login With Invalid username and Password")
    void loginWithInvalidUserNameAndPassword(){
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(fakeDataProvider.generateFakeFirstName());
        loginPage.enterPassword(fakeDataProvider.generateFakePassword());
        loginPage.clickLogin();

        Assert.assertEquals(loginPage.errorMessage.getText(),loginValidationError.getErrorMessage());
    }
}
