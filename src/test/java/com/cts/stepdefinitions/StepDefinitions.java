package com.cts.stepdefinitions;

import java.util.List;

import org.junit.Assert;

import com.cts.base.LaunchingWebDriver;
import com.cts.pages.AdministrationPage;
import com.cts.pages.HomePage;
import com.cts.pages.PriorityListPage;
import com.cts.pages.ProjectListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tlh.latlh.latlhs;

public class StepDefinitions {
	
	@Given("I have a browser with Administration Page")
	public void i_have_a_browser_with_Administration_Page() {
			
			LaunchingWebDriver.setUp();
			LaunchingWebDriver.driver.get("http://examples.codecharge.com/TaskManager/Default.php");
			HomePage.accountLogin("admin", "admin");
	}

	@When("I enter Priority as  {string} and clicking add button")
	public void i_enter_Priority_as_and_clicking_add_button(String priorityText) {
	   AdministrationPage.clickingPriorities(LaunchingWebDriver.driver);
		PriorityListPage.addingPriority(LaunchingWebDriver.driver, priorityText);
	}

	@Then("{string} should be added in the Priority List")
	public void should_be_added_in_the_Priority_List(String priorityText) {
		List<String> cellData= PriorityListPage.assertionData(LaunchingWebDriver.driver);
		
		if (cellData.contains(priorityText))
		{
			Assert.assertTrue("Assertion Failed",cellData.contains(priorityText));
		}
		else
		{
			Assert.fail("Assertion Failed");
		}
		LaunchingWebDriver.tearDown();
		
	}

	@When("I select Priority {string} and  edited priority as {string}")
	public void i_select_Priority_and_edited_priority_as(String editingPriority, String editingText) {
	   AdministrationPage.clickingPriorities(LaunchingWebDriver.driver);
	   PriorityListPage.editingPriority(LaunchingWebDriver.driver, editingPriority, editingText);
	}

	@Then("{string} edited Priority details should be added in the Priority List")
	public void edited_Priority_details_should_be_added_in_the_Priority_List(String editingText) {
		List<String> cellData= PriorityListPage.assertionData(LaunchingWebDriver.driver);
		
		if (cellData.contains(editingText))
		{
			Assert.assertTrue("Assertion Failed",cellData.contains(editingText));
		}
		else
		{
			Assert.fail("Assertion Failed");
		}
		LaunchingWebDriver.tearDown();
	}

	@When("I select Priority {string} and  deleted the priority")
	public void i_select_Priority_and_deleted_the_priority(String deletingPriority) {
	    AdministrationPage.clickingPriorities(LaunchingWebDriver.driver);
	    PriorityListPage.deletingPriority(LaunchingWebDriver.driver, deletingPriority);
	}

	@Then("{string} Priority details should be deleted from the Priority list")
	public void priority_details_should_be_deleted_from_the_Priority_list(String deletingPriority) {
		List<String> cellData= PriorityListPage.assertionData(LaunchingWebDriver.driver);
		
		if (cellData.contains(deletingPriority))
		{
			 Assert.fail("Assertion Failed");
		}
		else
		{
			System.out.println("Assertion passed ");
		}
		LaunchingWebDriver.tearDown();
	}

	@When("I enter Project as  {string} and clicking add button")
	public void i_enter_Project_as_and_clicking_add_button(String projectText) {
	    AdministrationPage.clickingProjects(LaunchingWebDriver.driver);
	    ProjectListPage.addingProject(LaunchingWebDriver.driver, projectText);
	}

	@Then("{string} should be added in the Project List")
	public void should_be_added_in_the_Project_List(String projectText) {
		List<String> cellData= ProjectListPage.assertionData(LaunchingWebDriver.driver);
		if (cellData.contains(projectText))
		{
			Assert.assertTrue("Assertion Failed",cellData.contains(projectText));
		}
		else
		{
			Assert.fail("Assertion Failed");
		}
		LaunchingWebDriver.tearDown();
	}

	@When("I select Project {string} and  edited Project as {string}")
	public void i_select_Project_and_edited_Project_as(String editingProject, String editingText) {
	    AdministrationPage.clickingProjects(LaunchingWebDriver.driver);
	    ProjectListPage.editingProject(LaunchingWebDriver.driver, editingProject, editingText);
	    
	}

	@Then("{string} edited Project details should be added in the Project List")
	public void edited_Project_details_should_be_added_in_the_Project_List(String editingText) {
		List<String> cellData= ProjectListPage.assertionData(LaunchingWebDriver.driver);
		if (cellData.contains(editingText))
		{
			Assert.assertTrue("Assertion Failed",cellData.contains(editingText));
		}
		else
		{
			Assert.fail("Assertion Failed");
		}
		LaunchingWebDriver.tearDown();
	}

	@When("I select Project {string} and  deleted the project")
	public void i_select_Project_and_deleted_the_project(String deletingProject) {
	    AdministrationPage.clickingProjects(LaunchingWebDriver.driver);
	    ProjectListPage.deletingProject(LaunchingWebDriver.driver, deletingProject);
	}

	@Then("{string} Project details should be deleted from the Project list")
	public void project_details_should_be_deleted_from_the_Project_list(String deletingProject) {
		List<String> cellData= ProjectListPage.assertionData(LaunchingWebDriver.driver);
		if (cellData.contains(deletingProject))
		{
			 Assert.fail("Assertion Failed");
		}
		else
		{
			System.out.println("Assertion passed ");
		}
		LaunchingWebDriver.tearDown();
	}
}


	