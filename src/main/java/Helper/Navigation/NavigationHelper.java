package Helper.Navigation;

import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private final WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        driver.navigate().to(url);
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
