package com.solvd.gui_components.utils;

import com.solvd.gui.pages.common.HomePageBase;
import com.solvd.gui.pages.common.RegisterPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;

public class AuthUtil implements IAbstractTest {

    public HomePageBase register(String firstName, String lastName, String email, String password) {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Nopcommerce home page is not opened");
        RegisterPageBase registerPage = homePage.getNavigation().clickRegisterLabel();
        Assert.assertTrue(registerPage.isPageOpened(), "Register page is not opened");
        registerPage.typeFirstName(firstName);
        registerPage.typeLastName(lastName);
        registerPage.typeEmail(email);
        registerPage.typePassword(password);
        registerPage.typeConfirmPassword(password);
        registerPage.clickRegisterBtn();
        Assert.assertTrue(registerPage.isSuccessfullyMessagePreset(), "Register is not completed");
        homePage = registerPage.getNavigation().clickHeaderLogo();
        return homePage;
    }
}