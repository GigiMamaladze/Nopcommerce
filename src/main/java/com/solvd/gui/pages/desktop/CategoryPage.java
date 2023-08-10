package com.solvd.gui.pages.desktop;

import com.solvd.gui.pages.common.BuildYourOwnComputerPageBase;
import com.solvd.gui.pages.common.CategoryPageBase;
import com.solvd.gui.pages.common.ProductPageBase;
import com.solvd.gui_components.enums.SubCategory;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CategoryPageBase.class)
public class CategoryPage extends CategoryPageBase {

    @FindBy(xpath = "//*[@class = 'page-title']//*[text() = '%s']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//*[@class = 'sub-category-item']//*[contains(text(), '%s')]")
    private ExtendedWebElement subCategoryLink;

    @FindBy(xpath = "//*[@class = 'product-item']//*[text() = '%s']")
    private ExtendedWebElement productLink;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CategoryPageBase clickSubcategory(SubCategory subCategory) {
        subCategoryLink.format(subCategory.getSubCategory()).click();
        return initPage(CategoryPageBase.class, getDriver());
    }

    @Override
    public boolean isPageOpened(String pageTitle) {
        return this.pageTitle.format(pageTitle).isElementPresent();
    }

    @Override
    public ProductPageBase clickProduct(String product) {
        productLink.format(product).click();
        return initPage(ProductPageBase.class, getDriver());
    }

    @Override
    public BuildYourOwnComputerPageBase clickBuildYourOwnComputerLink() {
        productLink.format("Build your own computer").click();
        return initPage(BuildYourOwnComputerPageBase.class, getDriver());
    }
}