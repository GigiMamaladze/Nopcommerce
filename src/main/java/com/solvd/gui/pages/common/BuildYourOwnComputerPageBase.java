package com.solvd.gui.pages.common;

import com.solvd.gui_components.enums.ComputerSpec;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BuildYourOwnComputerPageBase extends AbstractPage {

    public BuildYourOwnComputerPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void selectProcessor(ComputerSpec computerSpec);

    public abstract void selectRam(ComputerSpec computerSpec);

    public abstract void selectHDD(ComputerSpec computerSpec);

    public abstract void clickAddToCart();

    public abstract boolean isSuccessfullyNotificationAppeared();

    public abstract ShoppingCartPageBase clickShoppingCartLink();
}