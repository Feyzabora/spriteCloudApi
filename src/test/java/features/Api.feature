Feature: Endpoint Tests
  Scenario: Add user as a List
    * I post users as list:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Bora      | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 200    |
      | 02 | Umutayb  | Umut       | Bora      | umutaybora@gmail.com   | fhsdfgwd | 5550097450 | 200    |
      | 03 | Nuraybr  | Nur        | Bora      | nur.bora@gmail.com     | hjuydfgh | 5550047255 | 0      |

  Scenario: Get & print user
    * I get user named Feyzabr

  Scenario: Delete user
    * I delete user named Feyzabr

  Scenario: Add user as an Array list
    * I post users as an array list:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Bora      | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 200    |
      | 02 | Umutayb  | Umut       | Bora      | umutaybora@gmail.com   | fhsdfgwd | 5550097450 | 200    |
      | 03 | Nuraybr  | Nur        | Bora      | nur.bora@gmail.com     | hjuydfgh | 5550047255 | 0      |

  Scenario: Add user
    * I post a user as:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Bora      | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 200    |

  Scenario: Updating Users
    * I update users:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Kahya     | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 0      |
      | 02 | Umutayb  | Umut       | Kahya     | umutaybora@gmail.com   | fhsdfgwd | 5550097450 | 200    |
      | 03 | Nuraybr  | Nur        | Kahya     | nur.bora@gmail.com     | hjuydfgh | 5550047255 | 0      |
    * I get user named Feyzabr
    * I get user named Umutayb
    * I get user named Nuraybr
    * I update users:
      | ID | Username | First Name | Last Name | Email                  | Password | Phone      | Status |
      | 01 | Feyzabr  | Feyza      | Bora      | kahya.feyza@gmail.com  | zxcbqwer | 5550097450 | 0      |
      | 02 | Umutayb  | Umut       | Bora      | umutaybora@gmail.com   | fhsdfgwd | 5550097450 | 200    |
      | 03 | Nuraybr  | Nur        | Bora      | nur.bora@gmail.com     | hjuydfgh | 5550047255 | 0      |
    * I get user named Feyzabr
    * I get user named Umutayb
    * I get user named Nuraybr

  Scenario: The user logs into system
    * I logged with user Feyzabr and password zxcbqwer

  Scenario: The user logs out
    * User Feyzabr logs out
