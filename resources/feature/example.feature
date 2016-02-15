Feature: Example of a feature file
  As some aspiring cuke4duke user
  I want an example of how it works
  So that I can easily setup my project to use it

  # This should pass
  Scenario: A simple passing scenario => PASSED
    Given the letter "A"
    When I check the letter
    Then the letter should be "A"

  # This should fail
  Scenario: A simple passing scenario => FAILED
    Given the letter "E"
    When I check the letter
    Then the letter should be "A"