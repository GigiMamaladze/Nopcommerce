package com.solvd.gui.pages.desktop;

import com.solvd.gui.pages.common.BuildYourOwnComputerPageBase;
import com.solvd.gui.pages.common.ShoppingCartPageBase;
import com.solvd.gui_components.enums.ComputerSpec;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BuildYourOwnComputerPageBase.class)
public class BuildYourOwnComputerPage extends BuildYourOwnComputerPageBase {

    @FindBy(xpath = "//*[@class = 'product-name']//*[text() = 'Build your own computer']")
    private ExtendedWebElement productName;

    @FindBy(xpath = "//*[@name = 'product_attribute_1']")
    private ExtendedWebElement processorSelectBox;

    @FindBy(xpath = "//*[@name = 'product_attribute_2']")
    private ExtendedWebElement ramSelectBox;

    @FindBy(xpath = "//*[@id = 'product_attribute_input_3']//*[text() = '%s']/../input[@type = 'radio']")
    private ExtendedWebElement hddItem;

    @FindBy(xpath = "//button[text() = 'Add to cart']")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = "//*[@id = 'bar-notification']//*[text() = 'The product has been added to your ']")
    private ExtendedWebElement successfullyNotification;

    @FindBy(xpath = "//*[@class = 'bar-notification success']//a[text() = 'shopping cart']")
    private ExtendedWebElement shoppingCartLink;

    public BuildYourOwnComputerPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(productName);
    }

    @Override
    public void selectProcessor(ComputerSpec computerSpec) {
        processorSelectBox.select(computerSpec.getSpec());
    }

    @Override
    public void selectRam(ComputerSpec computerSpec) {
        ramSelectBox.select(computerSpec.getSpec());
    }

    @Override
    public void selectHDD(ComputerSpec computerSpec) {
        hddItem.format(computerSpec.getSpec()).click();
    }

    @Override
    public void clickAddToCart() {
        addToCartButton.click();
    }

    @Override
    public boolean isSuccessfullyNotificationAppeared() {
        return successfullyNotification.isElementPresent();
    }

    @Override
    public ShoppingCartPageBase clickShoppingCartLink() {
        shoppingCartLink.click();
        return initPage(ShoppingCartPageBase.class, getDriver());
    }
}