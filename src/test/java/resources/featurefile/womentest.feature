Feature: Women Test
  As a user i want to verify the sort by product name filter

  @smoke, @regression
  Scenario: Verifying the sort by product name filter
    Given I am on homepage
    When I mouse hover on women menu
    And I mouse hover on tops
    And I click on jackets
    And I select sort by filter product name
    Then Verify the products name is displayed in alphabetical order

    @sanity, @regression
      Scenario: Verifying the sort by filter price
      Given I am on homepage
      When I mouse hover on women menu
      And I mouse hover on tops
      And I click on jackets
      And I select sort by filter price
      Then Verify the products price is displayed in low to high