package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.testBeta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.helper.HelperStreamForWebElement;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.userData.FakerData;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.userData.UserWebTables;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.webtables.pageses.WebTabelsPage;

import java.util.HashSet;
import java.util.List;

public class Tester extends BaseTest {
    @Test
    void testdemo() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        WebTabelsPage webTabelsPage = new WebTabelsPage();
        UserWebTables user1 = FakerData.genericuser();
        UserWebTables user2 = FakerData.genericuser();
        webTabelsPage.writeAll(user1);
        webTabelsPage.writeAll(user2);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div/div[1]"));
        List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div/div[3]"));
//        HelperStreamForWebElement.filterByAge(list, list1, 30);
        List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div"));
        System.out.println(HelperStreamForWebElement.checkValueByText(list2, "Cierra"));


        Thread.sleep(5000);

    }

}
