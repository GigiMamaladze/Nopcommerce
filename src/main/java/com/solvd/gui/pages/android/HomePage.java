package com.solvd.gui.pages.android;

import com.solvd.gui.components.navigation.MobileNavigationBar;
import com.solvd.gui.components.navigation.NavigationBarBase;
import com.solvd.gui.pages.common.HomePageBase;
import com.solvd.gui_components.utils.override_field.FieldUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(css = ".master-wrapper-page")
    private MobileNavigationBar navigationBar;

    public HomePage(WebDriver driver) {
        super(driver);
        FieldUtils.overrideFields(this);
    }

    public NavigationBarBase getNavigationBar() {
        return navigationBar;
    }
}