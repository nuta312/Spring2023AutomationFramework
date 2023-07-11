package selenium.demo.nambaFoodHomeWork.baiasov.practiceFormPage;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.demo.BaseTest;

public class PracticeFormPage extends BaseTest {

    public PracticeFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    ElementActions actions = new ElementActions();
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(xpath = "//label[text()='Male']")
    public WebElement gender;

    @FindBy(id = "userNumber")
    public WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(xpath = "//label[text()='Reading']")
    public WebElement reading;

    @FindBy(id = "uploadPicture")
    public WebElement choseFile;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;
    @FindBy(css = "div.react-datepicker__day.react-datepicker__day--012")
    public WebElement data;

//    public PracticeFormPage fillUpPracticeFormPageAll(String firstName, String lastName,
//                                                      String userEmail, String gender, String userNumber, String dateOfBirthInput,
//                                                      String hobbies, String currentAddress) {
//        actions.clickTheButton(Driver.getDriver().findElement(By.xpath("//div[@class=\\\"header-right\\\"]")))
//                .scrollToElement(this.firstName).writeText();
//    }
}





