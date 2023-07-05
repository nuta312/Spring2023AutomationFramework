package com.digitalnomads.selenium.ui.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class SafariWebDriver {
    public static WebDriver loadSafariWebDriver(){
        WebDriverManager.safaridriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-extensions");

        WebDriver driver=new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
