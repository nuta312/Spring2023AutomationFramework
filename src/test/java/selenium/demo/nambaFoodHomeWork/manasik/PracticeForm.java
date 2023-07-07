package selenium.demo.nambaFoodHomeWork.manasik;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.demo.BaseTest;

public class PracticeForm extends BaseTest {
    public PracticeForm(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label/text()")
    public WebElement Male;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label/text()")
    public WebElement Female;

    @FindBy(xpath = "//label[@for=\"gender-radio-3\"]")
    public WebElement Other;

    @FindBy(xpath = "(//input[@autocomplete=\"off\"])[4]")
    public WebElement mobileNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//div[@class=\"subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3\"]")
    public WebElement Subjects;

    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-1\"]")
    public WebElement HobbiesSports;

    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-2\"]")
    public WebElement HobbiesReading;

    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-3\"]")
    public WebElement HobbiesMusic;

    @FindBy(id = "uploadPicture")
    public WebElement Picture;

    @FindBy(partialLinkText = "textarea")
    public WebElement currentAddress;

    @FindBy(partialLinkText = "Select State")
    public WebElement selectState;


    public PracticeForm fillUpTheForm(String firstName, String lastName, String email){
        elementActions = new ElementActions();
        elementActions.writeText(this.firstName,firstName).writeText(this.lastName,lastName).writeText(this.userEmail,email);
        return this;
    }
}
