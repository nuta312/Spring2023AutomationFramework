package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage {
    public PracticeFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "gender-radio-1")
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

}
