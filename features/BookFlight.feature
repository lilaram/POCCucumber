Feature: Book flight page functionality

Scenario: Validate the labels available on Book flight page.
  Given   login to mercury tours site.
  When    Click on the continue button of flight finder page.
  And     Click on the continue button of select flight page.
  Then    Book  flight page display with summary and passenger details label.
  And     close the browser.