package com.solvd.gui.pages.common;

import com.solvd.gui_components.enums.SubCategory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class CategoryPageBase extends AbstractNopcommercePage {

    private ExtendedWebElement pageTitle;

    private ExtendedWebElement subCategoryLink;

    private ExtendedWebElement productLink;

    public CategoryPageBase(WebDriver driver) {
        super(driver);
    }

    public CategoryPageBase clickSubcategory(SubCategory subCategory) {
        subCategoryLink.format(subCategory.getSubCategory()).click();
        return initPage(CategoryPageBase.class, getDriver());
    }

    public boolean isPageOpened(String pageTitle) {
        return this.pageTitle.format(pageTitle).isElementPresent();
    }

    public ProductPageBase clickProduct(String product) {
        productLink.format(product).click();
        return initPage(ProductPageBase.class, getDriver());
    }
}