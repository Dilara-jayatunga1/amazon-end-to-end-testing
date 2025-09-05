Feature: To validate the Amazon aplication

Background:

Given Launch the Amazon web application
When close the pop up
Then it should navigate to the Home page

Scenario: To vallidate the Search functionality

Given User enter the Text in the Search Field
When click the search button
Then it should navigate to the search result page and display the relevant details