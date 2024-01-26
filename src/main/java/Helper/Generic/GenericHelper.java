package Helper.Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GenericHelper {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;

    public GenericHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }
    public WebElement getElement(WebElement locator) {
        return wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public void clickElement(WebElement locator) {
        getElement(locator).click();
    }

    public void sendKeysToElement(WebElement locator, String text) {
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }
    public boolean isElementPresent(WebElement element) {
        return element.isDisplayed();
    }
    public void moveToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

}
