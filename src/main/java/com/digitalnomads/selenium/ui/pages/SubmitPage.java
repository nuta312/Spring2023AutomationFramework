package com.digitalnomads.selenium.ui.pages;


import com.digitalnomads.selenium.ui.helper.FileUtils;
import com.digitalnomads.selenium.ui.models.Student;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

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

        StringBuilder subjectsBuilder = new StringBuilder();
        List<String> subjectsList = studentForm.getSubjects();
        int lastIndex = subjectsList.size() - 1;
        for (int i = 0; i < subjectsList.size(); i++) {
            subjectsBuilder.append(subjectsList.get(i));
            if (i != lastIndex) {
                subjectsBuilder.append(", ");
            }
        }
        String subjects = subjectsBuilder.toString();
        Assert.assertEquals(resultSubjects.getText(),subjects);

        StringBuilder hobbiesBuilder = new StringBuilder();
        List<String> hobbiesList = studentForm.getHobbies();
        int lastInd = hobbiesList.size() - 1;
        for (int i = 0; i < hobbiesList.size(); i++) {
            hobbiesBuilder.append(hobbiesList.get(i));
            if (i != lastInd) {
                hobbiesBuilder.append(", ");
            }
        }
        String hobbies = hobbiesBuilder.toString();
        Assert.assertEquals(resultHobbies.getText(),hobbies);
        Assert.assertEquals(resultPicture.getText(), FileUtils.getFilenameFromPath(studentForm.getPicturePath()));
        Assert.assertEquals(resultAddress.getText(), studentForm.getCurrentAddress());
        Assert.assertEquals(resultStateAndCity.getText(), studentForm.getState()+" "+studentForm.getCity());


    }
}
