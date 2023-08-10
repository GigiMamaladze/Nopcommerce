package com.solvd.gui.pages.desktop;

import com.solvd.gui.pages.common.ProductPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ProductPageBase.class)
public class ProductPage extends ProductPageBase {

    @FindBy(xpath = "//*[@class = 'product-name']//*[text() = '%s']")
    private ExtendedWebElement product;

    @FindBy(xpath = "//button[text() = 'Add to cart']")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = "//*[@id = 'bar-notification']//*[text() = 'The product has been added to your ']")
    private ExtendedWebElement successfullyMessage;

    @FindBy(xpath = "//*[@class = 'bar-notification success']//a[text() = 'shopping cart']")
    private ExtendedWebElement shoppingCartLink;


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPageOpened(String productName) {
        return product.format(productName).isElementPresent();
    }

    @Override
    public void clickAddToCart() {
        addToCartButton.click();
    }
}