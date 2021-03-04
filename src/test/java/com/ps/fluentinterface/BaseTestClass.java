package com.ps.fluentinterface;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;

/**
* Base class that initialize the WebDriver.
*/
public class BaseTestClass {
    static final int WAIT_IN_SECONDS = 5;
    private WebDriver driver;

    /**
     * Init the URL.
     */
    //@BeforeSuite
    public void startUpBrowser() {
        driver = DriverFactory.getFirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_IN_SECONDS));
        driver.manage().window().maximize();
    }

    //@BeforeMethod
    public void goToHome() {
        driver.get("https://www.pluralsight.com");
    }

    //@AfterSuite(alwaysRun = true)
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
