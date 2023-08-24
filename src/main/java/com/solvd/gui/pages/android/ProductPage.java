package com.solvd.gui.pages.android;

import com.solvd.gui.pages.common.ProductPageBase;
import com.solvd.gui_components.utils.override_field.FieldUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductPageBase.class)
public class ProductPage extends ProductPageBase {

    @FindBy(xpath = "//*[@class = 'product-name']//*[text() = '%s']")
    private ExtendedWebElement product;

    @FindBy(xpath = "//button[text() = 'Add to cart']")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = "//*[@id = 'bar-notification']//*[text() = 'The product has been added to your ']")
    private ExtendedWebElement successfullyMessage;

    @FindBy(xpath = "//*[@class = 'bar-notification success']//a[text() = 'shopping cart']")
    private ExtendedWebElement shoppingCartLink;

    @FindBy(xpath = "//*[@name = 'product_attribute_1']")
    private ExtendedWebElement processorSelectBox;

    @FindBy(xpath = "//*[@name = 'product_attribute_2']")
    private ExtendedWebElement ramSelectBox;

    @FindBy(xpath = "//*[@id = 'product_attribute_input_3']//*[text() = '%s']/../input[@type = 'radio']")
    private ExtendedWebElement hddItem;

    public ProductPage(WebDriver driver) {
        super(driver);
        FieldUtils.overrideFields(this);
    }
}
