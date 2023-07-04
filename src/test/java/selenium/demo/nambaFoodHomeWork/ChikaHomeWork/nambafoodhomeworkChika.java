package selenium.demo.nambaFoodHomeWork.ChikaHomeWork;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class nambafoodhomeworkChika {
    @Test
    public void testWeb() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.google.com");
        WebElement writever = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        writever.click();
        writever.sendKeys("namba food");
        WebElement findWeb = driver.findElement(By.xpath("//input[@class='gNO89b']"));
        findWeb.click();
        WebElement clickWeb = driver.findElement(By.xpath("//div[@class='yuRUbf']/a/h3"));
        clickWeb.click();
        WebElement clickFood = driver.findElement(By.xpath("//section[@class='home--cat index--sex-cat']/a"));
        clickFood.click();
        WebElement clickNationalfood = driver.findElement(By.xpath("//div[@class='cat-item--prev']/img"));
        clickNationalfood.click();
        WebElement clickin = driver.findElement(By.xpath("(//div[@class='cafe-item--thumb']/img)[2]"));
        clickin.click();
        WebElement chikenfood = driver.findElement(By.xpath("//div[@class='card--item-action']/button"));
        chikenfood.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement basket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cart']/a")));
        basket.click();
        WebElement order = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
        order.click();
        WebElement username = driver.findElement(By.xpath("//div[@class='input--wrap']/input"));
        username.sendKeys("Chyngyz");
        WebElement adress = driver.findElement(By.xpath("(//div[@class='input--wrap'])[2]/input[1]"));
        adress.sendKeys("Абдулхакимова 37");
        WebElement store = driver.findElement(By.xpath("//div[@class='order--form-item order--line-title'][2]/input"));
        store.sendKeys("12 этаж");
        WebElement addinfo = driver.findElement(By.xpath("//div[@class='order--form-item order--line-title'][4]//div[@class='input--wrap']/textarea"));
        addinfo.sendKeys("Если что дома есть злая собака будьте осторожны");
        WebElement cashPay = driver.findElement(By.xpath("(//div[@class='input--wrap'])[5]/input"));
        WebElementActions.scrollToElement(driver, cashPay);
        cashPay.sendKeys("2000");
        WebElement finalorder = driver.findElement(By.xpath("(//div[@class='order--actions'])[3]/button"));
        finalorder.click();
        WebElement result = driver.findElement(By.xpath("//div[@class='sum-item--count price-total']//span"));
        Assert.assertTrue(result.getText().equals("520"));

    }
}
