package selenium.demo.nambaFoodHomeWork.aidinHomeWork.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @FindBy(css = "label[for='gender-radio-2']")
    public WebElement genderFemale;

    @FindBy(css = "label[for='gender-radio-3']")
    public WebElement genderOther;

    @FindBy(id = "userNumber")
    public WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(xpath = "//div[@class=\"react-datepicker__day react-datepicker__day--027\"]")
    public WebElement june27;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(css = "label[for='hobbies-checkbox-1']")
    public WebElement hobbiesSports;

    @FindBy(css = "label[for='hobbies-checkbox-2']")
    public WebElement hobbiesReading;

    @FindBy(css = "label[for='hobbies-checkbox-3']")
    public WebElement hobbiesMusic;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(css = "#stateCity-wrapper #state")
    public WebElement selectState;

    @FindBy(xpath = "(//div[@class=\" css-1wy0on6\"])[2]")
    public WebElement selectCity;

    @FindBy(id = "submit")
    public WebElement submit;

    public PracticeFormPage fillUpTheForm(String firstName, String lastName,
                                          String email, String gender,String mbobileNumber, String hobbies,
                                          String currentAddress){
        actions.clickTheButton(Driver.getDriver().findElement(By.xpath("//div[@class=\"header-right\"]")))
                .scrollToElement(this.firstName).writeText(this.firstName,firstName)
                .writeText(this.lastName,lastName).writeText(this.userEmail,email);
        switch (gender.toLowerCase()){
            case "male": genderMale.click(); break;
            case "female": genderFemale.click(); break;
            default: genderOther.click(); break;
        }
        actions.writeText(subjectsInput,"English");
        subjectsInput.sendKeys(Keys.TAB);
        actions.writeText(this.userNumber,mbobileNumber).clickTheButton(dateOfBirthInput)
                .clickTheButton(june27);
        switch (hobbies.toLowerCase()){
            case "sports": hobbiesSports.click(); break;
            case "reading": hobbiesReading.click(); break;
            case "music": hobbiesMusic.click(); break;
        }
//.writeText(this.uploadPicture,"/Users/aidiniskenderov/Downloads/Курсовая\\ Эконом\\ орг\\ \\(Айдин\\).docx");
        actions.writeText(this.currentAddress,currentAddress);
        actions.clickTheButton(submit);
        return this;
    }
}
