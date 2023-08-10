package com.solvd.gui.pages.common;

import com.solvd.gui.components.navigation.NavigationBase;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract NavigationBase getNavigation();

    public abstract boolean isUserLoggedIn();
}