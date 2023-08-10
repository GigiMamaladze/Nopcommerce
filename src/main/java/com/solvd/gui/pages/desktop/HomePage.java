package com.solvd.gui.pages.desktop;

import com.solvd.gui.components.navigation.NavigationBar;
import com.solvd.gui.components.navigation.NavigationBarBase;
import com.solvd.gui.pages.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(css = ".master-wrapper-page")
    private NavigationBar navigation;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public NavigationBarBase getNavigation() {
        return navigation;
    }
}