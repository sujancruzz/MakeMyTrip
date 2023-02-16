package com.kumaran.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "/BddCucumber/src/test/resources/features", glue = "com.kumaran.stepDefinition" )
	
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
