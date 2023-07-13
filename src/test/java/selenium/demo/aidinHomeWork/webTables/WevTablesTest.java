package selenium.demo.aidinHomeWork.webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.util.ArrayList;

public class WevTablesTest extends BaseTest {
    WebTablesPage webTablesPage = new WebTablesPage();
    NewUserPage newUserPage = new NewUserPage();
    WebTablesUsers users = new WebTablesUsers();
    @Test
    public void demo() throws InterruptedException {
        ArrayList<String> dataOfUsers = new ArrayList<>();
        webTablesPage.deleteAllUsers();
        webTablesPage.addUserBtn.click();
        newUserPage.createNewUser(users.aidin);
        users.addToList(dataOfUsers,users.aidin);
        for (int i = 1; i <= dataOfUsers.size(); i++) {
            WebElement element = driver.findElement(By.xpath("(//div[@role=\"row\"])[2]//div[" + i + "]"));
            Assert.assertEquals(element.getText(),dataOfUsers.get(i-1));
            System.out.println(element.getText());
        }
        Thread.sleep(5000);
    }
}
