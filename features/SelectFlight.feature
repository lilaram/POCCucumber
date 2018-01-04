Feature: select flight page functionality.

Scenario: Validate the labels available on select flight page.
  Given   login to mercury tours site.
  When    Click on the continue button of flight finder page.
  Then    Select flight page display with label Depart and return
  And     close the browser.