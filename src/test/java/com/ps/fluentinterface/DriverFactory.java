package com.ps.fluentinterface;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * WebDriver as Singleton.
 * */
public final class DriverFactory {
    static final int WAIT_IN_SECONDS = 5;
    private static WebDriver driver;
    private static WebDriverWait wait;

    /**
     * Avoid instantiation.
     * */
    private DriverFactory() {

    }

    /**
     * Method corresponding to the gecko driver.
     * */
    public static WebDriver getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\SourceCode\\local\\java\\lib\\geckodriver.exe");
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    /**
     * FirefoxDriver is not working correctly.
     * */
    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\SourceCode\\local\\java\\lib\\chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
        }

        return driver;
    }

    /**
     * Single WebDriverWait instance.
     * */
    public static WebDriverWait getWebDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_IN_SECONDS));
        }

        return wait;
    }
}
