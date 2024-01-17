package PageObjects;

import Helper.Generic.GenericHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;
    private final GenericHelper genericHelper;

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
        this.genericHelper = new GenericHelper(driver);
        PageFactory.initElements(driver, this);
    }

    // Method to run a function
    public void accessLoginPage(){
        genericHelper.clickElement(loginPageButton);
    }

    public void accessSignUpPage(){
        genericHelper.clickElement(signUpPageButton);
    }

    public void enterSearchKeyword(String searchKeyword){
        genericHelper.sendKeysToElement(searchBar,searchKeyword);
    }
}
