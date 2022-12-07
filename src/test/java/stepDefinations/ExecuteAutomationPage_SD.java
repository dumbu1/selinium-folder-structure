package stepDefinations;


import org.openqa.selenium.WebDriver;

import commonMethods.SeleniumSpecificMethods;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.ExecuteAutomationPage;
import utility.DriverManager;


public class ExecuteAutomationPage_SD {
	
	
	

	@Given("check {string}")
	public void check(String string, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Given("check Gender")
	public void check_gender(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Given("check Languages Known")
	public void check_languages_known(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("user selects {string} in Title")
	public void user_selects_in_title(String string) {
	}

	@When("user enters {string} in Initial")
	public void user_enters_in_initial(String string) {
	}

	@When("user enters {string} in First Name")
	public void user_enters_in_first_name(String string) {
	}

	@When("user enters {string} in Middle Name")
	public void user_enters_in_middle_name(String string) {
	}

	@When("select {string}")
	public void select(String string) {
	}

	
	@When("click on {string}")
	public void click_on(String string) {
	}

	
	

}
