package selenium.demo.nambaFoodHomeWork.Alina;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragAndRes {

    @Test
    void drop() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/droppable");

        WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        Actions action = new Actions(driver);
        action.dragAndDrop(drag, drop).perform();
        Thread.sleep(10);
        WebElement accept = driver.findElement(By.xpath("//a[text()='Accept']"));
        accept.click();

        WebElement box = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]"));
        WebElement acceptable = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]"));
        Actions accept1 = new Actions(driver);
        accept1.dragAndDrop(acceptable, box).perform();
        Thread.sleep(10);
        driver.close();
        driver.quit();
    }

    @Test
    void resizable() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/resizable");

        WebElement size = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
        Actions act = new Actions(driver);

        act.clickAndHold(size).moveByOffset(400, 100).release().perform();
        driver.quit();
    }
}