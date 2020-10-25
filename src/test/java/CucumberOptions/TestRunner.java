package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/java/features" },
		glue = {"stepDefinition"},
		tags =  {"@seleniumTest"},
		monochrome=true,
		plugin = {"pretty","html:target/cucumber.html", "junit:target/cucumber.xml" }
		)

public class TestRunner {
	
}