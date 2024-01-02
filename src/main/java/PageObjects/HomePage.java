package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    // Page Factory elements
    @FindBy(id = "")
    private WebElement loginPageButton;

    @FindBy(id = "")
    private WebElement signUpPageButton;

    @FindBy(id = "")
    private WebElement searchBar;

    // Constructor - initialize elements with Page Factory
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to run a function
    public void accessLoginPage(){
        loginPageButton.click();
    }

    public void accessSignUpPage(){
        signUpPageButton.click();
    }
    /*public void toggleButton(String toggleStatus) {
        boolean isOn = toggleStatus.equalsIgnoreCase("ON");
        boolean currentState = toggleButton.isSelected();

        if (isOn != currentState) {
            toggleButton.click();
        }
    }*/

}
