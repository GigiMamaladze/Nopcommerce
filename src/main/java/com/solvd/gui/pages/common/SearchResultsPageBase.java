package com.solvd.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class SearchResultsPageBase extends AbstractNopcommercePage {

    public SearchResultsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPresent(String productName);
}