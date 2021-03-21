Feature: Wish List


  Scenario: 4.5 On the Wish List page,
  there should be an option to remove the item from the list by clicking the "Remove" icon
  Set up in a Page :

    Given I am on Login page
    When enter EMail "(arg1)"
    And enter password "(arg2)"


    Given User opens Webpage
    When User clicks on any part category from Product menu
    And User clicks on one product from Product page
    And User click on product heart icon
    And User navigates to Wish List icon
    And User clicks on "Remove" button
    Then Item is removed from Wish List
