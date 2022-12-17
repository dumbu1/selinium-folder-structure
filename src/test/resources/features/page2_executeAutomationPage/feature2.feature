Feature: feature1
Background: bg1
Given user is on "Execute Automation" page
When user clicks on "Login" button
Then system should display "Execute Automation" page

Scenario: check availability
Given check Title
|Select|
|Mr.|
|Ms.|
And check Gender
|Male|
|Female|
And check Languages Known
|English|
|Hindi|