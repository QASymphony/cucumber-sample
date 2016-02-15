  Feature: login to the system. As a user, I want to login into the system when I provide username and password

  Scenario: Verify that user can login to qTest site => PASSED
    Given I launch "http://192.168.74.69:8487/tc" page
    When I fill in "userName" with "nephelelocal@gmail.com"
        And I fill in "password" with "admin123"
        And I click on "logIn" button
    Then I should see text "Nephele Local" in right side pane
