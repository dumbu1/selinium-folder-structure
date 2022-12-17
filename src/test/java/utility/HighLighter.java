package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import hooks.Hooks;

public class HighLighter {
	private DriverManager obj_DriverManager=new DriverManager();
	
	public void elementHighLighter(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)obj_DriverManager.getDriver();
		executor.executeScript("arguments[0],setAttribute('style','border:3px solid blue');",element);
				
	}

}
