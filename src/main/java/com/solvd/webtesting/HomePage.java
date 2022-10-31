package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//input[contains(@class,'fast-search')]")
    private ExtendedWebElement searchInput;

    @FindBy(xpath = "//*[contains(@class,'b-top-menu')]")
    private TopMenu topMenu;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public ExtendedWebElement getSearchInput() {
        return searchInput;
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }
}
