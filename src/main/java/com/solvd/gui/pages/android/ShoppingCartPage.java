package com.solvd.gui.pages.android;

import com.solvd.gui.pages.common.ShoppingCartPageBase;
import com.solvd.gui_components.utils.override_field.FieldUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ShoppingCartPageBase.class)
public class ShoppingCartPage extends ShoppingCartPageBase {

    @FindBy(xpath = "//*[@class = 'page-title']/h1[text() = 'Shopping cart']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//td[@class = 'product']//a[text() = '%s']")
    private ExtendedWebElement product;


    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
        FieldUtils.overrideFields(this);
    }
}