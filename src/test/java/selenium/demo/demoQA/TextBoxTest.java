package selenium.demo.demoQA;

import com.digitalnomads.selenium.ui.config.FakeDataProvider;
import com.digitalnomads.selenium.ui.models.User;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class TextBoxTest extends BaseTest {

    FakeDataProvider fakeDataProvider = new FakeDataProvider();

    User user = new User.Builder().setUserFullName(fakeDataProvider.generateFakeFullName()).setUserEmail(fakeDataProvider.generateUserEmail())
            .setUserCurrentAddress(fakeDataProvider.generateCurrentAddress())
            .setUserPermanentAddress(fakeDataProvider.generatePermanentAddress()).build();

    TextBoxPage textBoxPage = new TextBoxPage();



    @Test
    public void testTextBox(){

        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillUpTheForm(user);
        Assert.assertEquals(textBoxPage.resultName.getText().substring(5),user.getUserFullName());
        Assert.assertEquals(textBoxPage.resultEmail.getText().substring(6),user.getUserEmail());
        Assert.assertEquals(textBoxPage.resultCurrentAddress.getText().substring(17),user.getUserCurrentAddress());
        Assert.assertEquals(textBoxPage.resultPermanentAddress.getText().substring(20),user.getUserPermanentAddress());
    }



}
