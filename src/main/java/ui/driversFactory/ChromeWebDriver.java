package ui.driversFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ui.config.ConfigReader;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadWebDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        if(Boolean.parseBoolean(ConfigReader.getPropertyOf("headless"))){
            options.addArguments("--headless");
        }
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
