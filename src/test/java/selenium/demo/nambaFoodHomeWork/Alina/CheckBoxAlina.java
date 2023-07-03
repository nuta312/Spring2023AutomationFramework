package selenium.demo.nambaFoodHomeWork.Alina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.lesson2.BaseTest;

public class CheckBoxAlina extends BaseTest {
        @Test
        void checkBox() {

            driver.get("https://demoqa.com/text-box");
            WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
            checkBox.click();

            WebElement sign = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
            sign.click();

            WebElement desktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
            desktop.click();

            WebElement doc = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[3]"));
            doc.click();

            WebElement downloads=driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]"));
            downloads.click();
        }
        @Test
        void byXpath(){

            driver.get("https://www.instagram.com/");
            WebElement log=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
            log.sendKeys("user");

            WebElement psw=driver.findElement(By.xpath("//*[contains(@aria-label, 'Пароль')]"));
            psw.sendKeys("password");

            WebElement enter=driver.findElement(By.xpath("//div[text()='Войти']"));
            enter.click();

            WebElement try2=driver.findElement(By.xpath("//p[@id=\"slfErrorAlert\"]/.."));
            try2.click();

        }
    }

