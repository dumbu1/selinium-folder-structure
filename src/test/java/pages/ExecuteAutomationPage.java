package pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSpecificMethods;
import utility.ExcelReader;

public class ExecuteAutomationPage {

	private static WebDriver driver;
	public ExecuteAutomationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy( xpath ="//select[@id='TitleId']" )
	private WebElement select_Title ;

	@FindBy(xpath =  "//input[@id='Initial']")
	private WebElement  textbox_Intial;
	
	
	@FindBy(xpath = "//input[@id='FirstName']" )
	private WebElement textbox_Firstname;
	
	
	@FindBy(xpath = "//input[@id='MiddleName']")
	private WebElement textbox_Middlename;
	
	@FindBy(xpath= "//input[@type='radio']")
	private WebElement radio_Gender;
	
	@FindBy(xpath= "//input[@type='checkbox']")
	private WebElement checkbox_Languages_Known;
	
	@FindBy(xpath="//input[@name='Save']")
	private WebElement button_Save;
	
	//***************related methods*******************
	//**********checking availability******************
	
	public void checkAvailability_Title(List<String>expectedValues) {
		SeleniumSpecificMethods.list_checkAvailability(select_Title, expectedValues);
	}
	
	public void checkAvailability_Gender(List<String> expectedValues) {
		SeleniumSpecificMethods.list_checkAvailability(radio_Gender, expectedValues);
		
	}
	public void checkAvailability_Languages_Known(List<String> expectedValues) {
		SeleniumSpecificMethods.list_checkAvailability(checkbox_Languages_Known, expectedValues);
		
	}
	
	//form validation
	
	public void formValidation() {
		
	}


}
