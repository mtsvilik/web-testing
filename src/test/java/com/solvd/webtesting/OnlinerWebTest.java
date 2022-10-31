package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinerWebTest implements IAbstractTest {

    @Test
    public void verifyLoadHomePageTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page isn't opened");
        Assert.assertTrue(homePage.getTopMenu().isUIObjectPresent(), "Main menu bar doesn't present");
    }
}
