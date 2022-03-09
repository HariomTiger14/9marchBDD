package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
	features = "/Users/hariombhatia/eclipse-workspace-new/BDD/src/test/java/featues/Login.feature"
	,glue= {"step_definitions"},
	plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
    "junit:junit_xml/cucumber.xml" }, 
	tags= "@Login3",	
monochrome = true, 
dryRun = false
)


public class Runner {
	

}
