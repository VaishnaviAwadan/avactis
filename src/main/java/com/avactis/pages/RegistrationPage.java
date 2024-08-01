package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("email");
    By password = By.id("password");
    By registerButton = By.id("register");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void setLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }

    public void setEmail(String emailAddr) {
        driver.findElement(email).sendKeys(emailAddr);
    }

    public void setPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}

