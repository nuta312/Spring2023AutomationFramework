package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.driverFactory.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SelectMenu extends BasePage {

    @FindBy (id="oldSelectMenu")
        public WebElement selectMenuColors;
    @FindBy (xpath = "//option[@value='red']")
    public WebElement selectRed;
    @FindBy (xpath = "//option[@value='1']")
    public WebElement selectBlue;
    @FindBy (xpath = "//option[@value='2']")
    public WebElement selectGreen;
    @FindBy (xpath = "//option[@value='3']")
    public WebElement selectYellow;
    @FindBy (xpath = "//option[@value='4']")
    public WebElement selectPurple;
    @FindBy (xpath = "//option[@value='5']")
    public WebElement selectBlack;
    @FindBy (xpath = "//option[@value='6']")
    public WebElement selectWhite;
    @FindBy (xpath = "//option[@value='7']")
    public WebElement selectVoilet;
    @FindBy (xpath = "//option[@value='8']")
    public WebElement selectIndigo;
    @FindBy (xpath = "//option[@value='9']")
    public WebElement selectMagenta;
    @FindBy (xpath = "//option[@value='10']")
    public WebElement selectAqua;

    public void selectColors() {
        selectMenuColors.sendKeys(Keys.ENTER);

        Random random = new Random();
        List<WebElement> listOfColors = Arrays.asList(selectAqua, selectMagenta, selectVoilet, selectWhite, selectBlack,
                selectIndigo, selectGreen, selectPurple, selectRed, selectBlue, selectYellow);
        int index = random.nextInt(listOfColors.size());
        Select select = new Select(selectMenuColors);
        select.selectByIndex(index);

        Driver.getDriver().findElement(By.xpath("//div[@class = 'main-header']")).click();


        }
    }





