package selenium.demo.nambaFoodHomeWork.manasik;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class PracticeFormTest extends BaseTest {
    @Test
    void  demo(){
        driver.get("https://demoqa.com/automation-practice-form");

        Faker faker = new Faker();

        PracticeForm practiceForm = new PracticeForm();
        practiceForm.fillUpTheForm(faker.name().firstName(),faker.funnyName().name(),faker.internet().emailAddress());

    }
}
