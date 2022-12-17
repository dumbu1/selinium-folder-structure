package stepDefinations;

import io.cucumber.java.en.When;
import pages.HomePage;
import utility.DriverManager;

public class HomePage_SD {
	
	private HomePage obj_HomePage;
	private DriverManager obj_DriverManager=new DriverManager();

	
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String loginButton) {
	    
		obj_HomePage=new HomePage(obj_DriverManager.getDriver());
		obj_HomePage.click_Login_Button(loginButton);
	}

}
