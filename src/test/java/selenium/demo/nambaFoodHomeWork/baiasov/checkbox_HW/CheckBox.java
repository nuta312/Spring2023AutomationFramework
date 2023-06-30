package selenium.demo.nambaFoodHomeWork.baiasov.checkbox_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class CheckBox extends Abstract {

    @Test

    void checkboxHome(){
      driver.get("https://demoqa.com/checkbox");
        WebElement allclickBtn = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
        allclickBtn.click();
//      WebElement homeBtn = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]"));
//      homeBtn.click();
//      String name = String.valueOf(driver.findElement(By.xpath("//*[@id=\"result\"]/span[2]")));
//      System.out.println(name);

        WebElement desktopBtn = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
        desktopBtn.click();

        WebElement desktopName =driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
        desktopName.equals("Desktop");
        WebElement resdesktopName = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
        Assert.assertEquals(resdesktopName.getText(), "Desktop");


    }

    @Test
    void allclickBtn(){

    }

}
