package Helper.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.Set;

public class BrowserHelper{

    private final WebDriver driver;

    public BrowserHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void goBack() {
        driver.navigate().back();
    }

    public void goForward() {
        driver.navigate().forward();
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public void switchToWindow(int index) {
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());

        if (index < 0 || index > windowsId.size())
            throw new IllegalArgumentException("Invalid Index : " + index);

        driver.switchTo().window(windowsId.get(index));
    }

    public void switchToParentWindow() {
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        driver.switchTo().window(windowsId.get(0));
    }

    public void switchToParentWithChildClose() {
        switchToParentWindow();

        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());

        for (int i = 1; i < windowsId.size(); i++) {
            driver.switchTo().window(windowsId.get(i));
            driver.close();
        }

        switchToParentWindow();
    }

    public void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }
}

