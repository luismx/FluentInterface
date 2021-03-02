package com.ps.fluentinterface.pages;

import com.ps.fluentinterface.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Methods that concern to the home page.
 * */
public final class HomePage {
    private static final int WAIT_IN_SECONDS = 3_000;
    private WebDriver driver = DriverFactory.getFirefoxDriver();
    private WebDriverWait wait = DriverFactory.getWebDriverWait();

    private HomePage() {

    }

    public static HomePage getInstance() {
        return new HomePage();
    }

    /**
     * @param value
     * Simple search by classname
     */
    public void search(String value) {
        WebElement search = driver.findElement(By.className(value));
        Assert.assertEquals(search.getText(), "Email or Username");
    }

    /**
     * @param tab find by xpath
     * */
    public HomePage clickOnTabs(Tab tab) throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(), '" + tab + "')]")).click();
        //wait.wait(WAIT_IN_SECONDS);
        return this;
    }

    /**
     * @param value find by xpath
     * */
    public void clickOnCourses(String value) {
        WebElement element = driver.findElement(By.xpath("//a[@data-aa-title='" + value + "']"));
        element.click();
        Assert.assertEquals("https://www.pluralsight.com/browse", driver.getCurrentUrl());
    }
}
