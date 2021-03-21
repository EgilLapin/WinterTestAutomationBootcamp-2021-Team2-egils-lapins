Feature: As a user i should see categories list on the left side of the browse page

 Background:
  Given User navigate to home page

@7_4CategoriesList

Scenario: Categories list is available on the left side of the browse page
Then User hover over Desktops dropdown
 Then User hover over dropdown menu
 And User click on PC
  And User click on Mac
  And User click on Laptops Notebooks
  And User click on Macs
  And User click on Windows
  And User click on Components
  And User click on Tablets
  And User click on Software
  And User click on Phones PDAs
  And User click on Cameras
  And User click on MP3 Players
