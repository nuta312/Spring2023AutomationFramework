//package selenium.demo.nambaFoodHomeWork;
//
//import com.digitalnomads.selenium.WebElementActions;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class DemoNambaByTilek {
//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup(); // setup chrome driver
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize(); // to maximize the window
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // waiting the elements in page
//        driver.get("https://nambafood.kg/");
//
//        WebElement foodLink = driver.findElement(By.xpath("//a[contains(@class, 'menu-link') and contains(@href, '/food')]"));
//        foodLink.click();
//
//        WebElement indianCuisineLink = driver.findElement(By.xpath("//a[contains(@class, 'cat-item') and @href='/cafe/indijskaya-kuhnya']"));
//        WebElementActions.scrollToElement(driver, indianCuisineLink);
//        indianCuisineLink.click();
//
//        WebElement cafeSalamNamaste = driver.findElement(By.xpath("//div[@class='cafe--name' and normalize-space()='Salaam Namaste']"));
//        cafeSalamNamaste.click();
//
//        WebElement arrowElement = driver.findElement(By.xpath("//div[@class='owl-next']"));
//        WebElementActions.scrollToElement(driver, arrowElement);
//        arrowElement.click();
//
//        WebElement cardItemAction = driver.findElement(By.xpath("//div[@class='card--item-action' and @data-item-name='Суп Дал']"));
//        WebElement orderButton = cardItemAction.findElement(By.xpath(".//button[@class='status active bay_item' and contains(text(),'Заказать')]"));
//        orderButton.click();
//
//
//
//
//
//    }
//}
