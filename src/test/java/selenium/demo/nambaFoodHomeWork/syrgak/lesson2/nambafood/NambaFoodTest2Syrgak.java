package selenium.demo.nambaFoodHomeWork.syrgak.lesson2.nambafood;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFoodTest2Syrgak {
    @Test
    public void testWeb(){
        WebDriverManager.chromedriver().setup();// setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://nambafood.kg");
        String fullNameText = driver.findElement(By.xpath("/html/body/main/section[8]/div[1]/h3[2]")).getText();
        System.out.println(fullNameText);
    }
}
