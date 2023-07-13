package selenium.demo.aidinHomeWork.login;

import com.digitalnomads.selenium.ui.models.User;
import selenium.demo.BaseTest;
import selenium.demo.aidinHomeWork.enums.LoginCredentials;

public class LoginUser extends BaseTest {
    User user = User.builder().firstName(faker.name().firstName()).lastName(faker.name().lastName())
            .fullName(faker.name().fullName()).password("Adg1adg2*").build();
    User userFakeName = User.builder().fullName(faker.name().fullName()).password(LoginCredentials.aidinPassword.getCredential()).build();
    User userFakePass = User.builder().fullName(LoginCredentials.aidinUserName.getCredential()).password(faker.internet().password()).build();
    User userFake = User.builder().fullName(faker.name().fullName()).password(faker.internet().password()).build();
    User aidin = User.builder().fullName(LoginCredentials.aidinUserName.getCredential()).password(LoginCredentials.aidinPassword.getCredential()).build();
}
