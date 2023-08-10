package com.solvd.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractNopcommercePage {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeEmail(String email);

    public abstract void typePassword(String password);

    public abstract HomePageBase clickLoginBtn();
}