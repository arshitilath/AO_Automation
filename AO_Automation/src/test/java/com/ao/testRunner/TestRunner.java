package com.ao.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Arshi Tilath
 * This class is a runner class to execute the AO automation feature with stepDefiniton file -ProductSearchTest.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/AO_Automation-master/AO_Automation/src/test/java/com/ao/features",
		
		glue = { "com.ao.stepDefinitions" },
		plugin = { "pretty","html: target-output/htmlOutput",				
				"rerun:target/rerun/rerun.txt"},
				monochrome = true, dryRun= false, strict = true
		)

public class TestRunner{

}



