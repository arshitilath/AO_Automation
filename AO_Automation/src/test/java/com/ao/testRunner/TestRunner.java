package com.ao.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\aspir\\eclipse-workspace\\AO_Automation\\src\\test\\java\\com\\ao\\features\\AOTest.feature",
		
		glue = { "com.ao.stepDefinitions" },
		plugin = { "pretty","html: target-output/htmlOutput",				
				"rerun:target/rerun/rerun.txt"},
				monochrome = true, dryRun= false, strict = true
		)

public class TestRunner{

}


