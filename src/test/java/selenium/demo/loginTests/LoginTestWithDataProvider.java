package selenium.demo.loginTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class LoginTestWithDataProvider extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData()

    {
        return new Object[][]{
                {"kate", "HelloWorld312!", "Invalid username or password!"},
                {"john", "JohnyWorld145!", "Invalid username or password!"},
                {"alex", "AlexiWorld145!", "Invalid username or password!"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String name, String password, String errorMessage) {
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(name)
                .enterPassword(password)
                .clickLogin();
        Assert.assertEquals(loginPage.errorMessage.getText(), errorMessage);
    }
}
