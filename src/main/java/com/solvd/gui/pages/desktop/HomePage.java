package com.solvd.gui.pages.desktop;

import com.solvd.gui.components.navigation.NavigationBar;
import com.solvd.gui.pages.common.HomePageBase;
import com.solvd.gui_components.utils.override_field.FieldUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(css = ".master-wrapper-page")
    private NavigationBar navigationBar;

    public HomePage(WebDriver driver) {
        super(driver);
        FieldUtils.overrideFields(this);
    }
}