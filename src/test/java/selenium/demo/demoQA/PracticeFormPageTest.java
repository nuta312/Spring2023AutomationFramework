package selenium.demo.demoQA;

import com.digitalnomads.selenium.ui.config.FakeDataProvider;
import com.digitalnomads.selenium.ui.models.User;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class PracticeFormPageTest extends BaseTest {
    FakeDataProvider fakeDataProvider = new FakeDataProvider();

    User user = new User.Builder().setUserFirstName(fakeDataProvider.generateFirstName())
            .setUserLastName(fakeDataProvider.generateLastName())
            .setUserEmail(fakeDataProvider.generateUserEmail())
            .setUserMobileNumber(fakeDataProvider.generateMobileNumber())
            .setUserCurrentAddress(fakeDataProvider.generateCurrentAddress()).build();

    PracticeFormPage practiceFormPage = new PracticeFormPage();


    @Test
    void test123() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        practiceFormPage.fillUpTheAllPage(user);
        Thread.sleep(5000);

    }
}
