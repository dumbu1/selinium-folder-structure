package stepDefinations;

import commonMethods.SeleniumSpecificMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefinations {
	
	@Given("user is on {string} page")
	public void user_is_on_page(String pageTitle) {
		SeleniumSpecificMethods.validate_PageTitle(pageTitle);
	}

	

	@Then("system should display {string} page")
	public void system_should_display_page(String string) {
	}
	
	
}
