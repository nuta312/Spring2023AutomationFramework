package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends  BasePage{



    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy (id = "lastName")
    public WebElement lastName;

    @FindBy (xpath = "//input[@placeholder='name@example.com']")
    public WebElement userEmail;

    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement gender;

    @FindBy (xpath ="//*[text()='Male']")
    public WebElement genderMale;

    @FindBy(xpath = "//*[text()='Female']")
    public WebElement genderFemale;

    @FindBy (xpath = "//*[text()='Other']")
    public WebElement genderOther;

    @FindBy (xpath = "//input[@placeholder='Mobile Number']")
    public WebElement mobileNumber;

    @FindBy (id="dateOfBirthInput")
    public WebElement dateOfBirth;

    @FindBy (xpath = "//*[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
    public WebElement subject;

    @FindBy(xpath = "//*[text()='Hobbies']")
    public WebElement hobbies;

    @FindBy (xpath = "//*[text()='Sports']")
    public WebElement hobbiesSports;

    @FindBy (xpath="//*[text()='Reading']")
    public WebElement hobbiesReading;

    @FindBy(xpath = "//*[text()='Music']")
    public WebElement hobbiesMusic;

    @FindBy(id="uploadPicture")
    public WebElement uploadPictures;

    @FindBy (xpath = "//textarea[@placeholder='Current Address']")
    public WebElement currentAddress;

    @FindBy (xpath ="//*[text()='Select State']")
    public WebElement selectState;

    @FindBy (id ="city")
    public WebElement selectCity;

    @FindBy(id="submit")
    public WebElement submit;



    public PracticeFormPage fillUpTheStudentRegistrationForm(User userDetails) {
        elementActions.writeText(firstName, userDetails.getFirstName())
                .writeText(lastName, userDetails.getLastName())
                .writeText(userEmail, userDetails.getUserEmail())
                .writeText(mobileNumber, userDetails.getMobileNumber())
                .writeText(currentAddress, userDetails.getUserCurrentAddress());
        return this;
//        if (gender.equals("male")) {
//            genderMale.click();
//        } else if(gender.equals("female")){
//            genderFemale.click();
//        } else{
//            genderOther.click();
//        }
//
//
//        if (hobbies.equals("sports")) {
//            hobbiesSports.click();
//        } else if (hobbies.equals("reading")) {
//            hobbiesReading.click();
//        } else if (hobbies.equals("music")) {
//            hobbiesMusic.click();
//        }
//         elementActions.scrollToElement(submit);
//        elementActions.clickTheButton(submit);
//
//        return this;
    }
}
