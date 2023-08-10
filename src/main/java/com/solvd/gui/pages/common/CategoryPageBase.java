package com.solvd.gui.pages.common;

import com.solvd.gui_components.enums.SubCategory;
import org.openqa.selenium.WebDriver;

public abstract class CategoryPageBase extends AbstractNopcommercePage {

    public CategoryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract CategoryPageBase clickSubcategory(SubCategory subCategory);

    public abstract boolean isPageOpened(String pageTitle);

    public abstract ProductPageBase clickProduct(String product);
}