package com.ps.fluentinterface.pages;

/**
 * Menu tabs on the home page.
 * */
public enum Tab {
    /**
     * @param value. All tab.
     * */
    ALL("Why Pluralsight?"),
    /**
     * @param value. Products tab.
     * */
    PRODUCTS("Products"),
    /**
     * @param value. Resources tab.
     * */
    RESOURCES("Resources");

    /**
     * Variable to assign the enum value.
     * */
    private String value;

    /**
     * Constructor.
    * */
    Tab(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
