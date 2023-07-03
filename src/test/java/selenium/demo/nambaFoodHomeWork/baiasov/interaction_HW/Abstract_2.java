package selenium.demo.nambaFoodHomeWork.baiasov.interaction_HW;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Abstract_2 {
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
