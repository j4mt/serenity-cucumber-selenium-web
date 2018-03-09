package com.j4mt.seleniumframework.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    private WebDriver webDriver;

    public WebDriverFactory() {
    }

    public WebDriver instaciateWebDriver(String driver){

        switch (driver){

            case  "chrome":
                System.setProperty("webdriver.chrome.driver", "chromedriver");
                return chromeDriver();
            default:
                return fireFoxDriver();
        }
    }

    private WebDriver chromeDriver(){
        webDriver = new ChromeDriver();

        return webDriver;
    }

    private WebDriver fireFoxDriver(){
        webDriver = new FirefoxDriver();

        return webDriver;
    }

}
