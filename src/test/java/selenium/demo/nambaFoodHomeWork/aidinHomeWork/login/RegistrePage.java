package selenium.demo.nambaFoodHomeWork.aidinHomeWork.login;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrePage {
    WebDriver driver = Driver.getDriver();
    ElementActions elementActions = new ElementActions();
    public RegistrePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    public User createNewUser(User user) throws InterruptedException {
        driver.navigate().to("https://demoqa.com/login");
        driver.findElement(By.id("newUser")).click();
        elementActions.writeText(firstname,user.getUserFirstName()).writeText(lastName,user.getUserLastName())
                .writeText(userName,user.getUserFullName()).writeText(password,user.getPassword());
        Thread.sleep(20000);
        elementActions.clickTheButton(driver.findElement(By.id("register")));
        Thread.sleep(5000);
        elementActions.clickTheButton(driver.findElement(By.id("gotologin")));
        return user;
    }
}
