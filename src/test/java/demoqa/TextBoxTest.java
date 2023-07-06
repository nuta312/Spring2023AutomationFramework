package demoqa;

import com.digitalnomads.models.User;
import com.digitalnomads.pages.TextBoxPage;
import com.digitalnomads.selenium.ui.config.FakeDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class TextBoxTest extends BaseTest {

    @Test
    void textBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        TextBoxPage textBoxPage1 = new TextBoxPage();
        User user = new User
                (fakeDataProvider.generateFakeFullName(),fakeDataProvider.generateFakeEmail(),
        fakeDataProvider.generateFakeCurrentAddress(),fakeDataProvider.generateFakePermanentAddress());


        textBoxPage1.fillUpTheForm(user);
        Thread.sleep(5000);

        String  userName = user.getUserFullName();
        String  userEmail = user.getUserEmail();
        String userCurrentAddress = user.getUserCurrentAddress();
        String userPermanentAddress = user.getUserPermanentAddress();

        Assert.assertEquals(userName, textBoxPage1.userFullName.getAttribute("value"));

    }
}
