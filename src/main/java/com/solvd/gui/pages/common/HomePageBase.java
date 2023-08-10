package com.solvd.gui.pages.common;

import com.solvd.gui.components.navigation.NavigationBarBase;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractNopcommercePage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract NavigationBarBase getNavigation();
}