package com.cucumber.stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/cucumber/features/hookFeature.feature",
glue = {"src/test/java/com/cucumber/stepDefinition/HookSteps"},
monochrome = true,
plugin = {"pretty","junit:target/HtmlReport/report.xml"}
 
		)
public class TestRunner {

}
