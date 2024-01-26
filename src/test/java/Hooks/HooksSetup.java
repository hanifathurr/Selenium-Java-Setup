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
            GetDriverManager.getDriver("chrome");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.navigate();
        }

        @After
        public void teardown() {
            GetDriverManager.quitDriver();
        }
    }

