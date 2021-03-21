Feature:  7.5.The browse page contains the list of products from this category

  @Test
  Scenario: Check products in Laptops&Notebooks category contains products from this category


    Given User opens Webpage
    When User clicks on Laptops&Notebooks
    And User clicks on Show All Laptops&Notebooks
    Then User checks Laptops&Notebooks products from this category


