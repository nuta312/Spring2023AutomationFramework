package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
    public void  getSelectRandom(WebElement element) throws InterruptedException {
        int num = (int)(Math.random()*10);
        Select select = new Select(element);
        select.selectByIndex(num);
        Thread.sleep(2000);
    }
}
