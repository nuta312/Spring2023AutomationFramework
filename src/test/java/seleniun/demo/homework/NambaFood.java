package seleniun.demo.homework;

import com.digitalnomads.selenium.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFood {
    @Test
    public void textBoxTest() throws InterruptedException {


        WebDriverManager.chromedriver().setup(); //setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();     // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //waiting the elements
        driver.get("https://nambafood.kg/");

        WebElement menuBtn = driver.findElement(By.xpath("//a[@class='home--cat-item food']"));
        menuBtn.click();

        WebElement option = driver.findElement(By.linkText("ВСЕ ЗАВЕДЕНИЯ"));
        option.click();
        WebElement cuisine = driver.findElement(By.linkText("Национальная кухня"));
        cuisine.click();

        WebElement cafe = driver.findElement(By.linkText("Sun Club"));
        cafe.click();


        //WebElement foodBtn = driver.findElement(By.xpath("//div[@class='home--cat-prev']"));
     //   foodBtn.click();

        WebElement nationalfoodBtn = driver.findElement(By.xpath("//div[@class='cat-item--title']"));
        nationalfoodBtn.click();

        WebElement chinesCousineBtn = driver.findElement(By.xpath("//a[@class='active']"));
        chinesCousineBtn.click();

        WebElement lagmanCafeBtn = driver.findElement(By.xpath("(//div[@class='cafe--name'])[2]"));
        lagmanCafeBtn.click();

        WebElement orderBtn = driver.findElement(By.xpath("(//button[@type='submit'])[7]"));
        orderBtn.click();

        Thread.sleep(4000);

        WebElement busketBtn = driver.findElement(By.xpath("//div[@class='btn menu-link']"));
        busketBtn.click();

        WebElement orderFinishBtn = driver.findElement(By.xpath("button[@class='order--btn order--access']"));
        orderFinishBtn.click();

        WebElement userName = driver.findElement(By.xpath(("//input[@type='text'])[6]")));
        userName.sendKeys("Jan");

        WebElement adress = driver.findElement(By.xpath(("//input[@type='text'])[7]")));
        adress.sendKeys("Ankara 7");

        WebElement house = driver.findElement(By.xpath(("//input[@type='text'])[8]")));
        house.sendKeys("12");

        WebElement phone = driver.findElement(By.xpath(("//input[@type='text'])[9]")));
        phone.sendKeys("996704105600");

        WebElement addInfo = driver.findElement(By.xpath(("//textarea[@id='food_order_additional_info']")));
        addInfo.sendKeys("Перед заходом с танцуй");

        WebElement pay = driver.findElement(By.xpath("//input[@class='recall-number']"));
        WebElementActions.scrollToElement(driver, pay);
        pay.sendKeys("630");

        WebElement finishOrd = driver.findElement(By.xpath("(//button[@class='order--btn order--access'])[2]"));
        finishOrd.click();

       // WebElement result = driver.findElement(By.xpath());















    }
}