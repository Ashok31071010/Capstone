package Cucumber.Capstone;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	
@RunWith (Cucumber.class)
	
	@CucumberOptions(
	    features = "/Capstone/src/test/java/feature", // Path to your feature files
	    glue = {"stepDefinition"}, // Package where step definitions are located
	    plugin = {"pretty", "html:target/cucumber-reports"}, // Report plugins
	    tags = "@smoke", // Tags to execute (if any)
	    dryRun = true // Fail if there are undefined or pending steps
	)
	public class CucumberTestRunner  {
	    // This class will be empty
	}


}
