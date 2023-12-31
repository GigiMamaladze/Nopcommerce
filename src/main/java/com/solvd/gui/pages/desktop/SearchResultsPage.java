package com.solvd.gui.pages.desktop;

import com.solvd.gui.pages.common.SearchResultsPageBase;
import com.solvd.gui_components.utils.override_field.FieldUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchResultsPageBase.class)
public class SearchResultsPage extends SearchResultsPageBase {

    @FindBy(xpath = "//*[@class = 'product-item']//*[text() = '%s']")
    private ExtendedWebElement product;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
        FieldUtils.overrideFields(this);
    }
}