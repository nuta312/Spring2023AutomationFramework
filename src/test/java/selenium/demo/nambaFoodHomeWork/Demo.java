package selenium.demo.nambaFoodHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo {
    @Test
    public void TestNambaFood(){
        WebDriverManager.chromedriver().setup(); // setup chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // to maximize the window
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // waiting the elements in page
        driver.get("https://nambafood.kg/food");
 WebElement websitefastfood = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/div/a[6]/div[1]"));
websitefastfood.click();
WebElement entertocafe = driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div[2]/a[2]/div[2]/div[1]/div[1]"));
entertocafe.click();
WebElement ordershaurma = driver.findElement(By.xpath("//*[@id=\"4117\"]/div/div[1]/div[2]/button"));
        ordershaurma.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement entertoorders = driver.findElement(By.xpath("//*[@id=\"cart\"]/a"));
        entertoorders.click();
        WebElement submitbtntoorder = driver.findElement(By.xpath("/html/body/main/section/div[1]/div[5]/div[11]/a/button"));
        submitbtntoorder.click();
        WebElement clientname = driver.findElement(By.xpath("//*[@id=\"food_order_client_name\"]"));
        clientname.sendKeys("Nariman Idyrov");
        WebElement clientaddress = driver.findElement(By.xpath("//*[@id=\"food_order_address\"]"));
        clientaddress.sendKeys("41Home Slavyanskaya street");
        WebElement clientphonenumber = driver.findElement(By.xpath("//*[@id=\"food_order_phone\"]"));
        clientphonenumber.sendKeys("0444666999");
        WebElement comments = driver.findElement(By.xpath("//*[@id=\"food_order_additional_info\"]"));
        comments.sendKeys("I need shaurma very hot, with chilly paper");
        WebElement moneychange = driver.findElement(By.xpath("//*[@id=\"food_order_money_change\"]"));
        moneychange.sendKeys("5000");
        WebElement payment = driver.findElement(By.xpath("//*[@id=\"payment_cash\"]"));
        payment.click();

        WebElement resultclientname = driver.findElement(By.xpath("//*[@id=\"order_check_info\"]/div[2]/div[4]/div[1]/span[2]"));
        Assert.assertEquals(resultclientname.getText(),"Nariman Idyrov");

        WebElement resultclientaddress = driver.findElement(By.xpath("//*[@id=\"order_check_info\"]/div[2]/div[4]/div[2]/span[2]"));
        Assert.assertEquals(resultclientaddress.getText(),"41Home Slavyanskaya street");

    }

}
