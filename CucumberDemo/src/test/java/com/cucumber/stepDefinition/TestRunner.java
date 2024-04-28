package com.cucumber.stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/cucumber/features/TagFeature.feature",
glue = {"src/test/java/com/cucumber/stepDefinition/TagStepDefinition"},
monochrome = true,
plugin = {"pretty","junit:target/HtmlReport/report.xml"},
tags = "@smoke"
		)
public class TestRunner {

}
