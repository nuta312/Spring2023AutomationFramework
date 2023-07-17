package selenium.demo.nambaFoodHomeWork.ChikaHomeWork.testHomework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.faker.FakerData;
import selenium.demo.nambaFoodHomeWork.ChikaHomeWork.user.User;


public class TestWebSite extends BaseTest {

    @Test
    void demotest() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        apgredeMethod.waitelement(homePage.createAccount);
        homePage.createAccount.click();
        User user = FakerData.greatNewUser();
        newAccauntPage.writeAll(user);
        Thread.sleep(3000);
        myAccountPage.testSavedNewUsser(user);
        Thread.sleep(4000);
    }

    @DataProvider
    public Object[][] dataCost() {
        return new Object[][]{
                {"Crown Summit Backpack", "$38.00", 0},
                {"Endeavor Daytrip Backpack", "$33.00", 1},
                {"Driven Backpack", "$36.00", 2}
        };
    }

    @Test()
    void testBagsPage() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        apgredeMethod.moveElementForSelect(homePage.gearSelect, homePage.bags)
                .waitAndMoveClick(bagsGearPage.style.get(0))
                .waitAndMoveClick(apgredeMethod.getElementFromList(bagsGearPage.allBtnInShoppingOptions, 0))
                .moveElementForSelectANdClickAll(bagsGearPage.allBags, bagsGearPage.buttonAdd).waitAndMoveClick(bagsGearPage.basket);
        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = "testBagsPage", dataProvider = "dataCost")
    public void testBasket(String names, String price, int v2) throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/gear/bags.html?style_bags=24");
        apgredeMethod.waitAndMoveClick(bagsGearPage.basket);
        Assert.assertEquals(bagsGearPage.addedList.get(v2).getText(), names);
        Assert.assertEquals(bagsGearPage.price.get(v2).getText(), price);
        Thread.sleep(4000);

    }

    @DataProvider(name = "test")
    public Object[][] testData() {
        return new Object[][]{
                {FakerData.greatNewUser().getUserEmail(), FakerData.greatNewUser().getUserPassword()},
                {FakerData.greatNewUser().getUserEmail(), FakerData.greatNewUser().getUserPassword()},
                {FakerData.greatNewUser().getUserEmail(), FakerData.greatNewUser().getUserPassword()},
                {FakerData.greatNewUser().getUserEmail(), FakerData.greatNewUser().getUserPassword()},
                {FakerData.greatNewUser().getUserEmail(), FakerData.greatNewUser().getUserPassword()},
        };
    }

    @DataProvider(name = "test2")
    public Object[][] testValidData() {
        return new Object[][]{
                {"chikatatda@gmail.com", "1783chika"},
        };
    }

    @Test(dataProvider = "test")
    public void testSignIn(String name1, String name2) throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        apgredeMethod.writeText(signInPage.email, name1).writeText(signInPage.pasword, name2);
        signInPage.submit.click();
        Thread.sleep(3000);
        Assert.assertEquals(signInPage.errorMessage.getText(), "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");

    }
}
