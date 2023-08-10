package com.solvd.gui.components.navigation;

import com.solvd.gui.pages.common.*;
import com.solvd.gui.pages.desktop.*;
import com.solvd.gui_components.enums.Category;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends NavigationBarBase {

    @FindBy(css = ".header-logo")
    private ExtendedWebElement headerLogo;

    @FindBy(css = ".ico-account")
    private ExtendedWebElement myAccountLink;

    @FindBy(css = ".ico-register")
    private ExtendedWebElement registerLink;

    @FindBy(css = ".ico-login")
    private ExtendedWebElement loginLink;

    @FindBy(xpath = "//*[@class = 'header']//*[@id = 'small-searchterms']")
    private ExtendedWebElement searchTextField;

    @FindBy(xpath = "//*[@class = 'header']//button[text() = 'Search']")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = "//*[@class = 'top-menu notmobile']//*[contains(text(), '%s')]")
    private ExtendedWebElement categoryLink;

    public NavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public RegisterPageBase clickRegisterLink() {
        registerLink.click();
        return new RegisterPage(getDriver());
    }

    @Override
    public LoginPageBase clickLoginLink() {
        loginLink.click();
        return new LoginPage(getDriver());
    }

    @Override
    public SearchResultsPageBase search(String productName) {
        searchTextField.type(productName);
        searchButton.click();
        return new SearchResultsPage(getDriver());
    }

    @Override
    public CategoryPageBase clickCategory(Category category) {
        categoryLink.format(category.getCategory()).click();
        return new CategoryPage(getDriver());
    }

    @Override
    public HomePageBase clickHeaderLogo() {
        headerLogo.click();
        return new HomePage(getDriver());
    }

    @Override
    public boolean isMyAccountLinkPresent() {
        return myAccountLink.isElementPresent();
    }
}