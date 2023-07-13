package selenium.demo.aidinHomeWork.login;

import com.digitalnomads.selenium.ui.models.User;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class DataProviderTest extends BaseTest {
    LoginUser user = new LoginUser();
    @DataProvider(name = "data")
    public Object[][] users(){
        return new Object[][]{
                {user.userFake},
                {user.userFakeName},
                {user.userFakePass}
        };
    }
    @Test(dataProvider = "data")
    void test(User user) throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPage.logIn(user);
        Assert.assertEquals(loginPage.messageName.getText().trim(),"Invalid username or password!");
    }
}
