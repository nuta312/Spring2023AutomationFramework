package codingbat.kamiii;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
public class Demo1 extends BaseTest {
    @Test
    public void textBoxTest() {
        driver.get("https://demoqa.com/text-box");
        elementActions.writeText(textbox.userFullName, "James Bond")
                .writeText(textbox.userEmail, "james@bond.com")
                .writeText(textbox.currentAddress, "WallStreet 123")
                .writeText(textbox.permanentAddress, "Some address");
    }
}