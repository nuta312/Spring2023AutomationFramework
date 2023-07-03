package seleniun.demo.nambafd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class NambaFd {

    @Test
    public void findElement() {

        WebDriverManager.chromedriver().setup();// setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://nambafood.kg");
        String text = driver.findElement(By.xpath("/html/body/main/section[8]/div[1]/h3[2]")).getText();
        System.out.println(text);

    }
}