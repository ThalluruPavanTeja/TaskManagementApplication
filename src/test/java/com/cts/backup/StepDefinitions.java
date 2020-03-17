package com.cts.backup;

import java.util.List;

import org.junit.Assert;

import com.cts.base.LaunchingWebDriver;
import com.cts.pages.AdministrationPage;
import com.cts.pages.PriorityListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	@Given("I have a browser with Administration Page")
	public void i_have_a_browser_with_Administration_Page() {
			
			LaunchingWebDriver.setUp();
			LaunchingWebDriver.driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("I enter the employee details")
	public void i_enter_the_employee_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Then("new Employee should be added in the Employee List")
	public void new_Employee_should_be_added_in_the_Employee_List() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select employee {string} and  edited name as {string}")
	public void i_select_employee_and_edited_name_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("edited Employee details should be added in the Employee List")
	public void edited_Employee_details_should_be_added_in_the_Employee_List() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select employee {string} and  deleted the Employee")
	public void i_select_employee_and_deleted_the_Employee(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Employee details should be deleted from the Employee List")
	public void employee_details_should_be_deleted_from_the_Employee_List() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter Priority as  {string} and clicking add button")
	public void i_enter_Priority_as_and_clicking_add_button(String priorityText) {
	   AdministrationPage.clickingPriorities(LaunchingWebDriver.driver);
		PriorityListPage.addingPriority(LaunchingWebDriver.driver, priorityText);
	}

	@Then("{string} should be added in the Priority List")
	public void should_be_added_in_the_Priority_List(String priorityText) {
		List<String> cellData= PriorityListPage.assertionData(LaunchingWebDriver.driver);
		   for (String value : cellData)
		   {
			   if(value.equals(priorityText))
			   {
				   Assert.assertTrue("Assertion Failed",value.equals(priorityText));
		   }
			   else
			   {
				   Assert.fail("Assertion Failed");
			   }
		}
	}

	@When("I select Priority {string} and  edited priority as {string}")
	public void i_select_Priority_and_edited_priority_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} edited Priority details should be added in the Priority List")
	public void edited_Priority_details_should_be_added_in_the_Priority_List(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select Priority {string} and  deleted the priority")
	public void i_select_Priority_and_deleted_the_priority(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} Priority details should be deleted from the Priority list")
	public void priority_details_should_be_deleted_from_the_Priority_list(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter Project as  {string} and clicking add button")
	public void i_enter_Project_as_and_clicking_add_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} should be added in the Project List")
	public void should_be_added_in_the_Project_List(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select Project {string} and  edited Project as {string}")
	public void i_select_Project_and_edited_Project_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} edited Project details should be added in the Project List")
	public void edited_Project_details_should_be_added_in_the_Project_List(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select Project {string} and  deleted the project")
	public void i_select_Project_and_deleted_the_project(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} Project details should be deleted from the Project list")
	public void project_details_should_be_deleted_from_the_Project_list(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter Status as  {string} and clicking add button")
	public void i_enter_Status_as_and_clicking_add_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} should be added in the Status List")
	public void should_be_added_in_the_Status_List(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select Status {string} and  edited status as {string}")
	public void i_select_Status_and_edited_status_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} Edited status details should be added in the status List")
	public void edited_status_details_should_be_added_in_the_status_List(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select Status {string} and  deleted the status")
	public void i_select_Status_and_deleted_the_status(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} Status details should be deleted from the Status list")
	public void status_details_should_be_deleted_from_the_Status_list(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter Type as  {string} and clicking add button")
	public void i_enter_Type_as_and_clicking_add_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} should be added in the Type List")
	public void should_be_added_in_the_Type_List(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("I select Type {string} and  edited Type as {string}")
	public void i_select_Type_and_edited_Type_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} edited Type details should be added in the Type List")
	public void edited_Type_details_should_be_added_in_the_Type_List(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select Type {string} and  deleted the Type")
	public void i_select_Type_and_deleted_the_Type(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} Type details should be deleted from the Types list")
	public void type_details_should_be_deleted_from_the_Types_list(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
