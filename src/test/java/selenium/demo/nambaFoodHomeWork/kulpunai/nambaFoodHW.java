package selenium.demo.nambaFoodHomeWork.kulpunai;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class nambaFoodHW {
    @Test
    public void nambaFoodTest() {


        WebDriverManager.chromedriver().setup();// setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("");
    }
}
