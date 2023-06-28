package seleniun.demo.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFood {
    @Test
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup(); //setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();     // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //waiting the elements
        driver.get("https://nambafood.kg/food");

        WebElement foodtab = driver.findElement(By.cssSelector("//texterea[@class='gN089b']"));
        foodtab.click();
        WebElement clickweb = driver.findElement(By.xpath("//div[@class='yuRUbf']/a/h3"));
        clickweb.click();
        WebElement clickfood = driver.findElement(By.xpath("//section[@class='home--cat index--sex-cat"));
        clickfood.click();
        WebElement clicknationalfood = driver.findElement(By.xpath("//div[@class='cat-item--prev']/img"));
        clicknationalfood.click();
        WebElement clickin = driver.findElement(By.xpath("(//div[@class='cafe-item--thumb']img[2]"));
        clickin.click();
        WebElement chickenfood = driver.findElement(By.xpath("//div[@class='cafe-iten"));
        chickenfood.click();


    }
}