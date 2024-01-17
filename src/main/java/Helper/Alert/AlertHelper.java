package Helper.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;

import java.time.Duration;

public class AlertHelper {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public AlertHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public Alert waitForAlert() {
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public boolean isAlertPresent() {
        try {
            waitForAlert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String getAlertText() {
        Alert alert = waitForAlert();
        return alert.getText();
    }

    public void acceptAlert() {
        Alert alert = waitForAlert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = waitForAlert();
        alert.dismiss();
    }

    public void sendKeysToAlert(String keysToSend) {
        Alert alert = waitForAlert();
        alert.sendKeys(keysToSend);
        alert.accept();
    }

    public void switchToAlert() {
        driver.switchTo().alert();
    }
}

