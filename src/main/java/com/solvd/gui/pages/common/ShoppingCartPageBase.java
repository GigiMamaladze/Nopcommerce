package com.solvd.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class ShoppingCartPageBase extends AbstractNopcommercePage {

    private ExtendedWebElement pageTitle;

    private ExtendedWebElement product;

    public ShoppingCartPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isProductPresent(String productName) {
        return product.format(productName).isElementPresent();
    }
}