package runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.*;
import utilities.CucumberReportingConfig;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="classpath:features",
		glue ="stepDefiniation",
		tags = "@smoketest",
		dryRun = false,
		strict = true,
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json"
		},
		publish = true
		)


public class Runner {
	
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}

}
