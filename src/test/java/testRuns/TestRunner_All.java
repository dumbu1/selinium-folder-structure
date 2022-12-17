package testRuns;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)



@CucumberOptions(
		

		features={"src/test/resources/features/page1_homePage/",
				"src/test/resources/features/page2_executeAutomationPage/"
		},
		

		glue = {"stepDefinations","hooks"},

		plugin = {"pretty",
			"html:target/cucumber-html-report",
			"json:target/cucumber.json",
			"junit:target/cucumber.xml",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			},
		dryRun = false,
		monochrome = true
				)

public class TestRunner_All {
	

}
