package selenium.demo.nambaFoodHomeWork.aidinHomeWork.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class Tests extends BaseTest {

    LoginUser login = new LoginUser();

    @Test
    void testCreateUserAndLogIn() throws InterruptedException {
        loginPage.logIn(registrePage.createNewUser(login.user));
    }

    @Test
    void testLoginWithValidData() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPage.logIn(login.aidin);
        Assert.assertEquals(profilePage.profileText.getText(), "Profile");
        Thread.sleep(5000);
    }
    @Test
    void testLoginWithInvalidName(){
        driver.get("https://demoqa.com/login");
        loginPage.logIn(login.userFakeName);
        System.out.println(loginPage.messageName.getText().trim());
        Assert.assertEquals(loginPage.messageName.getText().trim(),"Invalid username or password!");
    }

    @Test
    void testLoginWithInvalidPass(){
        driver.get("https://demoqa.com/login");
        loginPage.logIn(login.userFakePass);
        System.out.println(loginPage.messageName.getText().trim());
        Assert.assertEquals(loginPage.messageName.getText().trim(),"Invalid username or password!");
    }
    @Test
    void testLoginWithInvalidData(){
        driver.get("https://demoqa.com/login");
        loginPage.logIn(login.userFake);
        System.out.println(loginPage.messageName.getText().trim());
        Assert.assertEquals(loginPage.messageName.getText().trim(),"Invalid username or password!");
    }


}
