package com.ps.fluentinterface;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test.
 */
public class SearchTest {
    static final int WAIT_IN_SECONDS = 5;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Init the URL.
     */
    @BeforeMethod
    public void startUpBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\SourceCode\\local\\java\\lib\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(WAIT_IN_SECONDS, TimeUnit.SECONDS);
        driver.get("https://app.pluralsight.com/id/");
        driver.manage().window().fullscreen();


    }

    @Test
    public void basicFilterByTest() {
        WebElement search = driver.findElement(By.className("psds-text-input__label"));
        Assert.assertEquals(search.getText(), "Email or Username");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
