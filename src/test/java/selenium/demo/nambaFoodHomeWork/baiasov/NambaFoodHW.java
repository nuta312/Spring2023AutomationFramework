package selenium.demo.nambaFoodHomeWork.baiasov;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFoodHW {
    @Test
    public void textBoxTest() {

        WebDriverManager.edgedriver().setup(); //setup edge driver
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waiting elements in page

        driver.get("https://nambafood.kg/");

        WebElement eatBtn = driver.findElement(By.xpath("(//div[@class='home--cat-prev'])[1]"));
        eatBtn.click();

        WebElement allKitchensBtn = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/div/a[14]/div[2]"));
//        WebElementActions.scrollToElement(driver,allKitchensBtn);
        allKitchensBtn.click();

        WebElement indiPappaRotiBtn = driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div[2]/a[1]"));
        indiPappaRotiBtn.click();

        WebElement chanBaturaOrder = driver.findElement(By.xpath("//*[@id=\"199\"]/div/div[1]/div[1]/div[1]"));
        chanBaturaOrder.click();
        WebElement puriOrder = driver.findElement(By.xpath("//*[@id=\"199\"]/div/div[2]/div[1]/div[1]"));
        puriOrder.click();

//        WebElement alreadyChoosed = driver.findElement(By.xpath("//*[@id=\"cart\"]"));





        //Will continue after WORK (thanks for understanding)


    }
}

