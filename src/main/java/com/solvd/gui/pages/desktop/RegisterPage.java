package com.solvd.gui.pages.desktop;

import com.solvd.gui.components.navigation.NavigationBar;
import com.solvd.gui.components.navigation.NavigationBarBase;
import com.solvd.gui.pages.common.RegisterPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = RegisterPageBase.class)
public class RegisterPage extends RegisterPageBase {

    @FindBy(css = ".master-wrapper-page")
    private NavigationBar navigation;

    @FindBy(xpath = "//*[@class = 'page-title']/h1[text() = 'Register']")
    private ExtendedWebElement registerPageTitle;

    @FindBy(css = "#FirstName")
    private ExtendedWebElement firstNameTextField;

    @FindBy(css = "#LastName")
    private ExtendedWebElement lastNameTextField;

    @FindBy(css = "#Email")
    private ExtendedWebElement emailTextField;

    @FindBy(css = "#Password")
    private ExtendedWebElement passwordTextField;

    @FindBy(css = "#ConfirmPassword")
    private ExtendedWebElement confirmPasswordTextField;

    @FindBy(xpath = "//*[@name = 'DateOfBirthDay']")
    private ExtendedWebElement daySelectBox;

    @FindBy(xpath = "//*[@name = 'DateOfBirthMonth']")
    private ExtendedWebElement monthSelectBox;

    @FindBy(xpath = "//*[@name = 'DateOfBirthYear']")
    private ExtendedWebElement yearSelectBox;

    @FindBy(css = "#register-button")
    private ExtendedWebElement registerButton;

    @FindBy(xpath = "//*[@class = 'result'][text() = 'Your registration completed']")
    private ExtendedWebElement successfullyRegisterNotification;

    public RegisterPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(registerPageTitle);
    }

    @Override
    public NavigationBarBase getNavigation() {
        return navigation;
    }

    @Override
    public void typeFirstName(String firstName) {
        firstNameTextField.type(firstName);
    }

    @Override
    public void typeLastName(String lastName) {
        lastNameTextField.type(lastName);
    }

    @Override
    public void typeEmail(String email) {
        emailTextField.type(email);
    }

    @Override
    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    @Override
    public void typeConfirmPassword(String password) {
        confirmPasswordTextField.type(password);
    }

    @Override
    public void selectDay(int day) {
        daySelectBox.select(String.valueOf(day));
    }

    @Override
    public void selectMonth(String month) {
        monthSelectBox.select(month);
    }

    @Override
    public void selectYear(int year) {
        yearSelectBox.select(String.valueOf(year));
    }

    @Override
    public void clickRegisterBtn() {
        registerButton.click();
    }

    @Override
    public boolean isSuccessfullyRegisterNotificationPreset() {
        return successfullyRegisterNotification.isElementPresent();
    }
}