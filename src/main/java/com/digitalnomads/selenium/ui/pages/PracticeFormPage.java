package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage extends BasePage {
    @FindBy (id="firstName")
    public WebElement fistName;

    @FindBy (id="lastName")
    public WebElement lastName;

    @FindBy (id="userEmail")
    public WebElement userEmail;

    @FindBy (xpath="//label[text()='Male']")
    public WebElement gender;

    @FindBy (id="userNumber")
    public WebElement userNumber;

    @FindBy (id="dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy (xpath="//label[text()='Reading']")
    public WebElement readin;

    @FindBy (id="uploadPicture")
    public WebElement choseFile;

    @FindBy (id="currentAddress")
    public WebElement currentAddress;
    @FindBy (css = "div.react-datepicker__day.react-datepicker__day--012")
    public  WebElement data;
    public  void  writeall (){
        elementActions.writeText(fistName,faker.name().firstName())
                .writeText(lastName,faker.name().lastName())
                .writeText(userEmail,faker.internet().emailAddress())
                .clickTheButton(gender)
                .writeText(userNumber,faker.number().digits(10))
                .clickTheButton(dateOfBirthInput).clickTheButton(data).scrollToElement(readin)
              .clickTheButton(readin).scrollToElement(choseFile)
                .writeText(currentAddress,faker.address().fullAddress());
choseFile.sendKeys("/Users/mac/IdeaProjects/Maven_project/selenium-java-4.9.0 2/Spring2023AutomationFramework/src/main/java/img/Без названия.jpeg");
    }
}

