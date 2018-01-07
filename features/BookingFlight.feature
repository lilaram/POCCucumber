Feature: Book flight from mercury tours site.

  @e2e
  Scenario: Validate that able to book flight on mercury tours.
    Given login to mercury tours site.
    When provides below information on Flight finder page
      | Passengers | Departing_From | Arriving_In | Returning | Preferences_class | AirLine         |
      |          1 | London         | Paris       | February  | First Class       | Pangea Airlines |
    And click on the continue button
    And select pangea airlines 362 and click on the continue button.
    And provide below information of taveler on book flight page.
      | FirstName | LastName | Meal  | Number |
      | Shyam     | Patil    | Bland | 224211 |
    And click on the secure purchase button.
    Then Flight Confirmation page is display with details of booked flight.
    And close the browser. 