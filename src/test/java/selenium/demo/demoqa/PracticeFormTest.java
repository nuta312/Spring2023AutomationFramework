package selenium.demo.demoqa;

import com.digitalnomads.selenium.ui.models.Student;
import com.digitalnomads.selenium.ui.pages.SubmitPage;
import selenium.demo.BaseTest;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @Test
    void practiceFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        Student student = fakeDataProvider.generateStudentsForm();
        practiceFormPage.fillUpThePracticeFormPage(student);
        Thread.sleep(2000);

        SubmitPage submitPage = new SubmitPage();
        submitPage.checkPracticeForm(student);
    }
}
