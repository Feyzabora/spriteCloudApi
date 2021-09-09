Feature: Endpoint Tests
  Scenario: Add user
    * I post users as:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Bora      | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 200    |
      | 02 | Umutayb  | Umut       | Bora      | umutaybora@gmail.com   | fhsdfgwd | 5550097450 | 200    |
      | 03 | Nuraybr  | Nur        | Bora      | nur.bora@gmail.com     | hjuydfgh | 5550047255 | 0      |
