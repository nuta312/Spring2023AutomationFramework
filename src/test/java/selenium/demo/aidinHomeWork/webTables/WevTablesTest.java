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
        webTablesPage.deleteAllUsers();

        ArrayList<String> dataOfUser1 = new ArrayList<>();
        ArrayList<String> dataOfUser2 = new ArrayList<>();
        ArrayList<String> dataOfUser3 = new ArrayList<>();

        users.addToList(dataOfUser1,newUserPage.createNewUser(users.aidin));
        users.addToList(dataOfUser2,newUserPage.createNewUser(users.manas));
        users.addToList(dataOfUser3,newUserPage.createNewUser(users.fake));

        chekUsers(dataOfUser1,"(//div[@role=\"row\"])[2]//div[");
        chekUsers(dataOfUser2,"(//div[@role=\"row\"])[3]//div[");
        chekUsers(dataOfUser3,"(//div[@role=\"row\"])[4]//div[");
    }

    public void chekUsers(ArrayList<String> dataOfUsers,String xpath){
        for (int i = 1; i <= dataOfUsers.size(); i++) {
            WebElement element = driver.findElement(By.xpath(xpath + i + "]"));
            Assert.assertEquals(element.getText(),dataOfUsers.get(i-1));
            System.out.println(element.getText());
        }
        System.out.println("______________________");
    }
}
