package selenium.demo.demoqa;

import com.digitalnomads.selenium.ui.helper.DropDownHelper;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.util.List;

import static enums.WebTableFormCredentials.*;

public class WebTableFormTest extends BaseTest {

    @BeforeClass
    public void createNewUser(){
    }

    @Test

    void fillUpWebTableFormTest() throws InterruptedException {

        driver.get("https://demoqa.com/webtables");
        webTablesPage.clickAddBtn();
        webTablesPage.enterFirstName(studentFirstName.getCredentials());
        webTablesPage.enterLastName(studentLastName.getCredentials());
        webTablesPage.enterEmail(studentEmail.getCredentials());
        webTablesPage.enterAge(studentAge.getCredentials());
        webTablesPage.enterSalary(studentSalary.getCredentials());
        webTablesPage.enterDepartment(studentDepartment.getCredentials());
        webTablesPage.clickSubmitBtn();
        Thread.sleep(5000);
        List<WebElement> formList = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        for(WebElement studentsList:formList){
            System.out.println(studentsList.getText());
        }
        List<WebElement> resultList= driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println(DropDownHelper.checkValueByText(resultList, "Aigerim"));



    }

}
