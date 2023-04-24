Feature: Login

#  Scenario: Login password correct
#    Given I am to website
#    When I type "tomsmith" as login
#    And I type "SuperSecretPassword!" as password
#    And I press login button
#    Then I am logged in
#
#  Scenario:  Login password incorrect
#    Given I am to website
#    When I type "tomsmith" as login
#    And I type "Incorret password" as password
#    And I press login button
#    Then I am not logged in 1

  Scenario Outline:  Login
    Given I am to website
    When I type "<logon>" as login
    And I type "<password>" as password
    And I press login button
    Then <expectedResult>
    Examples:
      | logon     | password             | expectedResult       |
      | tomsmith  | SuperSecretPassword! | I am logged in       |
      | tomsmith  | Incorret password    | I am not logged in 1 |
      | johnsmith | SuperSecretPassword! | I am not logged in 2 |