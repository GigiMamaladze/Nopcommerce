package com.solvd.gui.components.navigation;

import com.solvd.gui.pages.common.RegisterPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class TopNavigationBase extends AbstractUIObject {

    public TopNavigationBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract RegisterPageBase clickRegisterLabel();

}
