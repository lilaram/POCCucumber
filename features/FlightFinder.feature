Feature: flight finder page functionality.

  Scenario: Validate the labels available on flight finder page.
  Given   login to mercury tours site.
  When    flight finder page displays
  Then    user is able to see label Type,Passengers, Departing From, On,Arriving In, Returning, Service class,Airline
  And     close the browser.