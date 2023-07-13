package selenium.demo.aidinHomeWork.webTables;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.demo.BaseTest;

public class NewUserPage extends BaseTest {
    WebTablesPage webTablesPage = new WebTablesPage();
    ElementActions elementActions = new ElementActions();
    public NewUserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(id = "age")
    public WebElement age;

    @FindBy(id = "salary")
    public WebElement salary;

    @FindBy(id = "department")
    public WebElement department;

    @FindBy(id = "submit")
    public WebElement submit;

    public User createNewUser(User user){
        webTablesPage.addUserBtn.click();
        elementActions.writeText(firstName,user.firstName)
                .writeText(lastName,user.lastName).writeText(email,user.email)
                .writeText(age,user.age).writeText(salary,user.salary)
                .writeText(department, user.department)
                .clickTheButton(submit);
        return user;
    }
}
