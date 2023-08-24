package com.solvd.gui.components.navigation;

import com.solvd.gui.pages.common.CategoryPageBase;
import com.solvd.gui.pages.desktop.CategoryPage;
import com.solvd.gui_components.enums.Category;
import com.solvd.gui_components.utils.override_field.FieldUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MobileNavigationBar extends NavigationBarBase {

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

    @FindBy(xpath = "//*[@class = 'top-menu mobile']//*[contains(text(), 'Computers')]")
    private ExtendedWebElement categoryLink;

    @FindBy(xpath = "//*[text() = 'Categories']")
    private ExtendedWebElement categoriesToggleBox;

    public MobileNavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
        FieldUtils.overrideFields(this);
    }

    @Override
    public CategoryPageBase clickCategory(Category category) {
        categoriesToggleBox.click();
        categoryLink.format(category.getCategory()).click();
        return new CategoryPage(getDriver());
    }
}