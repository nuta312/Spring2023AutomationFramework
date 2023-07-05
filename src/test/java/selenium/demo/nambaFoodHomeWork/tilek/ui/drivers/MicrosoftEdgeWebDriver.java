package selenium.demo.nambaFoodHomeWork.tilek.ui.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class MicrosoftEdgeWebDriver {

    public static WebDriver loadMicrosoftEdgeWebDriver(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-extensions");

        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }
}
