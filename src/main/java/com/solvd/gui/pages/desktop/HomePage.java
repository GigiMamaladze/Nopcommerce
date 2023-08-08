package com.solvd.gui.pages.desktop;

import com.solvd.gui.components.navigation.TopNavigation;
import com.solvd.gui.components.navigation.TopNavigationBase;
import com.solvd.gui.pages.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(css = ".header-upper")
    private TopNavigation topNavigation;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public TopNavigationBase getTopNavigation() {
        return topNavigation;
    }
}
