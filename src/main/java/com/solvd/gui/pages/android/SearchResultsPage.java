package com.solvd.gui.pages.android;

import com.solvd.gui.pages.common.SearchResultsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchResultsPageBase.class)
public class SearchResultsPage extends SearchResultsPageBase {

    @FindBy(xpath = "//*[@class = 'product-item']//*[text() = '%s']")
    private ExtendedWebElement product;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPresent(String productName) {
        return product.format(productName).isElementPresent();
    }
}
