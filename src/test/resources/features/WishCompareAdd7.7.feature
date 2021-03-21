Feature: As a user in lists i should be able to add products on wish lists, cart and to compare them

  Background:
    Given User navigate to home page and log in

    @7_7WishCompareAdd
Scenario: Products in the list can be added to Wish List, Compare and Add to Cart
      Then Users hover over Desktop dropdown
      Then Users click on Mac option
      Then User click on Add to cart button
    Then User click on Add to wish list button
      Then User click on Compare This Product button