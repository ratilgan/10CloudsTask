@wip
Feature: Searching for open QA Engineer roles in 10clouds

  Background:
    Given the user navigates to 10clouds home page
    And clicks on Careers tab

    Scenario: Validating open QA Automation Engineer roles in Careers page
      Then validate that there is 3 "QA Automation Engineer" role open

    Scenario: Validating open QA roles in Careers page
      When the user selects "QA" from All departments dropdown
      Then validate that each result contains "QA Automation" or "QA Engineer" in the title

    # This scenario is from the task, but I think it needs to be updated.
    # I have again put it here, with using assertFalse method to show that it is not valid anymore.
    # There are 3 QA Automation Engineer roles open on the Careers page
    Scenario: Validating open QA Automation Engineer role in Careers page
      Then validate that there is NOT 1 "QA Automation Engineer" role open

