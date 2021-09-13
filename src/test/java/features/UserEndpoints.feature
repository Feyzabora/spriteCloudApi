@UserEndpoints
Feature: Endpoint Tests
  Scenario: Add user as a List
    * I post users as list:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Bora      | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 200    |
      | 02 | Umutayb  | Umut       | Bora      | umutaybora@gmail.com   | fhsdfgwd | 5550097450 | 200    |
      | 03 | Nuraybr  | Nur        | Bora      | nur.bora@gmail.com     | hjuydfgh | 5550047255 | 0      |

  Scenario: Add user as an Array list
    * I post users as an array list:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Bora      | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 200    |
      | 02 | Umutayb  | Umut       | Bora      | umutaybora@gmail.com   | fhsdfgwd | 5550097450 | 200    |
      | 03 | Nuraybr  | Nur        | Bora      | nur.bora@gmail.com     | hjuydfgh | 5550047255 | 0      |

  Scenario: Update users
    * I post users as list:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Melon     | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 200    |
    * I get user named Feyzabr
    * I update user:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Bora      | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 0      |
    * I get user named Feyzabr

  Scenario: Get & print user
    * I get user named Feyzabr

  Scenario: The user logs into system
    * I logged in with user Feyzabr and password zxcbqwer

  Scenario: The user logs out
    * User Feyzabr logs out

  Scenario: Delete user
    * I delete user named Feyzabr
    * I delete user named Umutayb
    * I delete user named Nuraybr