package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage {

    @FindBy(id = "addNewRecordButton")
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
    @FindBy(id="submit")
    WebElement submitBtn;

    public WebTablesPage clickAddBtn(){
        elementActions.clickTheButton(addButton);
        return this;
    }

    public WebTablesPage enterFirstName(String firstName){
        elementActions.writeText(firstNameInput, firstName);
        return this;

    }

    public WebTablesPage enterLastName(String lastName){
        elementActions.writeText(lastNameInput, lastName);
        return this;
    }

    public WebTablesPage enterEmail(String emailAddress){
        elementActions.writeText(userEmailInput, emailAddress);
        return this;
    }

    public WebTablesPage enterAge(String age){
        elementActions.writeText(ageInput, age);
        return this;
    }
  public WebTablesPage enterSalary(String salary){
        elementActions.writeText(salaryInput, salary);
        return this;
  }
  public WebTablesPage enterDepartment(String department){
        elementActions.writeText(departmentInput, department);
        return  this;
  }
  public WebTablesPage clickSubmitBtn(){
        elementActions.clickTheButton(submitBtn);
        return this;
  }

}