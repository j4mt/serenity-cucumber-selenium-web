package com.j4mt.seleniumframework.core.driver;

import org.openqa.selenium.WebDriver;

public class DriverProvider {

    private static WebDriver webDriver;
    private static WebDriverFactory webDriverFactory;

    public DriverProvider(WebDriverFactory webDriverFactory) {
        this.webDriverFactory = webDriverFactory;
    }

    public static WebDriver getDriver(){
        webDriver = webDriverFactory.instaciateWebDriver("chrome");
        return webDriver;
    }

    public static WebDriver switchDriver(String driver){
        webDriver = webDriverFactory.instaciateWebDriver(driver);
        return webDriver;
    }
}
