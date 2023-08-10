package com.solvd.gui.components.navigation;

import com.solvd.gui.pages.common.*;
import com.solvd.gui_components.enums.Category;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class NavigationBarBase extends AbstractUIObject {

    public NavigationBarBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract RegisterPageBase clickRegisterLink();

    public abstract LoginPageBase clickLoginLink();

    public abstract SearchResultsPageBase search(String productName);

    public abstract CategoryPageBase clickCategory(Category category);

    public abstract HomePageBase clickHeaderLogo();

    public abstract boolean isUserLoggedIn();
}