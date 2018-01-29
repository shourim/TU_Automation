package com.cucumberrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "./src/test/resources/features",
                 glue = {"com.stepdefination"},
                 
                 plugin= {"html:target/cucumber-html-report","json:target/cucumbeer.json"},
                 tags= {"@Test"})
        

public class TestRunner {
	
}
