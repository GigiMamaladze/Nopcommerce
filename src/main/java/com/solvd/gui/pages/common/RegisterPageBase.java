package com.solvd.gui.pages.common;

import com.solvd.gui.components.navigation.NavigationBarBase;
import org.openqa.selenium.WebDriver;

public abstract class RegisterPageBase extends AbstractNopcommercePage {

    public RegisterPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract NavigationBarBase getNavigation();

    public abstract void typeFirstName(String firstName);

    public abstract void typeLastName(String lastName);

    public abstract void typeEmail(String email);

    public abstract void typePassword(String password);

    public abstract void typeConfirmPassword(String password);

    public abstract void selectDay(int day);

    public abstract void selectMonth(String month);

    public abstract void selectYear(int year);

    public abstract void clickRegisterBtn();

    public abstract boolean isSuccessfullyRegisterNotificationPreset();
}