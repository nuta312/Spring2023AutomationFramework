package selenium.demo.nambaFoodHomeWork.aidinHomeWork.login;

import com.digitalnomads.selenium.ui.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class Tests extends BaseTest {
    User user = User.builder().userFirstName(faker.name().firstName()).userLastName(faker.name().lastName())
            .userFullName(faker.name().fullName()).password("Adg1adg2*").build();
    User userFake = User.builder().userFullName(faker.name().fullName()).password(faker.internet().password()).build();
    User aidin = User.builder().userFullName("aidin").password("Aidin123*").build();

    @Test
    void testCreateUserAndLogIn() throws InterruptedException {
        loginPage.logIn(registrePage.createNewUser(user));
    }

    @Test
    void testLoginWithValidData() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPage.logIn(aidin);
        Assert.assertEquals(profilePage.profileText.getText(), "Profile");
        Thread.sleep(5000);
    }
    @Test
    void testLoginWithInvalidData(){
        driver.get("https://demoqa.com/login");
        loginPage.logIn(userFake);
        System.out.println(loginPage.messageName.getText().trim());
        Assert.assertEquals(loginPage.messageName.getText().trim(),"Invalid username or password!");
    }


}
