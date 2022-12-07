Feature: feature1
Background: bg1
Given user is on "Execute Automation" page
When user clicks on "login" button
Then system should display "Execute Automation" page

Scenario: check availability
Given check "Title"
|select|
|Mr|
|Ms|
And check Gender
|Male|
|Female|
And check Languages Known
|English|
|Hindi|

Scenario: validation
Given user is on "Execute Automation" page
When user selects "Mr" in Title
And user enters "krishna" in Initial
And user enters "Raghu" in First Name
And user enters "Seresh" in Middle Name
And select "Male"
And check "English"
And click on "Save"
Then system should display "Execute Automation" page
