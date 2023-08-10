package com.solvd.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractPage {

    public ProductPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPageOpened(String product);

    public abstract boolean isSuccessfullyNotificationAppeared();

    public abstract ShoppingCartPageBase clickShoppingCartLink();

    public abstract void clickAddToCart();
}