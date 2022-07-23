package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="Cucumberfeature",
		glue="com.stepdefinition"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
