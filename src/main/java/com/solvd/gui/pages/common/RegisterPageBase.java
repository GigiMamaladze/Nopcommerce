package com.solvd.gui.pages.common;

import com.solvd.gui.components.navigation.NavigationBar;
import com.solvd.gui.components.navigation.NavigationBarBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class RegisterPageBase extends AbstractNopcommercePage {

    private NavigationBar navigation;

    private ExtendedWebElement registerPageTitle;

    private ExtendedWebElement firstNameTextField;

    private ExtendedWebElement lastNameTextField;

    private ExtendedWebElement emailTextField;

    private ExtendedWebElement passwordTextField;

    private ExtendedWebElement confirmPasswordTextField;

    private ExtendedWebElement daySelectBox;

    private ExtendedWebElement monthSelectBox;

    private ExtendedWebElement yearSelectBox;

    private ExtendedWebElement registerButton;

    private ExtendedWebElement successfullyRegisterNotification;

    public RegisterPageBase(WebDriver driver) {
        super(driver);
    }

    public NavigationBarBase getNavigation() {
        return navigation;
    }

    public void typeFirstName(String firstName) {
        firstNameTextField.type(firstName);
    }

    public void typeLastName(String lastName) {
        lastNameTextField.type(lastName);
    }

    public void typeEmail(String email) {
        emailTextField.type(email);
    }

    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    public void typeConfirmPassword(String password) {
        confirmPasswordTextField.type(password);
    }

    public void selectDay(int day) {
        daySelectBox.select(String.valueOf(day));
    }

    public void selectMonth(String month) {
        monthSelectBox.select(month);
    }

    public void selectYear(int year) {
        yearSelectBox.select(String.valueOf(year));
    }

    public void clickRegisterBtn() {
        registerButton.click();
    }

    public boolean isSuccessfullyRegisterNotificationPreset() {
        return successfullyRegisterNotification.isElementPresent();
    }
}