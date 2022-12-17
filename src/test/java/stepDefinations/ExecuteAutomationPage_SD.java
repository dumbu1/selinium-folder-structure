package stepDefinations;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import commonMethods.SeleniumSpecificMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.ExecuteAutomationPage;
import utility.DriverManager;


public class ExecuteAutomationPage_SD {
	
	
	private ExecuteAutomationPage obj_ExecuteAutomationPage=new ExecuteAutomationPage(DriverManager.getDriver());
	
	@Given("check Title")
	public void given_check_Title(DataTable title) {
		
		List <String> list_Title=title.asList();
		
		
		
		obj_ExecuteAutomationPage.checkAvailability_Title(list_Title);
	
	}
	
	

	@Given("check Gender")
	public void check_gender(DataTable gender) {
	List <String> list_Gender=gender.asList();
		
		obj_ExecuteAutomationPage.checkAvailability_Gender(list_Gender);
	
	}

	@Given("check Languages Known")
	public void check_languages_known(DataTable languagesKnown) {
	List <String> list_LanguagesKnown=languagesKnown.asList();
		
		obj_ExecuteAutomationPage.checkAvailability_Languages_Known(list_LanguagesKnown);
	
	}

		

}
