package stepDefinations;

import io.cucumber.java.en.When;
import pages.HomePage;
import utility.DriverManager;

public class HomePage_SD {
	
	private static HomePage obj_HomePage;
	
	@When("user clicks on {string} page")
	public void user_clicks_on_page(String string) {
	    
		obj_HomePage=new HomePage(DriverManager.getDriver());
		obj_HomePage.click_Login();
	}

}
