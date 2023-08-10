package com.solvd.gui.pages.desktop;

import com.solvd.gui.components.navigation.Navigation;
import com.solvd.gui.components.navigation.NavigationBase;
import com.solvd.gui.pages.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(css = ".master-wrapper-page")
    private Navigation navigation;

    @FindBy(css = ".ico-account")
    private ExtendedWebElement myAccountLabel;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public NavigationBase getNavigation() {
        return navigation;
    }

    @Override
    public boolean isUserLoggedIn() {
        return myAccountLabel.isElementPresent();
    }
}