package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.pageses;

import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.userData.FakerData;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.userData.UserWebTables;

public class WebTabelsPage extends BasePage {
    @FindBy(id = "addNewRecordButton")
    public WebElement addBtn;

    @FindBy(css = "input#firstName")
    public WebElement firstName;

    @FindBy(css = "input#lastName")
    public WebElement lastName;

    @FindBy(css = "input#userEmail")
    public WebElement userEmail;

    @FindBy(css = "input#age")
    public WebElement age;

    @FindBy(css = "input#salary")
    public WebElement salary;

    @FindBy(css = "input#department")
    public WebElement department;


    @FindBy(css = "button#submit")
    public WebElement submit;


    public WebTabelsPage writeAll(UserWebTables userWebTables){
        addBtn.click();
        elementActions.writeText(firstName,userWebTables.getFirstName())
                .writeText(lastName,userWebTables.getLastName())
                .writeText(userEmail,userWebTables.getEmail())
                .writeText(age,userWebTables.getAge())
                .writeText(salary,userWebTables.getSalary())
                .writeText(department,userWebTables.getDeparments());
        submit.click();
        return this;
    }

}
