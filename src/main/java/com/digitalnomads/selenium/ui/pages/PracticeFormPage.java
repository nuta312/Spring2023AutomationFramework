package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PracticeFormPage extends BasePage {


    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    public WebElement otherRadioButton;

    @FindBy(id = "userNumber")
    public WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement dateOfBirth;

    @FindBy(id = "subjectsInput")
    public WebElement subjects;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    public WebElement sportsCheckbox;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    public WebElement readingCheckbox;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    public WebElement musicCheckbox;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement uploadPicture;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElement currentAddress;

    @FindBy(id = "react-select-3-input")
    public WebElement state;

    @FindBy(id = "react-select-4-input")
    public WebElement city;

    @FindBy(id = "submit")
    public WebElement submit;


    public PracticeFormPage fillUpTheFirstName(User userDetails) {
        elementActions.writeText(firstName, userDetails.getUserFirstName());
        return this;
    }

    public PracticeFormPage fillUpTheLastName(User userDetails) {
        elementActions.writeText(lastName, userDetails.getUserLastName());
        return this;
    }

    public PracticeFormPage fillUpTheUserEmail(User userDetails) {
        elementActions.writeText(userEmail, userDetails.getUserEmail());
        return this;
    }

    public PracticeFormPage clickTheGenderBtn() {

        Random random = new Random();
        List<WebElement> radioButtons = Arrays.asList(maleRadioButton, femaleRadioButton, otherRadioButton);
        int randomBtn = random.nextInt(radioButtons.size());
        WebElement radioButton = radioButtons.get(randomBtn);
        elementActions.clickTheButton(radioButton);
        return this;
    }

    public PracticeFormPage fillUpTheMobileNumber(User userDetails) {
        elementActions.writeText(mobileNumber, userDetails.getUserMobileNumber());
        return this;
    }

    public PracticeFormPage fillUpTheDateOfBirth() {
        elementActions.clickTheButton(dateOfBirth)
                .clickTheButton(Driver.getDriver().findElement(By.xpath("//select[@class='react-datepicker__month-select']")))
                .clickTheButton(Driver.getDriver().findElement(By.xpath("//option[@value = '7']")))
                .clickTheButton(Driver.getDriver().findElement(By.xpath("//select[@class='react-datepicker__year-select']")))
                .clickTheButton(Driver.getDriver().findElement(By.xpath("//option[@value = '1999']")))
                .clickTheButton(Driver.getDriver().findElement(By.xpath("//div[@aria-label='Choose Monday, August 9th, 1999']")));
        return this;
    }


    public PracticeFormPage fillUpTheSubjects() {
        subjects.sendKeys("M");
        subjects.sendKeys(Keys.ENTER);
        subjects.sendKeys("A");
        subjects.sendKeys(Keys.ENTER);
        subjects.sendKeys("B");
        subjects.sendKeys(Keys.ENTER);
        return this;
    }

    public PracticeFormPage clickTheHobbiesBtn() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 300);");
        elementActions.clickTheButton(sportsCheckbox).clickTheButton(readingCheckbox).clickTheButton(musicCheckbox);
        return this;
    }

    public PracticeFormPage uploadThePicture() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 300);");
        String picturePath = "C:\\\\Users\\\\Amin_stors\\\\IdeaProjects\\\\Spring2023AutomationFramework\\\\src\\\\main\\\\resources\\\\images\\\\HelloWorld.svg.png";
        elementActions.writeText(uploadPicture, picturePath);
        return this;

    }

    public PracticeFormPage fillUpTheCurrentAddress(User userDetails) {
        elementActions.writeText(currentAddress, userDetails.getUserCurrentAddress());
        return this;

    }

    public PracticeFormPage fillUpTheState() {
        state.sendKeys("N");
        state.sendKeys(Keys.TAB);
        return this;
    }

    public PracticeFormPage fillUpTheCity()  {
        city.sendKeys("D");
        city.sendKeys(Keys.TAB);
        return this;
    }

    public PracticeFormPage submitBtn() {
        submit.sendKeys(Keys.ENTER);
        return this;
    }


    public PracticeFormPage fillUpTheAllPage(User userDetails) {
        return fillUpTheFirstName(userDetails)
                .fillUpTheLastName(userDetails)
                .fillUpTheUserEmail(userDetails)
                .clickTheGenderBtn()
                .fillUpTheMobileNumber(userDetails)
                .fillUpTheDateOfBirth()
                .fillUpTheSubjects()
                .clickTheHobbiesBtn()
                .uploadThePicture()
                .fillUpTheCurrentAddress(userDetails)
                .fillUpTheState()
                .fillUpTheCity()
                .submitBtn();
    }


}
