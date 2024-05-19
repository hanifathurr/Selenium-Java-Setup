package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private SignInPage signInPage;
    private HomePage homePage;
    private WebDriver driver;

    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        homePage.accessLoginPage();
    }

    @When("The user enter the username {string} and password {string}")
    public void theUserEnterTheUsernameAndPassword(String username, String password) {
        signInPage.enterEmail(username);
        signInPage.enterPassword(password);
        signInPage.clickLoginButton();
    }

    @Then("The user redirected to the homepage")
    public void theUserRedirectedToTheHomepage() {
        signInPage.verifyLogin();
    }
}
