package selenium.demo.demoqa;

import com.digitalnomads.selenium.ui.pages.InstagramLoginPage;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class InstagramLoginTest extends BaseTest {

    InstagramLoginPage instagramLoginPage = new InstagramLoginPage();
    @Test
    void test123(){
        driver.get("https://www.instagram.com/");

        instagramLoginPage.login("999999999999999", "1111111122333");
    }
}
