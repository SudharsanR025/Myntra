Feature: Adding products to the bag in myntra
@regression
  Scenario: Basic Add to Bag Functionality
    Given User is on product page
    When User enters Size of the product
    And User click add to bag button
    Then User should able to see the product added to the bag
    And close the browser
 @smoke
  Scenario: Add to Bag Functionality with Quantity selection
    Given User is on product page
    When User enters Size of the product
    And User click add to bag button
    Then User should able to see the product added to the bag
    When User select the quantity of the product
    Then User should see the quantity is added to the bag
    And close the browser
@sanity
  Scenario: Add to bag with color variations
    Given User lands on myntra home page
    When user search for specific product
    And apply colour as a filter
    Then User should see the products related to the colour
    When User select a product from the list
    And add size and add the product to the bad
    Then product shoiuld be added to the bag
    And close the browser
