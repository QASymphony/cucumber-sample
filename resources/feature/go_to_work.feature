Feature: During the week every person should go to work, but should not go in the weekends.

  Background:
    Given There is a person

  Scenario: It is Monday morning  => PASSED
    And it is not weekend
    When the alarm rings
    Then the person should get up and go to work

  Scenario: It is Saturday morning  => PASSED
    And it is weekend
    When the alarm rings
    Then the person should not get up and go to work