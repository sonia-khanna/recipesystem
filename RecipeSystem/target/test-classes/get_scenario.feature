@get
Feature: get request  test

  @getAll
  Scenario: get all recipes
    Given ReciepeSystem is up "http://localhost:8080"
    When a user performs a get request to "/recipes"
    Then the response code is 200

  @getRecipeOfParticularID
  Scenario: get all recipes
    Given ReciepeSystem is up "http://localhost:8080"
    When a user performs a get request to "/recipes/1"
    Then the response code is 200