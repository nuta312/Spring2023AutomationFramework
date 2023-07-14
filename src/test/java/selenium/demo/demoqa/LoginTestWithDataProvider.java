package selenium.demo.demoqa;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class LoginTestWithDataProvider extends BaseTest {

    @DataProvider(name ="loginData")
    public Object[][] loginData(){
        return new Object[][]{
                {"AM", "Aigerim93!", "Invalid username or password"},
                {"kate", "Aigerim93!", "Invalid username or password"},
                {"AM", "1254", "Invalid username or password"},
                {"fgfg", "dfd8787", "Invalid username or password"}
        };
    }

    @Test(dataProvider ="loginData")
    public void loginTest(String name, String password, String errorMessage){
        driver.get("https://demoqa.com/login");
   loginPage.enterUsername(name)
           .enterPassword(password)
           .clickLogBnt();
        Assert.assertEquals(loginPage.errorMessage.getText(),errorMessage);
    }
}
