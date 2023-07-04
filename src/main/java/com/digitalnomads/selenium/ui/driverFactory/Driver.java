package com.digitalnomads.selenium.ui.driverFactory;

import com.digitalnomads.selenium.ui.configuration.ConfigReader;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){
        //Singleton pattern
    }
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver==null){
            switch(ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver =ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver =FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong driver name");

            }
        }
        return driver;
    }

    public static void closeDriver(){
        try{
            if(driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch(Exception e){
            System.out.println("error while closing driver");

        }
    }
}
