package com.solvd.gui.pages.common;

import com.solvd.gui_components.enums.computerspec.Hdd;
import com.solvd.gui_components.enums.computerspec.Processor;
import com.solvd.gui_components.enums.computerspec.Ram;
import org.openqa.selenium.WebDriver;

public abstract class BuildYourOwnComputerPageBase extends AbstractNopcommercePage {

    public BuildYourOwnComputerPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void selectProcessor(Processor processor);

    public abstract void selectRam(Ram ram);

    public abstract void selectHDD(Hdd hdd);

    public abstract void clickAddToCart();
}