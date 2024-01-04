package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxHelper {
    private final WebDriver driver;

    public CheckboxHelper(WebDriver driver) {
        this.driver = driver;
    }
    public void selectCheckBox(By checkboxLocator) {
        WebElement checkbox = driver.findElement(checkboxLocator);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
    public void unselectCheckBox(By checkboxLocator) {
        WebElement checkbox = driver.findElement(checkboxLocator);
        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }
    public boolean isSelected(By checkboxLocator) {
        WebElement element = driver.findElement(checkboxLocator);
        return element.isSelected();
    }

}
