package Helper.Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertionHelper {
    private final WebDriver driver;
    public AssertionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public static void assertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

    public static void assertEquals(int actual, int expected) {
        Assert.assertEquals(actual, expected);
    }

    public static void assertTrue(boolean condition) {
        Assert.assertTrue(condition);
    }

    public static void assertElementDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

    public static void assertElementText(WebElement element, String text) {
        Assert.assertEquals(element.getText(), text);
    }

}

