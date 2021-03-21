Feature: As a registered user I should be able to add products to Wish List

  Background:
    Given Logged in user opens Webpage

  @4.1.1WishlistIconPresent
  Scenario: 4.1.1 Wish List link should be present on the top menu and show the count of items in the Wish List
    Then WishList Icon is seen

  @4.1.2WishListIconFromProductCategoryPages
  Scenario Outline:4.1.1 Wish List link should be present on the top menu and show the count of items in the Wish List from all product categoty pages
    When User Navigates to <categoryName> and <subCategoryName> Lists Page
    Then WishList Icon is seen

    Examples:
      | categoryName | subCategoryName |
      | MP3 Players  | test 18         |
      | Cameras      | -               |
      | Phones       | -               |
      | Software     | -               |
      | Tablets      | -               |
      | Components   | Monitors        |
      | Laptops      | Mac             |
      | Desktops     | Mac             |

  @4.2AddItemToWishlist
  Scenario Outline: 4.2 Add the item to the Wish List by  a link "Add to Wish List" from the Products List page    Given user opens Webpage
    When User Navigates to <categoryName> and <subCategoryName> Lists Page
    And user clicks Add to Wishlist icon
    Then item gets added to wishlist

    Examples:
      | categoryName | subCategoryName |
      | Tablets      | -               |
      | Phones       | -               |
      | Components   | Monitors        |
      | Desktops     | Mac             |

  @4.3AddItemFromProductPage
  Scenario: 4.3. From the Product page, there should be a link "Add to Wish List" with a heart icon to add the item to the Wish list
    When user opens product page
    And user clicks Add to Wishlist icon
    Then item gets added to wishlist

  @4.4WishlistDisplaysItems
  Scenario: 4.4 Wish List should display all items added by the User
    When user clicks Add to Wishlist icon
    And User opens Wishlist
    Then Items added are displayed

  @4.5RemoveItemFromWishlist
  Scenario: 4.5.On the Wish List page, there should be an option to remove the item from the list by clicking the "Remove" icon
    When user clicks Add to Wishlist icon
    And User opens Wishlist
    And User clicks on Remove button
    Then Item is removed from Wish List

  @4.6AddToCartFromWishlist
  Scenario: 4.6. On the Wish List page, there should be an option to add this item to the cart by clicking the "Add to cart" icon
    When user clicks Add to Wishlist icon
    And User opens Wishlist
    And User click on Add to Cart button
    Then Item is added to Cart



