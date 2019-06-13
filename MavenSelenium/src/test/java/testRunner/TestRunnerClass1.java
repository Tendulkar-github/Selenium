package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) // this will make the runner to run only in junit cucumber
@CucumberOptions( // this will map the feature and step definition with runner 
		features= "src/test/java/feature", // pass the location of the feature file we can pass the package name where all the features file are located 
		glue="stepDefenition" // pass the step definition we should past the step definition and feature in same parent (same folder)
		)
public class TestRunnerClass1 extends AbstractTestNGCucumberTests{ // AbstractTestNGCucumberTests class will provide the support to run Cucumber in TestNG

	
}
