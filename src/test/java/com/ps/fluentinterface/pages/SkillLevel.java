package com.ps.fluentinterface.pages;

/**
* Tabs on the main page.
* */
public enum SkillLevel {
    /** beginner.*/
    BEGINNER("Beginner"),
    /** intermediate.*/
    INTERMEDIATE("Intermediate"),
    /** advanced.*/
    ADVANCED("Advanced");

    /**
     * Value.
     */
    private String value;

    SkillLevel(String value) {
        this.value = value;
    }

    /**
     * Return the value of the selected enum.
     */
    @Override
    public String toString() {
        return value;
    }
}
