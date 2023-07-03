package selenium.demo.nambaFoodHomeWork.baiasov.lesson2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.nambaFoodHomeWork.baiasov.lesson3.BaseTest;

public class XpathPractice extends BaseTest {

    @Test
    void xpathDemo1(){
        driver.get("https://demoqa.com/text-box");
        String name = driver.findElement(By.xpath("/html[1]/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[1]")).getText();
        System.out.println(name);
    }
    @Test
    void xpanthFindByTestTest(){
        driver.get("https://demoqa.com/text-box");
        String name = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
        System.out.println(name);
    }
    @Test
    void xpanthFindByContaisTextTest(){
        driver.get("https://demoqa.com/text-box");
        String name = driver.findElement(By.xpath("//label[contains(text(),'Current')]")).getText();
        System.out.println(name);
    }
    @Test
    void xpanthFindByNormalizeTest(){
        driver.get("https://nambafood.kg/");
        String name = driver.findElement(By.xpath("//div[normalize-space()='Как работает NambaFood']")).getText();
        System.out.println(name);
    }
    @Test
    void xpanthSwithctoParentTest(){
        driver.get("https://demoqa.com/text-box");
        String name = driver.findElement(By.xpath("//label[@id='userName-label']/..")).getText();
        System.out.println(name);
    }

    @Test
    void xpanthSwithctoFollowingSibling(){
        driver.get("https://demoqa.com/text-box");
        String name = driver.findElement(By.xpath("//nav[@class='navbar navbar-dark bg-dark left-menu-nav-bar']/follow")).getText();

    }
    @Test
    void xpanthUsingIndexTest(){
        driver.get("https://demoqa.com/text-box");
        String name = driver.findElement(By.xpath("(//label [@class='form-label'])[3]")).getText();

    }


}
