Feature: Browse 7.1
  One Product should belong to one Category (and not mandatory to one Sub-Category)

  Background:
    Given I am on web shop page

  Scenario: to find Products, that belong to more then one Category
    Given I make a list of Desktop Category products
    Then I make a list of Laptops Category products
    And I make a list of Components Category products
    And i make a list of Tablets Category products
    And I make a list of Software Category products
    And I make a list of Phones Category products
    And I make a list of Cameras Category products
    And I make a list of MP3 Players Category products
    Then I compare list to find repetitive Products