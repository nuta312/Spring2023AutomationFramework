package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.config.FakeDataProvider;
import ui.driversFactory.MainDriver;

public class PracticeForm extends BasePage{

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(xpath = "//label[text() = 'Male']")
    public WebElement maleGender;

    @FindBy(xpath = "//label[text() = 'Female']")
    public WebElement femaleGender;

    @FindBy(xpath= "//label[text() = 'Other']")
    public WebElement otherGender;

    @FindBy(id = "userNumber")
    public WebElement userNumberInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy (xpath = "//label[text()='Hobbies']")
    public WebElement subjectTitle;

    @FindBy(xpath = "//label[text() = 'Sports']")
    public WebElement sportCheck;

    @FindBy(xpath = "//label[text() = 'Reading']")
    public WebElement readingCheck;

    @FindBy(xpath = "//label[text() = 'Music']")
    public WebElement musicCheck;

    @FindBy(xpath = "//input[@id ='uploadPicture']")
    public WebElement uploadBtn;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(xpath = "//div[@id='stateCity-wrapper']")
    public WebElement stateAndCity;
    @FindBy(xpath = "//div[text()='Select State']")
    public WebElement state;

    @FindBy(xpath = "//div[text()='Select City']")
    public WebElement city;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitBtn;

    public PracticeForm practiceFormTest() throws InterruptedException {
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        elementActions.inputText(firstNameInput,fakeDataProvider.generateFakeFirstName())
                .inputText(lastNameInput, fakeDataProvider.generateFakeLastName())
                .inputText(userEmailInput, fakeDataProvider.generateFakeEmail())
                .clickTheButton(maleGender)
                .inputText(userNumberInput, fakeDataProvider.generateFakeMobileNumber())
                .clearAllEnterNewText(dateOfBirthInput, fakeDataProvider.generateDateOfBirth())
                .scrollDown(subjectTitle)
                .clickAndFillUpAndTab(subjectsInput, "Maths")
                .clickTheButton(sportCheck).clickTheButton(musicCheck).clickTheButton(readingCheck)
                .attachFile(uploadBtn, "C:\\Users\\tilek\\IdeaProjects\\Spring2023AutomationFramework\\src\\main\\app.properties")
                .inputText(currentAddressInput, fakeDataProvider.generateFakeCurrentAddress())
                .scrollDownToBottomPage(MainDriver.getDriver())
                .clickAndFillUpAndTab(state, "Uttar Pradesh")
                .clickAndFillUpAndTab(city, "Agra")
                .scrollDownToClick(submitBtn);
        return this;
    }
}
