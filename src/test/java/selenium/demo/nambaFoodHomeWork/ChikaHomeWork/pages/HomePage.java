package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages;

import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    public WebElement createAccount;

    @FindBy(xpath = "(//li[@class='authorization-link']/a)[1]")
    public WebElement signIn;

    @FindBy(id = "ui-id-6")
    public WebElement gearSelect;

    @FindBy(xpath = "(//ul[@class='level0 submenu ui-menu ui-widget ui-widget-content ui-corner-all'])[3]/li[1]")
    public WebElement bags;




}
