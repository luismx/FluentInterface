package com.ps.fluentinterface;

import com.ps.fluentinterface.pages.HomePage;
import com.ps.fluentinterface.pages.Tab;

/**
 * Test.
 */
public class SearchTest extends  BaseTestClass {
    private HomePage home = HomePage.getInstance();

    /**
     * Basic test for testing tabs.
     */
    public void basicFilterByTest() throws InterruptedException {
        home.clickOnTabs(Tab.ALL).clickOnTabs(Tab.PRODUCTS).clickOnTabs(Tab.RESOURCES);
    }
}
