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

    @Test
    void PracticeFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider faker = new FakeDataProvider();
        PracticeFormPage practiceForm = new PracticeFormPage();
        User user = new User(faker.generateFakeFirstName(), faker.generateFakeLastName(),
                faker.generateFakeEmail(), faker.generateFakePhoneNumber(), faker.generateFakeCurrentAddress());
                WebElementActions.scrollToElement(driver, driver.findElement(By.id("uploadPicture")));
                Thread.sleep(4000);

        practiceForm.fillUpTheStudentRegistrationForm(user);
        Thread.sleep(5000);


//        WebElementActions.scrollToElement(driver, driver.findElement(By.id("uploadPicture")));
//        Thread.sleep(4000);
//        WebElement uploadFile = driver.findElement(By.id("uploadPicture"));
////        uploadFile.click();
//        Thread.sleep(3000);
//        uploadFile.sendKeys("\"C:\\Users\\Victus\\Desktop\\Снимок экрана 2023-06-30 171420.png\"");
    }

    }

