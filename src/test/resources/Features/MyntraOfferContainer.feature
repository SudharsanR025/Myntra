Feature: Latest Offers Container Icon on Myntra Homepage

  Scenario: Check visibility and accessibility of Container icon
    Given User lands on Myntra Homepage
    When User hovers over the Container icon
    Then Latest Offers should be displayed
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    And Close the browser

  Scenario: Check the Resizing functionality of Container Icon
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When User clicks the Container Icon again
    Then The List of offers should close
    And Close the browser

  Scenario: Check the Sharing functionality of the Offer in Container Icon
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When user clicks the share button
    And User selects the Facebook icon
    Then User should navigate to the Facebook page
    And Close the browser

  Scenario: Check if Offers in the list redirect to the related page
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When User clicks the first Offer
    Then User should redirect to the Related Products page
    And Close the browser

  Scenario: Check the presence of Time container for the latest products
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When User clicks the first Offer
    Then User should redirect to the Related Products page
    And User should see the time container at the top of the page
    And Close the browser

  Scenario: Check if User can filter Offers by Category
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When User selects a specific category filter
    Then Offers in the list should be filtered accordingly
    And Close the browser

  Scenario: Check if User can sort Offers by Price
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When User selects the price sorting option
    Then Offers in the list should be sorted by price
    And Close the browser

  Scenario: Check if User can apply Discount Coupons to Offers
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When User applies a discount coupon to an offer
    Then User should see the discounted price reflected
    And Close the browser

  Scenario: Check if User can add Offers to Wishlist
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When User adds an offer to the wishlist
    Then Offer should be added to the User wishlist
    And Close the browser

  Scenario: Check if User can view Product Details from Offer
    Given User lands on Myntra Homepage
    When User clicks the Container Icon
    Then User should see the List of Latest Offers
    When User clicks on an offer to view details
    Then User should see the details of the selected product
    And Close the browser
