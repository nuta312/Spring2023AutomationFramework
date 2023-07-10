package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.models.Student;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class PracticeFormPage extends BasePage {

    public  PracticeFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(xpath = "//label[@for=\"gender-radio-1\"]")
    public WebElement genderMale;

    @FindBy(xpath = "//label[@for=\"gender-radio-2\"]")
    public WebElement genderFemale;

    @FindBy(xpath = "//label[@for=\"gender-radio-3\"]")
    public WebElement genderOther;

    @FindBy(id = "userNumber")
    public WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-1\"]")
    public WebElement hobbiesSports;

    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-2\"]")
    public WebElement hobbiesReading;

    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-3\"]")
    public WebElement hobbiesMusic;

    @FindBy(xpath = "//input[@id=\"uploadPicture\"]")
    public WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "react-select-3-input")
    public WebElement selectState;

    @FindBy(id = "react-select-4-input")
    public WebElement selectCity;

    @FindBy(xpath = "//button[@id=\"submit\"]")
    public WebElement submitBtn;


    public PracticeFormPage fillUpThePracticeFormPage(Student studentForm) throws InterruptedException {
        elementActions.writeText(firstName, studentForm.getFirstName())
                .writeText(lastName, studentForm.getLastName())
                .writeText(userEmail, studentForm.getUserEmail());
        generateGender(studentForm.getGender());
        elementActions.writeText(dateOfBirthInput,Keys.chord(Keys.CONTROL,"a"))
                .writeText(dateOfBirthInput,studentForm.getDateOfBirth());

        elementActions.writeText(userNumber, studentForm.getMobileNumber());
        selectSubjects(studentForm.getSubjects());
        selectHobbies(studentForm.getHobbies());
        elementActions.writeText(uploadPicture,studentForm.getPicturePath());
                elementActions.writeText(currentAddress,studentForm.getCurrentAddress())
                .writeText(selectState,studentForm.getState()).writeText(selectState,Keys.TAB+" ")
                .writeText(selectCity,studentForm.getCity()).writeText(selectCity,Keys.TAB+" ");
                elementActions.clickJS(submitBtn);
        return this;
    }

    public PracticeFormPage selectHobbies(List<String> hobbies){
        for (String hobby : hobbies){
            if (hobbiesSports.getText().equals(hobby)){
                elementActions.clickJS(hobbiesSports);
            }  else if (hobbiesReading.getText().equals(hobby)) {
                elementActions.clickJS(hobbiesReading);
            }else {
                elementActions.clickTheButton(hobbiesMusic);
            }
        }
        return this;
    }



    public PracticeFormPage selectSubjects(List<String> subjects){
        for (String subject: subjects) {
            elementActions.writeText(subjectsInput,subject)
                    .writeText(subjectsInput,Keys.TAB+" ");
        }
        return this;
    }

    public PracticeFormPage generateGender(String gender){
        if(gender.equals(genderMale.getText())){
            elementActions.clickTheButton(genderMale);
        } else if (gender.equals(genderFemale.getText())){
            elementActions.clickTheButton(genderFemale);
        } else {
            elementActions.clickTheButton(genderOther);
        }
        return this;
    }

}
