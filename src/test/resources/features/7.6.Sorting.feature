Feature: Testing sorting


  Scenario:
Given User navigates to the product list page page
When User navigates to Product List page
#And User clicks on Sort By box
And User clicks on Name ascending sorting
Then Products are sorted by their name in alphabetical order from A to Z
#When User clicks on "Name (Z-A)" sorting
#Then Products are sorted by their name in reverse alphabetical order from Z to A
#And User clicks on "Price (Low > High)" sorting
#Then Products are sorted by price from the lowest to the highest
#And User clicks on "Price (High > Low)" sorting
#Then Products are sorted by price from the highest to the lowest
#And User clicks on "Rating (Highest)" sorting
#Then Products are sorted by rating from the highest to the lowest
#And User clicks on "Rating (Lowest)" sorting
#Then Products are sorted by rating from the highest to the lowest
#And User clicks on "Model (A-Z)" sorting
#Then Products are sorted by model in alphabetical order from A to Z
#And User clicks on "Model (Z-A)" sorting
#Then Products are sorted by model in reverse alphabetical order from Z to A
#And User clicks on pagination button
#Then Pagination button is available