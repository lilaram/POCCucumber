Feature: validate that new user is able to create acccount on mercury tours.

  Scenario: Validate that new user is able to register to mercury tours site.
    Given mercury tours web application open.
    When User click on the Register page
    Then Register page is display.
    And provide all the information as below to Register to mercury tours.
      | FirstName | LastName | Phone | Email         | Address | City | State       | postal code | country | Username | password | Confirm password |
      | testf     | testl    | 12345 | test@test.com | pune    | pune | maharashtra |      411055 | India   | testf123 | testf123 | testf123         |
    And Click on the submit button.
    Then Registration successful text with username is displayed.
