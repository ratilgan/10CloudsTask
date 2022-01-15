
Feature: Searching for open QA Engineer roles in 10clouds

  Background:
    Given the user navigates to 10clouds home page
    And clicks on "Careers" tab

    Scenario: Validating open QA Automation Engineer roles in Careers page
      Then validate that there is 3 "QA Automation Engineer" role open

    @wip
    Scenario: Validating open QA roles in Careers page
      When the user selects "QA" from All departments dropdown
      Then validate that each result contains "QA Automation" or "QA Engineer" in the title

