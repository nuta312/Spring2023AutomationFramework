package selenium.demo.nambaFoodHomeWork.aidinHomeWork.users;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.models.User;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    Faker faker = new Faker();
    User user = User.builder().userFirstName(faker.name().firstName()).userLastName(faker.name().lastName())
            .userFullName(faker.name().fullName()).password("Adg1adg2*").build();
    User userFake = User.builder().userFullName(faker.name().fullName()).password(faker.internet().password()).build();
    RegistrePage registrePage = new RegistrePage();
    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();

    @Test
    void testLoginWithValidData() throws InterruptedException {
        loginPage.logIn(registrePage.createNewUser(user));
    }

    @Test
    void testLoginWithInvalidData(){
        driver.get("https://demoqa.com/login");
        loginPage.logIn(userFake);
        System.out.println(loginPage.messageName.getText().trim());
        Assert.assertEquals(loginPage.messageName.getText().trim(),"Invalid username or password!");
    }
}
