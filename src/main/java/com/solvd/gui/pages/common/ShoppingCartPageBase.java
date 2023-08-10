package com.solvd.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class ShoppingCartPageBase extends AbstractNopcommercePage {

    public ShoppingCartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPresent(String productName);
}