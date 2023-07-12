package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.driverFactory.Driver;
import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

    public PracticeFormPage fillUpTheFirstName(User userDetails){
        elementActions.writeText(firstName,userDetails.getUserFirstName());
        return this;

    }
    public PracticeFormPage fillUpTheLastName(User userDetails){
        elementActions.writeText(lastName, userDetails.getUserLastName());
        return this;
    }
    public PracticeFormPage fillUpTheUserEmail(User userDetails){
        elementActions.writeText(userEmail, userDetails.getUserEmail());
        return this;
    }
    public PracticeFormPage clickTheGender(){
        Random random= new Random();
        List<WebElement> genderBtn= Arrays.asList(genderMale, genderFemale, genderOther);
        int index = random.nextInt(genderBtn.size());
        WebElement gender=genderBtn.get(index);
        elementActions.clickTheButton(gender);
        return this;

    }
    public PracticeFormPage fillUpThePhoneNumber(User userDetails){
        elementActions.writeText(mobileNumber, userDetails.getUserMobileNumber());
        return this;
    }
    public PracticeFormPage chooseDateOfBirth(){
        WebDriver driver = Driver.getDriver();
        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();
        dateOfBirth.sendKeys("10/08/2020");
        return this;

    }
    public PracticeFormPage fillUpTheSubject(){
        elementActions.writeTextWithEnter(subject, "Math");
        return this;
    }
    public PracticeFormPage clickTheHobbies(){
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("window.scrollBy(0,300);");
        elementActions.clickTheButton(hobbiesReading);
        return this;
    }
    public PracticeFormPage uploadThePicture(){
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("window.scrollBy(0,300);");
        String filePath = "C:\\\\Users\\\\Victus\\\\IdeaProjects\\\\springproject\\\\Spring2023AutomationFramework\\\\src\\\\main\\\\resources\\\\Снимок экрана 2023-06-30 171420.png";
        elementActions.writeText(uploadPictures,filePath);
        return this;
    }
    public PracticeFormPage fillUpTheCurrentAddress(User userDetails){
        elementActions.writeText(currentAddress, userDetails.getUserCurrentAddress());
        return this;
    }
    public PracticeFormPage chooseState(){
        selectState.sendKeys("N");
        selectState.sendKeys(Keys.TAB);
        return this;
    }
    public PracticeFormPage chooseCity(){
        selectCity.sendKeys("D");
        selectCity.sendKeys(Keys.TAB);
        return this;
    }
    public PracticeFormPage submitBtn(){
        submit.sendKeys(Keys.ENTER);
        return this;
    }
    public PracticeFormPage fillUpTheForm(User userDetails){
        return fillUpTheFirstName(userDetails)
                .fillUpTheLastName(userDetails)
                .fillUpTheUserEmail(userDetails)
                .clickTheGender()
                .fillUpThePhoneNumber(userDetails)
                .chooseDateOfBirth()
                .fillUpTheSubject()
                .clickTheHobbies()
                .uploadThePicture()
                .fillUpTheCurrentAddress(userDetails)
                .chooseState()
                .chooseCity()
                .submitBtn();


    }
    }

