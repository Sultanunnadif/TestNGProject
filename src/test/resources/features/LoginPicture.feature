Feature: Login with picture to compare
  Scenario: Basic Login True Test
    Given i am on the login page
    When i enter my username "standard_user"
    And  i enter my password "secret_sauce"
    And  i click on the login button
    Then i should see the products page
    And take screenshot

  Scenario: Basic Login False Test
    Given i am on the login page
    When i enter my username "problem_user"
    And  i enter my password "secret_sauce"
    And  i click on the login button
    Then i should see the products page
    And take problem screenshot
    Then Compare Pictures