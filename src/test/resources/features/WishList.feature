Feature: Wish List


  Scenario: 4.3. From the Product page, there should be a link "Add to Wish List" with a heart icon to add the item to the Wish list
    Given
    When User clicks on one section from Product menu
    And User clicks on one product from Product page
    And User navigates to Wish List icon
    And User clicks on Add to Wish List icon
    Then Item is added to Wish List

