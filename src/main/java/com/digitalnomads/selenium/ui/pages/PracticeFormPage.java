package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.models.User;
import dev.failsafe.internal.util.Assert;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage extends BasePage {
    @FindBy(id = "firstName")
    public WebElement fistName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(xpath = "//label[text()='Male']")
    public WebElement gender;

    @FindBy(id = "userNumber")
    public WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(xpath = "//label[text()='Reading']")
    public WebElement readin;

    @FindBy(id = "uploadPicture")
    public WebElement choseFile;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;
    @FindBy(css = "div.react-datepicker__day.react-datepicker__day--012")
    public WebElement data;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(id="subjectsInput")
    public WebElement subject;

    @FindBy(id="react-select-3-input")
    public WebElement select;
    @FindBy(id="react-select-4-input")
    public WebElement selectCity;
    @FindBy (id = "(//tbody/tr/td)[2]")
    public  WebElement element;



    public void writeall() {
        choseFile.sendKeys("/Users/mac/IdeaProjects/Maven_project/selenium-java-4.9.0 2/Spring2023AutomationFramework/src/main/java/img/Без названия.jpeg");
        User user = new User(faker.name().firstName(),faker.internet().emailAddress(),faker.address().fullAddress(),faker.internet().emailAddress());
        elementActions.writeText(fistName,user.getUserFullName() )
                .writeText(lastName, faker.name().lastName())
                .writeText(userEmail, user.getUserEmail())
                .clickTheButton(gender)
                .writeText(userNumber, faker.number().digits(10))
                .clickTheButton(dateOfBirthInput).clickTheButton(data).scrollToElement(readin)
                .clickTheButton(readin).scrollToElement(choseFile)
                .writeText(currentAddress, user.getUserCurrentAddress())
                .enterClick(subject,"ma").enterClick(subject,"bi")
                .enterClick(select,"N").enterClick(selectCity,"G");
    }


}
