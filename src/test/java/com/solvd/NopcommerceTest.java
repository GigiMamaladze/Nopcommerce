package com.solvd;

import com.solvd.gui.pages.common.HomePageBase;
import com.solvd.gui.pages.common.RegisterPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NopcommerceTest extends AbstractNopcommerceTest {

    @Test
    public void testRegister() {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        homePageBase.open();
        Assert.assertTrue(homePageBase.isPageOpened(), "Nopcommerce home page is not opened");
        RegisterPageBase registerPageBase = homePageBase.getTopNavigation().clickRegisterLabel();
        Assert.assertTrue(registerPageBase.isPageOpened(), "Register page is not opened");
        registerPageBase.typeFirstName(randomUtil.getRandomString(8));
        registerPageBase.typeLastName(randomUtil.getRandomString(8));
        registerPageBase.selectDay(randomUtil.getRandomDay());
        registerPageBase.selectMonth(randomUtil.getRandomMonth());
        registerPageBase.selectYear(randomUtil.getRandomYear());
        registerPageBase.typeEmail(randomUtil.getRandomEmail());
        String password = randomUtil.getRandomString(9);
        registerPageBase.typePassword(password);
        registerPageBase.typeConfirmPassword(password);
        registerPageBase.clickRegisterBtn();
        Assert.assertTrue(registerPageBase.isSuccessfullyMessagePreset(), "Register is not completed");
    }
}
