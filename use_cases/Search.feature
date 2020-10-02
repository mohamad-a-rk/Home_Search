Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
               
               
  Scenario Outline: Search home by type
  When I search about home by ""HOUSE
  Then A list of homes that matches the  type specification should be returned and printed on the console

    Scenario: Search about home with less than a specific price
    When I search about home with price less than 400 
    Then A List of homes that matches the specification should be printed
    Scenario: Search about home with specfic number of bed rooms
    When I search about home with 3 bed rooms
    Then A List of homes that matches the specification should be printed
      Scenario: Search about home with specfic number of bathrooms
    When I search about home with 2 bathrooms
    Then A List of homes that matches the specification should be printed
      Scenario: Search about home that allows pets
    When I search about home that allows pets
    Then A List of homes that matches the specification should be printed
      Scenario: Search about home with specfic lease length 
    When I search about home with 6 months of lease 
    Then A List of homes that matches the specification should be printed
      Scenario: Search about home with with a specific amentie 
    When I search about home that has an "fireplase"
    Then A List of homes that matches the specification should be printed