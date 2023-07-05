package com.digitalnomads.selenium.ui.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class OperaWebDriver {

    public static WebDriver loadOperaWebDriver(){
        WebDriverManager.edgedriver().setup();
        EdgeDriver options = new EdgeDriver();
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }


}
