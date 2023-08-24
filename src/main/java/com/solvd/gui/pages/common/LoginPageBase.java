package com.solvd.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractNopcommercePage {

    private ExtendedWebElement pageTitle;

    private ExtendedWebElement emailTextField;

    private ExtendedWebElement passwordTextField;

    private ExtendedWebElement loginButton;

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public void typeEmail(String email) {
        emailTextField.type(email);
    }

    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    public HomePageBase clickLoginButton() {
        loginButton.click();
        return initPage(HomePageBase.class, getDriver());
    }
}