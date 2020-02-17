 Feature: Hello World
 
  Scenario: Say hello => PASSED
  Given I have a hello app with "Howdy"
  When I ask it to say hi
  Then it should answer with "Howdy World"

  Scenario: Welcome John => PASSED
  Given I have a hello app with "Welcome"
  When I ask it to say hi
  Then it should answer with "Welcome John"

