package com.avactis.actiondriver;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	public class ActionClass {
	    private WebDriver driver;
	    private Properties properties;

	    public ActionClass(WebDriver driver) {
	        this.driver = driver;
	        loadProperties();
	    }

	    private void loadProperties() {
	        properties = new Properties();
	        try {
	            FileInputStream input = new FileInputStream("config.properties");
	            properties.load(input);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public void navigateToBaseUrl() {
	        String baseUrl = properties.getProperty("url");
	        driver.get(baseUrl);
	    }

	    public void performHoverAction(WebElement element) {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).perform();
	    }

	    public void performClickAction(WebElement element) {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).click().perform();
	    }

	    public void performDoubleClickAction(WebElement element) {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).doubleClick().perform();
	    }

	    public void performRightClickAction(WebElement element) {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).contextClick().perform();
	    }

	
	}
