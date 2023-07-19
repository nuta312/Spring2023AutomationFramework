package selenium.demo.demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import ui.helper.AlertHelper;
import ui.helper.JavaScriptHelper;
import ui.helper.WindowHelper;
import ui.pages.PracticeForm;

import static ui.helper.DropDownHelper.selectRandom;


public class Demo1 extends BaseTest {

    @Test
    void textBoxTest() throws InterruptedException {

        driver.get("https://demoqa.com/automation-practice-form");
        PracticeForm practiceForm = new PracticeForm();
        practiceForm.practiceFormTest();

    }

    @Test
    void demo(){
        AlertHelper alertHelper = new AlertHelper(driver);
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();
        alertHelper.switchToAlert();
        alertHelper.sendKeysToAlert("Tilek Ka");
        alertHelper.acceptAlert();
    }

    @Test
    void demo1() {
        WindowHelper windowHelper = new WindowHelper(driver);
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        windowHelper.returnToParentTab();
        windowHelper.returnToParentTabAndCloseChildTab();
    }

    @Test
    void demoSelect(){
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        selectRandom(element);
    }

    @Test
    void demoJs(){
        driver.get("https://demoqa.com/text-box");
        JavaScriptHelper js = new JavaScriptHelper();
        WebElement element =
        driver.findElement(By.id("submit"));
        js.highlightElementAfterClick(element);
        js.triggerAlert("Completed succesfully!");
    }
}
