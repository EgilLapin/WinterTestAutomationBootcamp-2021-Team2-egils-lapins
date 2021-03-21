Feature: As a user i should be able to see subcategories when hovering over categories list

  Background:
    Given User navigate to home page

  @7_2DropDownMenu
  Scenario: Categories should be present on all pages as drop-down menu with subcategories
    Then User hover over Desktop dropdown
    Then User hover over Laptops_Notebooks drop down
    Then User hover over Components drop down
    Then User hover over Tablets drop down
    Then User hover over Software drop down
    Then User hover over Phones_PDAs drop down
    Then User hover over Cameras drop down
    Then User hover over MP3 Players drop down

