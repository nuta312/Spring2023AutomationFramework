package selenium.demo.demoQa;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import ui.config.FakeDataProvider;
import ui.model.User;
import ui.pages.TextBox;

import static org.testng.AssertJUnit.assertTrue;

public class TextBoxTest extends BaseTest {

    @Test
    void textBoxTest(){
        driver.get("https://demoqa.com/text-box");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        User user = new User();
        user.setUserFullName(fakeDataProvider.generateFakeFullName());
        user.setUserEmail(fakeDataProvider.generateFakeEmail());
        user.setUserCurrentAddress(fakeDataProvider.generateFakeCurrentAddress());
        user.setUserPermanentAddress(fakeDataProvider.generateFakePermanentAddress());
        TextBox textBox = new TextBox();
        textBox.fillUpTheTextBox(user);

        assertTrue(textBox.resultFullName.getText().contains(user.getUserFullName()));
        assertTrue(textBox.resultEmail.getText().contains(user.getUserEmail()));
        assertTrue(textBox.resultCurrentAddress.getText().contains(user.getUserCurrentAddress()));
        assertTrue(textBox.resultPermanentAddress.getText().contains(user.getUserPermanentAddress()));


    }
}
