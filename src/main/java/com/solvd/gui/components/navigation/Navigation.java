package com.solvd.gui.components.navigation;

import com.solvd.gui.pages.common.*;
import com.solvd.gui.pages.desktop.*;
import com.solvd.gui_components.enums.Category;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Navigation extends NavigationBase {

    @FindBy(css = ".header-logo")
    private ExtendedWebElement headerLogo;

    @FindBy(css = ".ico-register")
    private ExtendedWebElement registerLabel;

    @FindBy(css = ".ico-login")
    private ExtendedWebElement loginLabel;

    @FindBy(xpath = "//*[@class = 'header']//*[@id = 'small-searchterms']")
    private ExtendedWebElement searchTextField;

    @FindBy(xpath = "//*[@class = 'header']//button[text() = 'Search']")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = "//*[@class = 'top-menu notmobile']//*[contains(text(), '%s')]")
    private ExtendedWebElement categoryLabel;

    public Navigation(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public RegisterPageBase clickRegisterLabel() {
        registerLabel.click();
        return new RegisterPage(getDriver());
    }

    @Override
    public LoginPageBase clickLoginLabel() {
        loginLabel.click();
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
        categoryLabel.format(category.getCategory()).click();
        return new CategoryPage(getDriver());
    }

    @Override
    public HomePageBase clickHeaderLogo() {
        headerLogo.click();
        return new HomePage(getDriver());
    }
}