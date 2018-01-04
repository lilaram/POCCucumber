Feature: Login to Mercury Tours

  Scenario: Validate that User is able to login mercury tours with valid username and password.
    Given Open the URL of mercury tours.
    When user provide following username and password.
      | username | password |
      | batman   | batman   |
    And click on the submit button.
    Then user should sucessfully login to mercury tours site.
    And close the browser.
