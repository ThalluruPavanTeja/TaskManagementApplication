$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Feature/TaskManagemant.feature");
formatter.feature({
  "name": "Search",
  "description": "\tIn order create a webpage\n\tAs a task manager\n\tI want to get access to the portal",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "addingPrioritiesTest",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "I have a browser with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_a_browser_with_Administration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Priority as  \u0027New Priority\u0027 and clicking add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_enter_Priority_as_and_clicking_add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Priority\u0027 should be added in the Priority List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.should_be_added_in_the_Priority_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "editingPrioritiesTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a browser with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_a_browser_with_Administration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Priority \u0027Highest\u0027 and  edited priority as \u0027New Highest\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_select_Priority_and_edited_priority_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Highest\u0027 edited Priority details should be added in the Priority List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.edited_Priority_details_should_be_added_in_the_Priority_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "deletingPriorityTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a browser with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_a_browser_with_Administration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Priority \u0027Normal\u0027 and  deleted the priority",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_select_Priority_and_deleted_the_priority(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Normal\u0027 Priority details should be deleted from the Priority list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.priority_details_should_be_deleted_from_the_Priority_list(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "addingProjectsTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a browser with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_a_browser_with_Administration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Project as  \u0027New Project\u0027 and clicking add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_enter_Project_as_and_clicking_add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Project\u0027 should be added in the Project List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.should_be_added_in_the_Project_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "editingProjectsTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a browser with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_a_browser_with_Administration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Project \u0027Test Project\u0027 and  edited Project as \u0027New Test Project\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_select_Project_and_edited_Project_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027New Test Project\u0027 edited Project details should be added in the Project List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.edited_Project_details_should_be_added_in_the_Project_List(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "deletingProjectsTest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a browser with Administration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_a_browser_with_Administration_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Project \u0027My Project\u0027 and  deleted the project",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_select_Project_and_deleted_the_project(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027My Project\u0027 Project details should be deleted from the Project list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.project_details_should_be_deleted_from_the_Project_list(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});