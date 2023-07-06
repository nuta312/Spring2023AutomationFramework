package selenium.demo.nambaFoodHomeWork.aidinHomeWork.pages;

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

    @FindBy(css = "label[for='gender-radio-1']")
    public WebElement genderMale;

    @FindBy(id = "gender-radio-2")
    public WebElement genderFemale;

    @FindBy(id = "gender-radio-3")
    public WebElement genderOther;

    @FindBy(id = "userNumber")
    public WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(id = "hobbies-checkbox-1")
    public WebElement hobbiesSports;

    @FindBy(id = "hobbies-checkbox-2")
    public WebElement hobbiesReading;

    @FindBy(id = "hobbies-checkbox-3")
    public WebElement hobbiesMusic;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "react-select-3-input")
    public WebElement selectState;

    @FindBy(id = "react-select-4-input")
    public WebElement selectCity;

    @FindBy(id = "submit")
    public WebElement submit;

    public PracticeFormPage fillUpTheForm(String firstName, String lastName,
                                          String email, String gender,String mbobileNumber, String hobbies,
                                          String currentAddress){
        actions.writeText(this.firstName,firstName).writeText(this.lastName,lastName).writeText(this.userEmail,email)
                .writeText(this.userNumber,mbobileNumber).writeText(this.currentAddress,currentAddress);
        switch (gender.toLowerCase()){
            case "male": genderMale.click(); break;
            case "female": genderFemale.click(); break;
            case "other": genderOther.click(); break;
        }
//        switch (hobbies.toLowerCase()){
//            case "sports": actions.clickTheButton(hobbiesSports); break;
//            case "reading": actions.clickTheButton(hobbiesReading); break;
//            case "music": actions.clickTheButton(hobbiesMusic); break;
//        }
        return this;
    }
}
