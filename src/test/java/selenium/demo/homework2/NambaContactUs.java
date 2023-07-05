package selenium.demo.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NambaContactUs extends BaseTestHome {
    @Test
    public void contactUsTest(){
        driver.get("https://nambafood.kg/");

        WebElement more = driver.findElement(By.xpath("//a [@class = 'menu-link parent']"));
        more.click();

        WebElement contacts = driver.findElement(By.linkText("Контакты"));
        contacts.click();


        String contactUs= driver.findElement(By.xpath("/html[1]/body/main/section[2]/div[3]")).getText();
        System.out.println(contactUs);



    }
}
