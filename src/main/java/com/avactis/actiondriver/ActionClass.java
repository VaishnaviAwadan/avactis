package com.avactis.actiondriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

    private WebDriver driver;

    public ActionClass(WebDriver driver) {
        this.driver = driver;
    }

    // Click an element
    public void click(WebElement element) {
        element.click();
    }

    // Send keys to an element
    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    // Hover over an element
    public void hover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    // Scroll to an element
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Wait until element is visible
    public void waitForVisibility(WebElement element, Duration timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Drag and drop from source to target
    public void dragAndDrop(WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
    }

    // Right-click on an element
    public void rightClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

    // Double-click on an element
    public void doubleClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

    // Check if an element is displayed
    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    // Check if an element is enabled
    public boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    // Check if an element is selected
    public boolean isSelected(WebElement element) {
        return element.isSelected();
    }
}
