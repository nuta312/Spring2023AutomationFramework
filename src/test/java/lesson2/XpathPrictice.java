package lesson2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathPrictice extends BaseTest{
    @Test
    void xpathDemo(){
        driver.get("https://demoqa.com/text-box");
        String fullName = driver.findElement(By.xpath("/html[1]/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[1]")).getText();
        System.out.println(fullName);
        }
        @Test
    void xpathfindByTextTest() {
            driver.get("https://demoqa.com/text-box");
            String perddress = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
            System.out.println(perddress);
        }
            @Test
            void xpathfindBycontains()
        {
                driver.get("https://demoqa.com/text-box");
                String currentaddress = driver.findElement(By.xpath("//label[contains(text(), 'Current')]")).getText();
                System.out.println(currentaddress);
            }
    @Test
    void xpathfindBynormilize()
    {
        driver.get("https://nambafood.kg/");
        String normtext = driver.findElement(By.xpath("//div[normalize-space()='Как работает NambaFood']")).getText();
        System.out.println(normtext);
    }
//label[@id='userName-label']/..
@Test
    void xpathtoparent()
{
    driver.get("https://demoqa.com/text-box");
    String parentteg = driver.findElement(By.xpath("//label[@id='userName-label']/..")).getText();
    System.out.println(parentteg);
}
@Test
void xpathtonexttag()
{
    driver.get("https://demoqa.com/text-box");
    String nexttag1 = driver.findElement(By.xpath("//div[@id='userName-wrapper']/div[1]/following-sibling::div")).getText();
    System.out.println(nexttag1);
}



}

