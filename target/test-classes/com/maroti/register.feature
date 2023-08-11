Feature: Guru99 application

  Scenario: create account on guru99
    Given open guru99 application
    When click on register link
    And enter the required details of user
      | firstname | lastname | phone      | email              | address | city | state       | postalCode | country | username | password   | cnfPassword |
      | Maroti    | Pawar    | 9876543210 | maroti@example.com | Pune    | Pune | Maharashtra | 410000     | INDIA   | maroti   | maroti@123 | maroti@123  |
    Then click on register buttton