package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage extends  BasePage{
    @FindBy(xpath ="//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy (xpath = "//input[@placeholder='name@example.com']")
    public WebElement userEmail;

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



}
