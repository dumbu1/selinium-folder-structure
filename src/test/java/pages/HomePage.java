package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSpecificMethods;
import utility.DriverManager;


public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	/*public static HomePage getInstance() {
		return new HomePage(DriverManager.getDriver());
	}*/
	
	@FindBy(xpath = "//input[@name='Login']")
	private WebElement webElement_button_Login;	
	
	
	public void click_Login_Button(String buttonText) {
		SeleniumSpecificMethods.clickButton(webElement_button_Login,buttonText);

	}
	
}
