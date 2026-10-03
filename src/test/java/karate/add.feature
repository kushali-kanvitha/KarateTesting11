
Feature: Test JavaScript Addition API

  Scenario: Add two numbers successfully
    Given url 'http://localhost:3000/add'
    And param a = 10
    And param b = 20
    When method get
    Then status 200
    And match response.number1 == 10
    And match response.number2 == 20
    And match response.result == 30