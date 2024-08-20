package com.avactis.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	private static final Duration TIMEOUT = 20;

    public static WebElement waitForElementToBeClickable(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForElementToBeVisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
