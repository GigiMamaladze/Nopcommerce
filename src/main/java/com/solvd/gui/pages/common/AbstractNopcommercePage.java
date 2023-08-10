package com.solvd.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractNopcommercePage extends AbstractPage {

    @FindBy(xpath = "//*[@id = 'bar-notification']//*[text() = 'The product has been added to your ']")
    private ExtendedWebElement successfullyAddToTheCartNotification;

    @FindBy(xpath = "//*[@class = 'bar-notification success']//a[text() = 'shopping cart']")
    private ExtendedWebElement shoppingCartLink;

    public AbstractNopcommercePage(WebDriver driver) {
        super(driver);
    }

    public boolean isSuccessfullyAddToTheCartNotificationAppeared() {
        return successfullyAddToTheCartNotification.isElementPresent();
    }

    public ShoppingCartPageBase clickShoppingCartLink() {
        shoppingCartLink.click();
        return initPage(ShoppingCartPageBase.class, getDriver());
    }
}
