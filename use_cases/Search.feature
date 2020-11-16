Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
               
               
  Scenario: Search home by type
  When I search about home by type "HOUSE"
  Then A List of homes that matches the specification should be printed
  And Send the result by email to "mohamad.kukhun@gmail.com"

    Scenario: Search about home with less than a specific price
    When I search about home with price less than 400 
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"   
  Scenario: Search home by Placement
    When I search about home by place "VILLAGE"
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"
 
  Scenario: Search home by Material
    When I search about home by material "WOOD"
    Then A List of homes that matches the specification should be printed  
    And Send the result by email to "mohamad.kukhun@gmail.com"
  Scenario: Search home with Price_Month
    When I search about home with price range 500 to 700
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"
  Scenario: Search home with less than a specific Area
    When I search about home with area  160
    Then A List of homes that matches the specification should be printed    
      And Send the result by email to "mohamad.kukhun@gmail.com"
   Scenario: Search home with range_area
    When I search about home with area range 150 to 200
    Then A List of homes that matches the specification should be printed   
    And Send the result by email to "mohamad.kukhun@gmail.com"
    Scenario: Search about home with specfic number of bed rooms
    When I search about home with 3 bed rooms
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"
      Scenario: Search about home with specfic number of bathrooms
    When I search about home with 2 bathrooms
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"
      Scenario: Search about home that allows pets
    When I search about home that allows pets
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"
      Scenario: Search about home with specfic lease length 
    When I search about home with 6 months of lease 
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"
      Scenario: Search about home with with a specific amentie 
    When I search about home that has an "FIREPLACE"
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"
    Scenario: Search about home with price less than a value and has specific count of bathrooms
    When I search about house that it price less than 300 and has 2 bathrooms 
    Then A List of homes that matches the specification should be printed
    And Send the result by email to "mohamad.kukhun@gmail.com"