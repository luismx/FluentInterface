package com.ps.fluentinterface.pages;

/**
 * Main page.
 * */
public final class SearchPage {

    /**
     * Avoid the instantiation.
     * */
    private SearchPage() {

    }

    /**
     * Singleton.
     * */
    public static SearchPage getInstance() {
        return new SearchPage();
    }
}
