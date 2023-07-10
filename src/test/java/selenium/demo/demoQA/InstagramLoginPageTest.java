package selenium.demo.demoQA;


import com.digitalnomads.selenium.ui.config.FakeDataProvider;
import com.digitalnomads.selenium.ui.models.User;
import com.digitalnomads.selenium.ui.pages.InstagramLoginPage;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class InstagramLoginPageTest extends BaseTest {
    FakeDataProvider fakeDataProvider = new FakeDataProvider();
     User user = new User.Builder().setUserEmail(fakeDataProvider.generateUserEmail())
             .setUserPassword(fakeDataProvider.generatePassword()).build();

    InstagramLoginPage instagramLoginPage = new InstagramLoginPage();

   @Test
    void test123() {
       driver.get("https://www.instagram.com/");
       instagramLoginPage.login(user);


   }
}
