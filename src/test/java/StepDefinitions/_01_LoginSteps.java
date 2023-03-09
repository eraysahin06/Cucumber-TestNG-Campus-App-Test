package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class _01_LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("step 1");
    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        System.out.println("step 2");
    }
    @When("Click on Login button")
    public void click_on_login_button() {
        System.out.println("step 3");
    }
    @Then("Verify user is logged in successfully")
    public void verify_user_is_logged_in_successfully() {
        System.out.println("step 4");
    }
}
