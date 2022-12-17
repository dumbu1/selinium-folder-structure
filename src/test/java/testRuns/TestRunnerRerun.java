package testRuns;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)



@CucumberOptions(
		

		features={"@target/rerun.txt"},
		

		glue = {"stepDefinations","hooks"},

		plugin = {"pretty",
				"html:target1/cucumber-html-report",
				"json:target1/cucumber.json",
				"junit:target1/cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		dryRun = false,
		monochrome = true
				)

public class TestRunnerRerun {
	
	

}
