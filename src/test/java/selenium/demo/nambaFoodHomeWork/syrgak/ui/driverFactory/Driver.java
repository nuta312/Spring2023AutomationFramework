package selenium.demo.nambaFoodHomeWork.syrgak.ui.driverFactory;

import org.openqa.selenium.WebDriver;
import selenium.demo.nambaFoodHomeWork.syrgak.ui.config.ConfigReader;

public class Driver {
    private Driver() {
        //Singleton pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver() throws IllegalAccessException {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toUpperCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
//                case "firefox":
//                    driver.FireFoxWebDriver.loadFireFoxWebDriver();
//                    break;
//                case "edge":
//                    driver.EdgeWebDriver.loadEdgeDriver();
//                    break;
                default:
                    throw new IllegalAccessException("You provided wrong Driver name");
            }
        }return driver;
    }
    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }
}
