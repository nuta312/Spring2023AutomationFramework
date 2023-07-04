package com.digitalnomads.driverFactory;

import com.digitalnomads.selenium.ui.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provide wrong Driver  name");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Error while closing driver");
        }

    }

}
