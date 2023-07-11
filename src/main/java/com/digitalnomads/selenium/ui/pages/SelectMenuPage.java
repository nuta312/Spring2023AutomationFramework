package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SelectMenuPage extends BasePage {

    @FindBy(id = "oldSelectMenu")
    private WebElement selectMenu;

    @FindBy(xpath = "//option[@value = 'red']")
    private WebElement selectRed;

    @FindBy(xpath = "//option[@value = '1']")
    private WebElement selectBlue;

    @FindBy(xpath = "//option[@value = '2']")
    private WebElement selectGreen;

    @FindBy(xpath = "//option[@value = '3']")
    private WebElement selectYellow;

    @FindBy(xpath = "//option[@value = '4']")
    private WebElement selectPurple;

    @FindBy(xpath = "//option[@value = '5']")
    private WebElement selectBlack;

    @FindBy(xpath = "//option[@value = '6']")
    private WebElement selectWhite;

    @FindBy(xpath = "//option[@value = '7']")
    private WebElement selectViolet;

    @FindBy(xpath = "//option[@value = '8']")
    private WebElement selectIndigo;

    @FindBy(xpath = "//option[@value = '9']")
    private WebElement selectMagenta;

    @FindBy(xpath = "//option[@value = '10']")
    private WebElement selectAqua;

    void selectColor() throws InterruptedException {
        selectMenu.sendKeys(Keys.ENTER);

        Random random = new Random();

        List<WebElement> colors = Arrays.asList(selectAqua, selectMagenta, selectBlack, selectIndigo, selectBlue
                , selectGreen, selectPurple, selectRed, selectYellow, selectViolet);

        int randomColor = random.nextInt(colors.size());

        Select select = new Select(selectMenu);
        select.selectByIndex(randomColor);

        Driver.getDriver().findElement(By.xpath("//div[@class = 'main-header']")).click();
        Thread.sleep(5000);
        Driver.closeDriver();


    }

    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get("https://demoqa.com/select-menu");
        SelectMenuPage selectMenuPage = new SelectMenuPage();
        selectMenuPage.selectColor();
    }

}
