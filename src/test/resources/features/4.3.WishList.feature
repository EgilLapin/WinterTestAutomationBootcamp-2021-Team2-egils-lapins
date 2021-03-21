Feature: Wish List from Product page


@Desktops
  Scenario: 4.3. From the Product page, there should be a link "Add to Wish List" with a heart icon to add the item to the Wish list

    Given User opens Webpage
    When User clicks on Show All Desktops from Product menu
    And User clicks on one product from Desktops Product page
    And User navigates to Wish List icon
    And User clicks on Add to Wish List icon
    Then User see message
    And Item is added to Wish List

@Desktops @Mac
  Scenario: Mac
  Given User opens Webpage
  When User clicks on Mac from Product menu
  And User clicks on one product from Mac Product page
  And User navigates to Wish List icon
  And User clicks on Add to Wish List icon
  Then User see message
  And Item is added to Wish List

  @Components @Monitors
  Scenario: Monitors
    Given User opens Webpage
    When User navigates to Components and clicks on Monitors from Product menu
    And User clicks on one product from Monitors Product page
    And User navigates to Wish List icon
    And User clicks on Add to Wish List icon
    Then User see message
    And Item is added to Wish List


  @Tablets
  Scenario: Tablets
    Given User opens Webpage
    When User clicks on Tablets from Product menu
    And User clicks on one product from Tablets Product page
    And User navigates to Wish List icon
    And User clicks on Add to Wish List icon
    Then User see message
    And Item is added to Wish List

  @Phones&PDAs
  Scenario: Phones&PDAs
    Given User opens Webpage
    When User clicks on Phones&PDAs from Product menu
    And User clicks on one product from Phones&PDAs  Product page
    And User navigates to Wish List icon
    And User clicks on Add to Wish List icon
    Then User see message
    And Item is added to Wish List

  @Cameras
  Scenario: Cameras
    Given User opens Webpage
    When User clicks on Cameras from Product menu
    And User clicks on one product from Cameras Product page
    And User navigates to Wish List icon
    And User clicks on Add to Wish List icon
    Then User see message
    And Item is added to Wish List


  @MP3Players
  Scenario: MP3Players
    Given User opens Webpage
    When User clicks on Show All MPPlayers from Product menu
    And User clicks on one product from MPPlayers Product page
    And User navigates to Wish List icon
    And User clicks on Add to Wish List icon
    Then User see message
