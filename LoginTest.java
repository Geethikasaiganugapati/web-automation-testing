package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import utils.ScreenshotUtil;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);

        String actualTitle = inventoryPage.getPageTitle();

        Assert.assertEquals(actualTitle, "Products");

        ScreenshotUtil.captureScreenshot(driver, "ValidLogin");
    }
}
