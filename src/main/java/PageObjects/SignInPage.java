package PageObjects;

import Helper.Assertion.AssertionHelper;
import Helper.Generic.GenericHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private final WebDriver driver;
    private final GenericHelper genericHelper;
    private final AssertionHelper assertionHelper;

    // Page Factory elements
    @FindBy(id = "")
    private WebElement email_field;

    @FindBy(id = "")
    private WebElement password_field;

    @FindBy(id = "")
    private WebElement login_btn;

    @FindBy(id = "")
    private WebElement forgotPassword_btn;

    @FindBy(id = "")
    private WebElement createAccount_btn;

    // Constructor - initialize elements with Page Factory
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.genericHelper = new GenericHelper(driver);
        this.assertionHelper = new AssertionHelper(driver);
        PageFactory.initElements(driver, this);
    }

    // Method to run a function
    public void enterEmail(String email){
        genericHelper.sendKeysToElement(email_field,email);
    }

    public void enterPassword(String password) {
        genericHelper.sendKeysToElement(password_field,password);
    }

    public void clickLoginButton() {
        genericHelper.clickElement(login_btn);
    }

    public void verifyLogin() {
        driver.getTitle();
    }

}

