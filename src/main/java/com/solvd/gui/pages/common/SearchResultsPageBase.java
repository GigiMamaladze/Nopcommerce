package com.solvd.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class SearchResultsPageBase extends AbstractNopcommercePage {

    private ExtendedWebElement product;

    public SearchResultsPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isProductPresent(String productName) {
        return product.format(productName).isElementPresent();
    }
}