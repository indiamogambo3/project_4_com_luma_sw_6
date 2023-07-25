Feature: Mens Test
  As a user I want to add products successfully to shopping cart

  @smoke, @regression
  Scenario: I should add products successfully to shopping cart
    Given I am on homepage
    When I mouse hover on men menu
    And Mouse hover on bottoms
    And I click on pants
    And I mouse hover on product name Cronus Yoga Pant and click on size 32
    And I mouse hover on product name Cronus Yoga Pant and click on colour black
    And I mouse hover on product name Cronus Yoga Pant and click on add to cart button
    And I verify the text You added Cronus Yoga Pant to your shopping cart.
    And I click on shopping cart link in the message
    And I verify the text shopping cart
    And I verify the product name Cronus Yoga Pant
    And I verify the product size 32
    Then I verify the product colour black


