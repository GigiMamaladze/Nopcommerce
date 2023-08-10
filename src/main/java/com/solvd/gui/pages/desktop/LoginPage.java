package com.solvd.gui.pages.desktop;

import com.solvd.gui.pages.common.HomePageBase;
import com.solvd.gui.pages.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//*[@class = 'page-title']/h1[text() = 'Welcome, Please Sign In!']")
    private ExtendedWebElement pageTitle;

    @FindBy(css = "#Email")
    private ExtendedWebElement emailTextField;

    @FindBy(css = "#Password")
    private ExtendedWebElement passwordTextField;

    @FindBy(xpath = "//button[text() = 'Log in']")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
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
    public HomePageBase clickLoginButton() {
        loginButton.click();
        return initPage(HomePageBase.class, getDriver());
    }
}