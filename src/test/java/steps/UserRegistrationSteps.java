package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class UserRegistrationSteps extends CommonMethods {

    @Given("user is navigated to OpenCart website")
    public void user_is_navigated_to_open_cart_website() {
        openBrowser();

    }
    @When("user navigates to the My Account tab and clicks on Register tab")
    public void user_navigates_to_the_tab_and_clicks_on_tab() {
        click(userRegistrationPage.myAcctBtn);


    }
    @When("user is successfully navigated to the Register Account page")
    public void user_is_successfully_navigated_to_the_page() {
        click(userRegistrationPage.registerBtn);
    }
    @When("user enters all required fileds into personal detailed section")
    public void user_enters_all_required_fileds_into_personal_detailed_section() {

    }
    @When("user selects on subscribe button")
    public void user_selects_on_subscribe_button() {

    }
    @When("user clicks on checkbox")
    public void user_clicks_on_checkbox() {

    }
    @Then("user clicks on continue tab")
    public void user_clicks_on_continue_tab() {

    }


}
