Feature: as a user i should ba able to access dashboard
  @Test
  Scenario: as a user i should be able to login
    Given user on login page
    When user enters credentials
    And user clicks sign in button
    Then user should see dashboard