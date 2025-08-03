package com.translate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.*;

import java.net.URL;

public class CrossBrowserStackTest {

    public WebDriver driver;

    // 👉 Replace with your actual credentials
    public static final String USERNAME = "kothapallivyshna_f0uMdN";
    public static final String AUTOMATE_KEY = "pTtJfd7KoULx4xiS26YH";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Parameters({"os", "os_version", "browser", "browser_version", "device", "real_mobile"})
    @BeforeMethod
    public void setUp(String os, String osVersion, String browser, String browserVersion, String device, String realMobile) throws Exception {

        MutableCapabilities capabilities = new MutableCapabilities();
        MutableCapabilities bstackOptions = new MutableCapabilities();

        if (device.equalsIgnoreCase("NA")) {
            capabilities.setCapability("browserName", browser);
            capabilities.setCapability("browserVersion", browserVersion);

            bstackOptions.setCapability("os", os);
            bstackOptions.setCapability("osVersion", osVersion);
        } else {
            capabilities.setCapability("browserName", browser);
            bstackOptions.setCapability("deviceName", device);
            bstackOptions.setCapability("realMobile", realMobile);
        }

        bstackOptions.setCapability("projectName", "Cross Browser Project");
        bstackOptions.setCapability("buildName", "Build 1");
        bstackOptions.setCapability("sessionName", "Parallel Test Session");

        capabilities.setCapability("bstack:options", bstackOptions);

        driver = new RemoteWebDriver(new URL(URL), capabilities);
    }

    @Test
    public void openWebsite() {
        driver.get("https://elpais.com/opinion/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
