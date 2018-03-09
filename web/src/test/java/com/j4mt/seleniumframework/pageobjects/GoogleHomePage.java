package com.j4mt.seleniumframework.pageobjects;

import com.j4mt.seleniumframework.core.driver.DriverProvider;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {

    @Getter
    private final WebElement googleLogo = DriverProvider.getDriver().findElement(By.id("hplogo"));

    @Getter
    private final WebElement searchEditBox = DriverProvider.getDriver().findElement(By.id("lst-ib"));
}
