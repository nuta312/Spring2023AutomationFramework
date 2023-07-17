package selenium.demo.demoqa;

import com.digitalnomads.selenium.ui.config.FakeDataProvider;
import com.digitalnomads.selenium.ui.models.User;
import com.digitalnomads.selenium.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class TextBoxTest extends BaseTest {

    @Test
    void textBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        TextBoxPage textBoxPage1 = new TextBoxPage();
        User user = new User(fakeDataProvider.generateFakeFullName(),
                        fakeDataProvider.generateFakeEmail(),
                        fakeDataProvider.generateFakeCurrentAddress(),
                        fakeDataProvider.generateFakePermanentAddress());

        textBoxPage1.fillUpTheForm(user);
        Thread.sleep(5000);
        String userName = user.getUserFullName();
        String userEmail = user.getUserEmail();
        String userCurrentAddress = user.getUserCurrentAddress();
        String userPermanentAddress = user.getUserPermanentAddress();

        Assert.assertTrue(textBoxPage1.resultFullName.getText().contains(userName));
        Assert.assertTrue(textBoxPage1.resultEmail.getText().contains(userEmail));
        Assert.assertTrue(textBoxPage1.resultCurrentAddress.getText().contains(userCurrentAddress));
        Assert.assertTrue(textBoxPage1.resultPermanentAddress.getText().contains(userPermanentAddress));

    }
    @Test
    void textBoxTest2() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        WebElement element = driver.findElement(By.id("submit"));
         elementActions.scrollToElement(element).clickTheButton(element);
         Thread.sleep(2000);
    }

    }
