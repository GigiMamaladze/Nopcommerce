package com.solvd.gui.pages.common;

import com.solvd.gui_components.enums.computerspec.Hdd;
import com.solvd.gui_components.enums.computerspec.Processor;
import com.solvd.gui_components.enums.computerspec.Ram;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractNopcommercePage {

    private ExtendedWebElement product;

    private ExtendedWebElement addToCartButton;

    private ExtendedWebElement successfullyMessage;

    private ExtendedWebElement shoppingCartLink;

    private ExtendedWebElement processorSelectBox;

    private ExtendedWebElement ramSelectBox;

    private ExtendedWebElement hddItem;

    public ProductPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isProductPageOpened(String productName) {
        return product.format(productName).isElementPresent();
    }

    public void selectProcessor(Processor processor) {
        processorSelectBox.select(processor.getProcessor());
    }

    public void selectRam(Ram ram) {
        ramSelectBox.select(ram.getRam());
    }

    public void selectHDD(Hdd hdd) {
        hddItem.format(hdd.getHdd()).click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }
}