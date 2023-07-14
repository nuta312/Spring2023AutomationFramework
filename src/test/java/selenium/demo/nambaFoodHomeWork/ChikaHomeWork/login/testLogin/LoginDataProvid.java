package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.login.testLogin;

import com.digitalnomads.selenium.ui.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static com.digitalnomads.selenium.ui.enums.LoginCredentials.johnUserName;

public class LoginDataProvid extends BaseTest {
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"kate", "HelloWorld312!", "Invalid username or password!"},
                {"john", "HelloWorld3122222!", "Invalid username or password!"},
                {"kate", "FakePassword312!", "Invalid username or password!"}
        };
    }
    @Test(dataProvider = "loginData")
    public void loginTest(String name, String password, String errorMessage) {
        driver.get("https://demoqa.com/login");
        loginPages.enteruserName(name)
                .enterPassword(password)
                .clickLoginBtn();
        Assert.assertEquals(loginPages.error.getText(),errorMessage);
    }
}









