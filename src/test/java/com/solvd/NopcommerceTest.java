package com.solvd;

import com.solvd.gui.pages.common.*;
import com.solvd.gui_components.enums.Category;
import com.solvd.gui_components.enums.SubCategory;
import com.solvd.gui_components.enums.computerspec.Hdd;
import com.solvd.gui_components.enums.computerspec.Processor;
import com.solvd.gui_components.enums.computerspec.Ram;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NopcommerceTest extends AbstractNopcommerceTest {

    @Test
    @MethodOwner(owner = "Gigi")
    public void testRegister() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Nopcommerce home page is not opened");
        RegisterPageBase registerPage = homePage.getNavigation().clickRegisterLink();
        Assert.assertTrue(registerPage.isPageOpened(), "Register page is not opened");
        registerPage.typeFirstName(randomUtil.getRandomString(8));
        registerPage.typeLastName(randomUtil.getRandomString(8));
        registerPage.selectDay(randomUtil.getRandomDay());
        registerPage.selectMonth(randomUtil.getRandomMonth());
        registerPage.selectYear(randomUtil.getRandomYear());
        registerPage.typeEmail(randomUtil.getRandomEmail());
        String password = randomUtil.getRandomString(9);
        registerPage.typePassword(password);
        registerPage.typeConfirmPassword(password);
        registerPage.clickRegisterBtn();
        Assert.assertTrue(registerPage.isSuccessfullyRegisterNotificationPreset(), "Register is not completed");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testLogin() {
        String firstName = randomUtil.getRandomString(6);
        String lastName = randomUtil.getRandomString(6);
        String email = randomUtil.getRandomEmail();
        String password = randomUtil.getRandomString(8);
        HomePageBase homePage = authUtil.register(firstName, lastName, email, password);
        Assert.assertTrue(homePage.isPageOpened(), "Nopcommerce home page is not opened");
        LoginPageBase loginPage = homePage.getNavigation().clickLoginLink();
        Assert.assertTrue(loginPage.isPageOpened(), "Log in page is not opened");
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        homePage = loginPage.clickLoginButton();
        Assert.assertTrue(homePage.getNavigation().isMyAccountLinkPresent(), "User is not logged in");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testSearch() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Nopcommerce home page is not opened");
        String productName = "Digital Storm VANQUISH 3 Custom Performance PC";
        SearchResultsPageBase searchResultsPage = homePage.getNavigation().search(productName);
        Assert.assertTrue(searchResultsPage.isProductPresent(productName), "Product is not present on page");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testBuildComputerAddToCart() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Nopcommerce home page is not opened");
        CategoryPageBase computersCategoryPage = homePage.getNavigation().clickCategory(Category.COMPUTERS);
        Assert.assertTrue(computersCategoryPage.isPageOpened("Computers"), "Computer category page is not opened");
        CategoryPageBase desktopsCategoryPage = computersCategoryPage.clickSubcategory(SubCategory.DESKTOP);
        Assert.assertTrue(desktopsCategoryPage.isPageOpened("Desktops"), "Desktops category page is not opened");
        String product = "Build your own computer";
        ProductPageBase buildYourOwnComputerPage = desktopsCategoryPage.clickProduct(product);
        Assert.assertTrue(buildYourOwnComputerPage.isProductPageOpened(product), "Build your own computer page is not opened");
        buildYourOwnComputerPage.selectProcessor(Processor.PROCESSOR_INTEL_PENTIUM_DUAL_CORE_2_2_GHZ);
        buildYourOwnComputerPage.selectRam(Ram.RAM_2GB);
        buildYourOwnComputerPage.selectHDD(Hdd.HDD_320GB);
        buildYourOwnComputerPage.clickAddToCartButton();
        Assert.assertTrue(buildYourOwnComputerPage.isSuccessfullyAddToTheCartNotificationAppeared(), "Successfully Notification is not Appeared");
        ShoppingCartPageBase shoppingCartPage = buildYourOwnComputerPage.clickShoppingCartLink();
        Assert.assertTrue(shoppingCartPage.isPageOpened(), "Shopping cart page is not opened");
        Assert.assertTrue(shoppingCartPage.isProductPresent(product), "Product is not present in cart");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testAddToCart() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Nopcommerce home page is not opened");
        CategoryPageBase computersCategoryPage = homePage.getNavigation().clickCategory(Category.COMPUTERS);
        Assert.assertTrue(computersCategoryPage.isPageOpened("Computers"), "Computer category page is not opened");
        CategoryPageBase desktopsCategoryPage = computersCategoryPage.clickSubcategory(SubCategory.DESKTOP);
        Assert.assertTrue(desktopsCategoryPage.isPageOpened("Desktops"), "Desktops category page is not opened");
        String product = "Digital Storm VANQUISH 3 Custom Performance PC";
        ProductPageBase productPage = desktopsCategoryPage.clickProduct(product);
        Assert.assertTrue(productPage.isProductPageOpened(product), "Product page is not opened");
        productPage.clickAddToCartButton();
        Assert.assertTrue(productPage.isSuccessfullyAddToTheCartNotificationAppeared(), "Successfully Notification is not Appeared");
        ShoppingCartPageBase shoppingCartPage = productPage.clickShoppingCartLink();
        Assert.assertTrue(shoppingCartPage.isPageOpened(), "Shopping cart page is not opened");
        Assert.assertTrue(shoppingCartPage.isProductPresent(product), "Product is not present in cart");
    }
}