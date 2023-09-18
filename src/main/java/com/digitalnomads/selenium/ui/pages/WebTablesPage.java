package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{
    @FindBy(id = "addNewRecordButton")
    public WebElement addBtn;
}
