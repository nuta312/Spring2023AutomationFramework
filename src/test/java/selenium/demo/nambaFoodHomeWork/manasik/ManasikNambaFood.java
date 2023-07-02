package selenium.demo.nambaFoodHomeWork.manasik;

import com.digitalnomads.WebElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ManasikNambaFood {
    @Test
    public void textBoxTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driv = new ChromeDriver();
        driv.manage().window().maximize();
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driv.get("https://nambafood.kg/?gclid=EAIaIQobChMI1set8uvn_wIVhADmCh1-SQzSEAAYASAAEgJcEPD_BwE");

        WebElement euroAidar = driv.findElement(By.xpath("(//div[@class=\"home--cat-prev\"])[5]"));
       // WebElementActions.scrollToElement(driv,euroAidar);
        euroAidar.click();

        WebElement aidarunadodildo = driv.findElement(By.xpath("//div[@class=\"order--btn order--access\"]"));
        aidarunadodildo.click();

        WebElement vhodshop = driv.findElement(By.xpath("(//div[@class=\"home--cat-prev\"])[1]"));
        WebElementActions.scrollToElement(driv,vhodshop);
        vhodshop.click();


        WebElement analAidar = driv.findElement(By.xpath("(//button[@class=\"status active bay_item\"])[2]"));
        WebElementActions.scrollToElement(driv, driv.findElement(By.xpath("//div[@class=\"mobile--new--title\"]")));
        analAidar.click();
        WebElement corzina = driv.findElement(By.xpath("//a[@onclick=\"ga('send', 'pageview', '/basket')\"]"));
        corzina.click();

        WebElement oformzakaz = driv.findElement(By.xpath("//button[@class=\"order--btn order--access\"]"));
        oformzakaz.click();

        WebElement name = driv.findElement(By.xpath("//input[@id=\"food_order_client_name\"]"));  //input[@id="food_order_client_name"]
        name.sendKeys("Аскеев Айдар ");

        WebElement adress = driv.findElement(By.id("food_order_address"));
        adress.sendKeys("ЖК Молодёжный квартал дом 104/4 ");

        WebElement nomkv = driv.findElement(By.id("food_order_door_code"));
        nomkv.sendKeys("дом 104/4 ,подъезд-1 ,кв-1");

        WebElement nomer = driv.findElement(By.xpath("//input[@id=\"food_order_phone\"]"));
        nomer.sendKeys("0776399990");

        WebElement sdacha = driv.findElement(By.xpath("//input[@id=\"food_order_money_change\"]"));
        sdacha.sendKeys("2500");


        WebElement money = driv.findElement(By.xpath("//button[@id=\"payment_cash\"]"));
        WebElementActions.scrollToElement(driv, driv.findElement(By.xpath("//input[@id=\"food_order_money_change\"]")));
        money.click();









    }
}
