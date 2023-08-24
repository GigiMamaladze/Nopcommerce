package com.solvd.gui.pages.android;

import com.solvd.gui.components.navigation.MobileNavigationBar;
import com.solvd.gui.components.navigation.NavigationBarBase;
import com.solvd.gui.pages.common.RegisterPageBase;
import com.solvd.gui_components.utils.override_field.FieldUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = RegisterPageBase.class)
public class RegisterPage extends RegisterPageBase {

    @FindBy(css = ".master-wrapper-page")
    private MobileNavigationBar navigationBar;

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
        FieldUtils.overrideFields(this);
    }

    public NavigationBarBase getNavigationBar() {
        return navigationBar;
    }
}