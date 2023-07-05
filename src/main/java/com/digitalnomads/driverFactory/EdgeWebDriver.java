package com.digitalnomads.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeWebDriver {
    public static WebDriver loadEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--disable-extensions");

        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
