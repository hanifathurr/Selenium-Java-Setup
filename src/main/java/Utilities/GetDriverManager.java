package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetDriverManager {

    private static WebDriver driver;

        public static WebDriver getDriver(String browser) {
            if (driver == null) {
                if (browser.equalsIgnoreCase("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                } else if (browser.equalsIgnoreCase("firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                } else if (browser.equalsIgnoreCase("edge")) {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                } else {
                    throw new IllegalArgumentException("Invalid browser name: " + browser);
                }
            }

            // Configure Chrome options
            ChromeOptions options = new ChromeOptions();
            // ChromeOptions list
            driver = new ChromeDriver(options);
//            options.setHeadless(true);
            options.addArguments("--incognito");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-notifications");

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

