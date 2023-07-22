package selenium.demo.demoQa;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.demo.demoQa.loginPageTest.LoginCredentials;
import ui.config.FakeDataProvider;
import ui.pages.LoginPage;


public class LoginPageWithDataProvider extends BaseTest {
    FakeDataProvider fake = new FakeDataProvider();
    LoginPage log = new LoginPage();
    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        return new Object[][] {
                {fake.generateFakeLastName(), fake.generateFakePassword()},
                {LoginCredentials.userName.getCredential(), fake.generateFakePassword()},
                {fake.generateFakeFirstName(), LoginCredentials.password.getCredential()}
        };
    }

    @Test(dataProvider = "loginData")
    void testLoginPage(String userName, String password){
        driver.get("https://demoqa.com/login");
        log.enterUserName(userName).enterPassword(password).clickLoginButton();
        Assert.assertEquals(log.invalidUserNameOrPassword.getText(), "Invalid username or password!");

    }

}
