package PageObjects;

import Helper.Generic.GenericHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    private final WebDriver driver;
    private final GenericHelper genericHelper;

    // Constructor - initialize elements with Page Factory
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        this.genericHelper = new GenericHelper(driver);
        PageFactory.initElements(driver, this);
    }

    // Page Factory elements
    @FindBy(id = "")
    private WebElement firstName_field;

    @FindBy(id = "")
    private WebElement lastName_field;

    @FindBy(id = "")
    private WebElement email_field;

    @FindBy(id = "")
    private WebElement password_field;

    @FindBy(id = "")
    private WebElement confirmPassword_field;

    @FindBy(id = "")
    private WebElement createAccount_btn;

    // Method to run a function
    public void enterFirstName(String firstName){
        genericHelper.sendKeysToElement(firstName_field,firstName);
    }

    public void enterLastName(String lastName){
        genericHelper.sendKeysToElement(lastName_field,lastName);
    }

    public void enterEmail(String email){
        genericHelper.sendKeysToElement(email_field,email);
    }

    public void enterPassword(String password) {
        genericHelper.sendKeysToElement(password_field,password);
    }

    public void enterConfirmPassword(String password) {
        genericHelper.sendKeysToElement(confirmPassword_field,password);
    }

    public void clickCreateAnAccount() {
        genericHelper.clickElement(createAccount_btn);
    }
}
