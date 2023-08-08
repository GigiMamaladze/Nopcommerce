package com.solvd.gui.components.navigation;

import com.solvd.gui.pages.common.RegisterPageBase;
import com.solvd.gui.pages.desktop.RegisterPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TopNavigation extends TopNavigationBase {

    @FindBy(css = ".ico-register")
    private ExtendedWebElement registerLabel;

    public TopNavigation(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public RegisterPageBase clickRegisterLabel() {
        registerLabel.click();
        return new RegisterPage(getDriver());
    }
}
