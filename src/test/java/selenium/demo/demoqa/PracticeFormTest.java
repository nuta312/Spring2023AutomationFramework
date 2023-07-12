package selenium.demo.demoqa;

import com.digitalnomads.WebElementActions;
import com.digitalnomads.selenium.ui.configuration.FakeDataProvider;
import com.digitalnomads.selenium.ui.models.User;
import com.digitalnomads.selenium.ui.pages.PracticeFormPage;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class PracticeFormTest extends BaseTest {
    FakeDataProvider faker = new FakeDataProvider();
    User user = new User.Builder().setUserFirstName(faker.generateFirstName())
            .setUserLastName(faker.generateLastName())
            .setUserEmail(faker.generateUserEmail())
            .setUserMobileNumber(faker.generateMobileNumber())
            .setUserCurrentAddress(faker.generateCurrentAddress()).build();
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    @Test
    void PracticeFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        practiceFormPage.fillUpTheForm(user);
        Thread.sleep(5000);



    }

    }

