package com.solvd.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractNopcommercePage {

    public ProductPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPageOpened(String product);

    public abstract void clickAddToCart();
}