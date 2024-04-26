package com.cucumber.stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/cucumber/features",
glue = {"src/test/java/com/cucumber/stepDefinition"},
monochrome = true,
plugin = {"pretty","html:target/HtmlReport"}

		)
public class TestRunner {

}
