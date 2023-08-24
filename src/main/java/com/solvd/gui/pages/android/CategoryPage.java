package com.solvd.gui.pages.android;

import com.solvd.gui.pages.common.CategoryPageBase;
import com.solvd.gui.pages.common.ProductPageBase;
import com.solvd.gui_components.enums.SubCategory;
import com.solvd.gui_components.utils.override_field.FieldUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CategoryPageBase.class)
public class CategoryPage extends CategoryPageBase {

    @FindBy(xpath = "//*[@class = 'page-title']//*[text() = '%s']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//*[@class = 'sub-category-item']//*[contains(text(), '%s')]")
    private ExtendedWebElement subCategoryLink;

    @FindBy(xpath = "//*[@class = 'product-item']//*[text() = '%s']")
    private ExtendedWebElement productLink;

    public CategoryPage(WebDriver driver) {
        super(driver);
        FieldUtils.overrideFields(this);
    }
}