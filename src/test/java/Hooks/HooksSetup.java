package Hooks;
import Utilities.DriverManager.GetDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HooksSetup {
    private static WebDriver driver;
        @Before
        public void setup() {
            GetDriverManager.getDriver("edge");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.manage().window().maximize();
            driver.get("https://www.linkedin.com/feed/");
        }

        @After
        public void tearDown() {
            GetDriverManager.quitDriver();
        }
    }

