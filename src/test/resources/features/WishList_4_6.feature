Feature: WishList 4.6
  Add item to the cart by clicking the "Add to cart" icon from Wish list page

  Background:
    Given I am on Login page
    When enter EMail "(arg1)"
    And enter password "(arg2)"

  @Scenario1
  Scenario: add Products from Desktop/Mac category from Wish List to Cart
    Given navigate to Desktop_Mac Category page
    When add to Wish List a Desktop Category product
    Then navigate to Wish List page with products added
    And click on Add to Cart button
    And navigate to Cart page with products added
    And check if Desktop Category product is added to Cart

  @Scenario2
  Scenario: add Products from Tablets category from Wish List to Cart
    Given navigate to Tablets Category page
    When add to Wish List a Tablets Category product
    Then navigate to Wish List page with products added
    And click on Add to Cart button
    And navigate to Cart page with products added
    And check if Tablets Category product is added to Cart

  @Scenario3
  Scenario: add Products from Phones category from Wish List to Cart
    Given navigate to Phones Category page
    When add to Wish List a Phones Category product
    Then navigate to Wish List page with products added
    And click on Add to Cart button
    And navigate to Cart page with products added
    And check if Phones Category product is added to Cart

  @Scenario4
  Scenario: add Products from MP3Players category from Wish List to Cart
    Given navigate to MP3Players Category page
    When add to Wish List MP3Players Category product
    Then navigate to Wish List page with products added
    And click on Add to Cart button
    And navigate to Cart page with products added
    And check if MP3Players Category product is added to Cart
