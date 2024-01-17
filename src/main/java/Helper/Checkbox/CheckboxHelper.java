package Helper.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxHelper {
    private final WebDriver driver;

    // This class can also be used for radio button

    public CheckboxHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCheckBox(WebElement checkboxElement) {
        if (!checkboxElement.isSelected()) {
            checkboxElement.click();
        }
    }
    public void unselectCheckBox(WebElement checkboxElement) {
        if (checkboxElement.isSelected()) {
            checkboxElement.click();
        }
    }
    public boolean isSelected(WebElement checkboxElement) {
        return checkboxElement.isSelected();
    }

}
