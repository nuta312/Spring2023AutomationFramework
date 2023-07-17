package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages;

import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.user.User;


public class MyAccountPage extends BasePage {
     @FindBy (xpath = "(//div[@class='box-content']/p)[1]")
    public WebElement contactInformation;
     public  void testSavedNewUsser(User user){
         Assert.assertTrue(contactInformation.getText().contains(user.getUserFirstName()));
         Assert.assertTrue(contactInformation.getText().contains(user.getUserLastName()));
         Assert.assertTrue(contactInformation.getText().contains(user.getUserEmail()));
     }
}
