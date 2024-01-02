package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private final WebDriver driver;

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
        PageFactory.initElements(driver, this);
    }

    // Method to run a function
    public void enterUsername(String email){
        email_field.clear();
        email_field.sendKeys(email);
    }

    public void enterPassword(String password) {
        password_field.clear();
        password_field.sendKeys(password);
    }

    //    public void toggleButton(String toggleStatus) {
//        boolean isOn = toggleStatus.equalsIgnoreCase("ON");
//        boolean currentState = toggleButton.isSelected();
//
//        if (isOn != currentState) {
//            toggleButton.click();
//        }
//    }

}

