package com.solvd;

import com.solvd.gui.pages.common.*;
import com.solvd.gui_components.enums.Category;
import com.solvd.gui_components.enums.ComputerSpec;
import com.solvd.gui_components.enums.SubCategory;
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
        RegisterPageBase registerPage = homePage.getNavigation().clickRegisterLabel();
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
        Assert.assertTrue(registerPage.isSuccessfullyMessagePreset(), "Register is not completed");
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
        LoginPageBase loginPage = homePage.getNavigation().clickLoginLabel();
        Assert.assertTrue(loginPage.isPageOpened(), "Log in page is not opened");
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        homePage = loginPage.clickLoginBtn();
        Assert.assertTrue(homePage.isUserLoggedIn(), "User is not logged in");
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
        BuildYourOwnComputerPageBase buildYourOwnComputerPage = desktopsCategoryPage.clickBuildYourOwnComputerLabel();
        Assert.assertTrue(buildYourOwnComputerPage.isPageOpened(), "Build your own computer page is not opened");
        buildYourOwnComputerPage.selectProcessor(ComputerSpec.PROCESSOR_INTEL_PENTIUM_DUAL_CORE_2_2_GHZ);
        buildYourOwnComputerPage.selectRam(ComputerSpec.RAM_2GB);
        buildYourOwnComputerPage.selectHDD(ComputerSpec.HDD_320GB);
        buildYourOwnComputerPage.clickAddToCart();
        Assert.assertTrue(buildYourOwnComputerPage.isSuccessfullyNotificationAppeared(), "Successfully Notification is not Appeared");
        ShoppingCartPageBase shoppingCartPage = buildYourOwnComputerPage.clickShoppingCartLink();
        Assert.assertTrue(shoppingCartPage.isPageOpened(), "Shopping cart page is not opened");
        Assert.assertTrue(shoppingCartPage.isProductPresent("Build your own computer"), "Product is not present in cart");
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
        productPage.clickAddToCart();
        Assert.assertTrue(productPage.isSuccessfullyNotificationAppeared(), "Successfully Notification is not Appeared");
        ShoppingCartPageBase shoppingCartPage = productPage.clickShoppingCartLink();
        Assert.assertTrue(shoppingCartPage.isPageOpened(), "Shopping cart page is not opened");
        Assert.assertTrue(shoppingCartPage.isProductPresent(product), "Product is not present in cart");
    }
}