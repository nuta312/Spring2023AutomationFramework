package selenium.demo.nambaFoodHomeWork.aidinHomeWork.users;

import com.digitalnomads.selenium.ui.models.User;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Tests {
    Faker faker = new Faker();
    User user = User.builder().userFirstName(faker.name().firstName()).userLastName(faker.name().lastName())
            .userFullName(faker.name().fullName()).password("Adg1adg2*").build();
    RegistrePage registrePage = new RegistrePage();
    LoginPage loginPage = new LoginPage();

    @Test
    void testWithValidData() throws InterruptedException {
        loginPage.logIn(registrePage.createNewUser(user));
    }
}
