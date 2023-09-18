package com.digitalnomads.selenium.ui.pages;


import com.digitalnomads.selenium.ui.models.Student;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SubmitPage extends BasePage {

    @FindBy(xpath = "//td[text()='Student Name']/following-sibling::td")
    public WebElement resultName;

    @FindBy(xpath = "//td[text()='Student Email']/following-sibling::td")
    public WebElement resultEmail;

    @FindBy(xpath = "//td[text()='Gender']/following-sibling::td")
    public WebElement resultGender;

    @FindBy(xpath = "//td[text()='Mobile']/following-sibling::td")
    public WebElement resultMobile;

    @FindBy(xpath = "//td[text()='Date of Birth']/following-sibling::td")
    public WebElement resultDateOfBirth;

    @FindBy(xpath = "//td[text()='Subjects']/following-sibling::td")
    public WebElement resultSubjects;

    @FindBy(xpath = "//td[text()='Hobbies']/following-sibling::td")
    public WebElement resultHobbies;

    @FindBy(xpath = "//td[text()='Picture']/following-sibling::td")
    public WebElement resultPicture;

    @FindBy(xpath = "//td[text()='Address']/following-sibling::td")
    public WebElement resultAddress;

    @FindBy(xpath = "//td[text()='State and City']/following-sibling::td")
    public WebElement resultStateAndCity;

    public void checkPracticeForm(Student studentForm) {

        Assert.assertEquals(resultName.getText(), studentForm.getFirstName() + " " + studentForm.getLastName());
        Assert.assertEquals(resultEmail.getText(), studentForm.getUserEmail());
        Assert.assertEquals(resultGender.getText(), studentForm.getGender());
        Assert.assertEquals(resultMobile.getText(), studentForm.getMobileNumber());
        Assert.assertEquals(resultDateOfBirth.getText(), studentForm.getFormattedDateOfBirth());

        String subjects = String.join(", ", studentForm.getSubjects());
        Assert.assertEquals(resultSubjects.getText(), subjects);

        String hobbies = String.join(", ", studentForm.getHobbies());
        Assert.assertEquals(resultHobbies.getText(), hobbies);
        Assert.assertEquals(resultPicture.getText(), Student.getFilenameFromPath(studentForm.getPicturePath()));
        Assert.assertEquals(resultAddress.getText(), studentForm.getCurrentAddress());
        Assert.assertEquals(resultStateAndCity.getText(), studentForm.getState() + " " + studentForm.getCity());


    }
}
