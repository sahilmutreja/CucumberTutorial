@Feature1
Feature: Feature to test cucumber functions

  Background: This is executed for every scenario
    Given I print a message

  Scenario: This is simple scenario
    Given I print shared variable

  @ConstantParams
  Scenario: This is an example of passing constant values as params
    Given name is "sahil" and number is "96641"

  @DataTable
  Scenario:
    Given I enter following info
      | Fields | Values |
      | name   | Sahil  |
      | empId  | 5219   |

  @ScenarioOutline
  Scenario Outline: Test addition with multiple values
    Given <Num1> and <Num2> are entered.
    When a is added to b and output is stored in c
    Then c is equal to sum of a and b
    Examples:
      | Num1 | Num2 |
      | 2    | 2    |