package com.solvd.gui.pages.desktop;

import com.solvd.gui.pages.common.BuildYourOwnComputerPageBase;
import com.solvd.gui_components.enums.computerspec.Hdd;
import com.solvd.gui_components.enums.computerspec.Processor;
import com.solvd.gui_components.enums.computerspec.Ram;
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

    public BuildYourOwnComputerPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(productName);
    }

    @Override
    public void selectProcessor(Processor processor) {
        processorSelectBox.select(processor.getProcessor());
    }

    @Override
    public void selectRam(Ram ram) {
        ramSelectBox.select(ram.getRam());
    }

    @Override
    public void selectHDD(Hdd hdd) {
        hddItem.format(hdd.getHdd()).click();
    }

    @Override
    public void clickAddToCart() {
        addToCartButton.click();
    }
}