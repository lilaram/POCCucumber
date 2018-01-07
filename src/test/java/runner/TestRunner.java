package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"features"},
glue={"com.stepdefination.stepfiles"},
format={"json:target/cucumber.json","html:target/site/cucumber-pretty"},
tags={"@e2e"}
//dryRun=true
		)
public class TestRunner  {

}
