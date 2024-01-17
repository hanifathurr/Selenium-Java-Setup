package Helper.Javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptHelper {
    private final WebDriver driver;

    public JavascriptHelper(WebDriver driver) {
        this.driver = driver;
    }
    public Object executeScript(String script, Object... args) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        return executor.executeScript(script, args);
    }
    public void scrollToElement(WebElement element) {
        executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToTop() {
        executeScript("window.scrollTo(0, 0);");
    }

    public void scrollToBottom() {
        executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void highlightElement(WebElement element) {
        executeScript("arguments[0].style.backgroundColor = 'yellow';", element);
    }

    public void clickElement(WebElement element) {
        executeScript("arguments[0].click();", element);
    }
}
