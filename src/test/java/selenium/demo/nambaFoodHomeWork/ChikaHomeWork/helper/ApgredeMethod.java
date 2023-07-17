package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.helper;


import com.digitalnomads.selenium.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ApgredeMethod {
    public ApgredeMethod waitelement(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public  ApgredeMethod waitAndMoveClick(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        waitelement(element);
        actions.moveToElement(element).click().perform();
        return this;
    }
    public  ApgredeMethod moveElementForSelect(WebElement element, WebElement element2) {
        waitelement(element);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).moveToElement(element2).click().perform();
        return this;
    }

    public  ApgredeMethod writeText(WebElement element, String txt) {
        waitelement(element);
        element.sendKeys(txt);
        return this;
    }
    public  WebElement getElementFromList(List<WebElement> element, int num) {

        return element.get(num);
    }
    public  ApgredeMethod moveElementForSelectANdClickAll(List<WebElement> element, List<WebElement> element2) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        for (int i =0;i<element.size();i++) {
            if(i!=2) {
                actions.moveToElement(element.get(i)).moveToElement(element2.get(i)).click().perform();
                Thread.sleep(2000);
            }
        }
        return this;
    }
}
