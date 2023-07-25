Feature: Gear Test
  As a user I should add product successfully to shopping cart

  @smoke, @regression
    Scenario: I should be able to add products successfully to shopping cart
    Given I am on homepage
    When I mouse hover on gear menu
    And I click on bags
    And I click on product name overnight duffle
    And I verify the text overnight duffle
    And I change the quantity to three
    And I click on add to cart button
    And I verify the text You added Overnight Duffle to your shopping cart.
    And I click on shopping cart link in the message
    And I verify the product name overnight duffle
    And I verify the quantity is three
    And I verify the product price is "$135.00"
    And I change quantity to five
    And I click on update shopping cart button
    Then I verify the updated product price is "$225.00"

