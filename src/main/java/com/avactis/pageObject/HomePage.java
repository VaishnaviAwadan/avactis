package com.avactis.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By registerLink = By.linkText("Register");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegister() {
        driver.findElement(registerLink).click();
    }
}

