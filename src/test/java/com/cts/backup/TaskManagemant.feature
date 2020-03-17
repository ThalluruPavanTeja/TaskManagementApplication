Feature: Search
	In order create a webpage
	As a task manager
	I want to get access to the portal
	
Scenario: addingEmployeeTest
Given I have a browser with Administration Page
When I enter name as 'Harvey Specter' and I enter email as 'harvey@company.com' and I enter login as 'Harvey' 
And I enter Password as 'harvey@123' and I Select Security as 'Admin' and clicking on add button  
Then new employee should be added in the Employee List

Scenario: editingEmployeeTest
Given I have a browser with Administration Page
When I select employee 'Andrew Scott' and  edited name as 'New Andrew Scot'  
Then Edited employee details should be added in the Employee List

Scenario: deletingEmployeeTest
Given  I have a browser with Administration Page
When I select employee 'Arledge Archer' and  deleted the Employee
Then Employee details should be deleted from the employees list

Scenario: addingPrioritiesTest
Given I have a browser with Administration Page
When I enter Priority as  'New Priority' and clicking add button  
Then new priority should be added in the Employee List


Scenario: editingPrioritiesTest
Given I have a browser with Administration Page
When I select Priority 'Highest' and  edited priority as 'New Highest'  
Then Edited priority details should be added in the priority List

Scenario: deletingPriorityTest
Given  I have a browser with Administration Page
When I select Priority 'Normal' and  deleted the priority
Then Priority details should be deleted from the Priority list


Scenario: addingProjectsTest
Given I have a browser with Administration Page
When I enter Project as  'New Project' and clicking add button  
Then new project should be added in the Employee List


Scenario: editingProjectsTest
Given I have a browser with Administration Page
When I select Project 'Test Project' and  edited project as 'New Test Project'  
Then Edited project details should be added in the project List

Scenario: deletingProjectsTest
Given  I have a browser with Administration Page
When I select Project 'My Project' and  deleted the project
Then Project details should be deleted from the Project list

Scenario: addingStatusesTest
Given I have a browser with Administration Page
When I enter status as  'New Status' and clicking add button  
Then new Status should be added in the Employee List


Scenario: editingStatusesTest
Given I have a browser with Administration Page
When I select status 'On hold' and  edited project as 'New On hold'  
Then Edited status details should be added in the status List

Scenario: deletingStatusesTest
Given  I have a browser with Administration Page
When I select Project 'Open' and  deleted the project
Then Status details should be deleted from the Status list

Scenario: addingTypesTest
Given I have a browser with Administration Page
When I enter Type as  'New Type' and clicking add button  
Then new Status should be added in the Employee List


Scenario: editingTypesTest
Given I have a browser with Administration Page
When I select Type 'Issue' and  edited project as 'New Issue'  
Then Edited status details should be added in the status List

Scenario: deletingTypesTest
Given  I have a browser with Administration Page
When I select Type 'Task' and  deleted the project
Then Task details should be deleted from the Types list

