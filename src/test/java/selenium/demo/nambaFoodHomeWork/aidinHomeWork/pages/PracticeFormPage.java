package selenium.demo.nambaFoodHomeWork.aidinHomeWork.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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

    @FindBy(xpath = "(//div[@class=\" css-1hwfws3\"])[1]")
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
        subjectsInput.sendKeys("English",Keys.TAB);
        actions.writeText(this.userNumber,mbobileNumber);
        switch (hobbies.toLowerCase()){
            case "sports": hobbiesSports.click(); break;
            case "reading": hobbiesReading.click(); break;
            case "music": hobbiesMusic.click(); break;
        }
//        elementActions.writeText(this.uploadPicture,"/Users/aidiniskenderov/Desktop/Снимок\\ экрана\\ 2023-06-22\\ в\\ 21.29.09.png ");
        actions.writeText(this.currentAddress,currentAddress);
        actions.scrollToElement(this.currentAddress);
        selectState.sendKeys("NCR",Keys.TAB);
        actions.clickTheButton(submit);
        return this;
    }
}
