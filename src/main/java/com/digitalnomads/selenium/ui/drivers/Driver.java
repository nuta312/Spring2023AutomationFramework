package com.digitalnomads.selenium.ui.drivers;

import com.digitalnomads.selenium.ui.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private Driver() {
        // Singleton

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeWebDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }

        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }
}
