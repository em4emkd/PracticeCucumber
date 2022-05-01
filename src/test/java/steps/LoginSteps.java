package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to OpenCart website")
    public void user_is_navigated_to_open_cart_website() {
      openBrowser();
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        LoginPage loginPage = new LoginPage();
          sendText(loginPage.usernameBox,"demo");
          sendText(loginPage.passwordBox, "demo");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        LoginPage loginPage = new LoginPage();
        click(loginPage.loginBtn);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        //tearDown();
    }



}
