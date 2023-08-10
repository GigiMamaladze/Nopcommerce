package com.solvd.gui.pages.common;

import com.solvd.gui_components.enums.computerspec.Hdd;
import com.solvd.gui_components.enums.computerspec.Processor;
import com.solvd.gui_components.enums.computerspec.Ram;
import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractNopcommercePage {

    public ProductPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPageOpened(String product);

    public abstract void selectProcessor(Processor processor);

    public abstract void selectRam(Ram ram);

    public abstract void selectHDD(Hdd hdd);

    public abstract void clickAddToCartButton();
}