package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.models.UserWebTablesForm;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage {

    @FindBy(id = "addNewRecord")
    WebElement addButton;

    @FindBy(id = "firstName")
    WebElement firstNameInput;

    @FindBy(id = "lastName")
    WebElement lastNameInput;
    @FindBy(id = "userEmail")
    WebElement userEmailInput;
    @FindBy(id = "age")
    WebElement ageInput;
    @FindBy(id = "salary")
    WebElement salaryInput;
    @FindBy(id = "department")
    WebElement departmentInput;

//public WebTablesPage fillUpRegistrationForm(){
//elementActions.clickTheButton(addButton)
//        .writeText(firstNameInput, )
//}
//
//
//
//}
}