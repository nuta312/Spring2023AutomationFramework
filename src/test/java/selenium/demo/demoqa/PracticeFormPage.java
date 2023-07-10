package selenium.demo.demoqa;

import com.digitalnomads.selenium.ui.config.FakeDataProvider;
import com.digitalnomads.selenium.ui.models.User;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class PracticeFormPage extends BaseTest {
    @Test
    void practiceFormPage() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        PracticeFormPage practiceFormPage1 = new PracticeFormPage();
        User user = new User(fakeDataProvider.generateFakeFullName(),
                fakeDataProvider.generateFakeEmail(),
                fakeDataProvider.generateFakeCurrentAddress(),
                fakeDataProvider.generateFakePermanentAddress());




    }
}
