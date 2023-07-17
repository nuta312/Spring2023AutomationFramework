package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.pages;

import com.digitalnomads.selenium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BagsGearPage extends BasePage {
    @FindBy (xpath = "//div[@class='filter-options-title']")
    public List<WebElement> style;

    @FindBy (xpath = "//div[@class='filter-options-content']//li/a")
    public List<WebElement> allBtnInShoppingOptions;

    @FindBy (xpath = "//div[@class='filter-options-content']//li/a/span")
    public List<WebElement> allBtnInShoppingOptionsNumbers;

    @FindBy (xpath = "//div[@class='product details product-item-details']")
    public List<WebElement> allBags;

    @FindBy (xpath = "//button[@class='action tocart primary']")
    public List<WebElement> buttonAdd;

    @FindBy (xpath = "//a[@class='action showcart']")
    public WebElement basket;

    @FindBy (xpath = "//strong[@class='product-item-name']")
    public List<WebElement> addedList;

    @FindBy (xpath = "//span[@class='minicart-price']/span")
    public List<WebElement> price;

}
