package com.cucumber.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookSteps {

	 @BeforeStep
	 public void setUp(){ 
	System.out.println("Before each Scenario");	 
	 } 
		
	 @Given("user navigates to Facebook")
	 public void user_navigates_to_Facebook() {
	 }

	 @When("I enter Username as {string} and Password as {string}")
	 public void i_enter_Username_as_and_Password_as(String string, String string2) {
	 }

	 @Then("login should be unsuccessful")
	 public void login_should_be_unsuccessful() {
	 }

@AfterStep 
public void cleanUp(){ 
	System.out.println("After each Scenario");	 
	
 } 

}
