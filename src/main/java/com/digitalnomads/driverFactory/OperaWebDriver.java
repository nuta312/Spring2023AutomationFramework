package com.digitalnomads.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class OperaWebDriver {
    public static WebDriver loadOpera(){
        WebDriverManager.operadriver().setup();

        WebDriver driver = (WebDriver) new OperaDriverManager();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;

    }
}
