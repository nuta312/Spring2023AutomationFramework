package selenium.demo.aidinHomeWork.login;

import com.digitalnomads.selenium.ui.models.User;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class Tests extends BaseTest {

    LoginUser login = new LoginUser();

//    @Test
//    void testCreateUserAndLogIn() throws InterruptedException {
//        loginPage.logIn(registrePage.createNewUser(login.user));
//    }

    @Test
    void testLoginWithValidData() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPage.logIn(login.aidin);
        Assert.assertEquals(profilePage.profileText.getText(), "Profile");
        Thread.
                sleep(5000);
    }
    @DataProvider(name = "data")
    public Object[][] users(){
        return new Object[][]{
                {login.userFake},
                {login.userFakeName},
                {login.userFakePass}
        };
    }
    @Test(dataProvider = "data")
    void test(User user) throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPage.logIn(user);
        Assert.assertEquals(loginPage.messageName.getText().trim(),"Invalid username or password!");
    }



}
