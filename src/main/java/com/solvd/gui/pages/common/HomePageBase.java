package com.solvd.gui.pages.common;

import com.solvd.gui.components.navigation.NavigationBar;
import com.solvd.gui.components.navigation.NavigationBarBase;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractNopcommercePage {

    private NavigationBar navigationBar;

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public NavigationBarBase getNavigationBar() {
        return navigationBar;
    }
}



