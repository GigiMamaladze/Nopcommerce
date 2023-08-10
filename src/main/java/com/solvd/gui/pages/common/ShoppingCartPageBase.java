package com.solvd.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ShoppingCartPageBase extends AbstractPage {

    public ShoppingCartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPresent(String productName);
}