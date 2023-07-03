package selenium.demo.nambaFoodHomeWork.baiasov.lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {
    public WebDriver driver;
    @BeforeClass
    public void setUpBrowser(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waiting elements in page
    }

//    @AfterClass
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }
}
