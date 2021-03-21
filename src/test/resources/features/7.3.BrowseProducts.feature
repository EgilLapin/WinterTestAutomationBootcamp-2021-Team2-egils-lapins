Feature:  7.3.Each subcategory button should contain a count of available products




Scenario: Count of available products in Desktops category


  Given User opens Webpage
  When User navigates To Product Menu
  And User clicks on Show All Desktops category
  Then User counts of products is displayed
  And User clicks on PC subcategory
  And User see message: "There are no products to list in this category."
  And User clicks on Mac subcategory
  Then User counts of products is displayed


  #Scenario: Count of available products in Laptops&Notebooks category


    #Given User opens Webpage
    #When User navigates To Product Menu
    #And User clicks on Show All Desktops category
   # Then User counts of products is displayed
    #And User clicks on PC subcategory
    #And User see message: "There are no products to list in this category."
    #And User clicks on Mac subcategory
   # Then User counts of products is displayed




