Feature: Login

  Scenario Outline:  Login
    Given I am to website
    When I type "<logon>" as login
    And I type "<password>" as password
    And I press login button
    Then <expectedResult>
    Examples:
      | logon     | password             | expectedResult       |
      | tomsmith  | SuperSecretPassword! | I am logged in       |
      | johnsmith | SuperSecretPassword! | I am not logged in 1 |
      | tomsmith  | Incorret password    | I am not logged in 2 |
      | johnsmith | Incorret password    | I am not logged in 3 |