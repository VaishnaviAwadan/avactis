package com.avactis.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

import com.avactis.actiondriver.ActionClass;
import com.avactis.base.BaseClass;

public class BaseClass {

    public static WebDriver driver;
    public ActionClass  action;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        // Initialize the WebDriver based on the browser type
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Browser \"" + browser + "\" not supported.");
        }

        // Maximize the window
        driver.manage().window().maximize();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Initialize the Action class
        action = new ActionClass(driver);

        // Launch the application
        driver.get("http://localhost/avactis/avactis-system/admin/signin.php");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after each test
        if (driver != null) {
            driver.quit();
        }
    }
}
