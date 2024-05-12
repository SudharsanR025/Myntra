Feature: Apply Coupon for Newly Registered User

Scenario: Attempt to Apply Coupon for Newly Registered User as an Old User
    Given the User lands on the Myntra homepage
    When the User clicks on the Hot Coupons section
    And the User navigates to the product listing page
    And the User selects a product
    Then the selected product opens in a new window
    When the User adds the product to the shopping bag
    And proceeds to checkout
    And the User attempts to apply a coupon code for newly registered users
    Then an error message should be displayed indicating that the coupon code is only valid for newly registered users
    
