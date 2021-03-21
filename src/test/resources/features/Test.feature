Feature: Testing count of products

  @TestMac @DesktopsCategory
  Scenario: Mac subcategory
    Given User navigates to Mac List page
    Then Count of products is displayed Mac List Page

  @TestPC @DesktopsCategory
  Scenario: PC subcategory
    Given User navigates to PC List page
    Then Count of products is displayed PC List Page


  @TestMacs @LaptopsNotebooksCategory
  Scenario: Macs subcategory
    Given User navigates to Macs List page
    Then Count of products is displayed Macs List Page

  @TestWindows @LaptopsNotebooksCategory
  Scenario: Windows subcategory
    Given User navigates to Windows List page
    Then Count of products is displayed Windows List Page


  @MiceAndTrackballs @ComponentsCategory
  Scenario: MiceAndTrackballs subcategory
    Given User navigates to MiceAndTrackballs List page
    Then Count of products is displayed MiceAndTrackballs List Page

  @Monitors @ComponentsCategory
  Scenario: Monitors subcategory
    Given User navigates to Monitors List page
    Then Count of products is displayed Monitors List Page

  @Printers @ComponentsCategory
  Scenario: Printers subcategory
    Given User navigates to Printers List page
    Then Count of products is displayed Printers List Page

  @Scanners @ComponentsCategory
  Scenario: Scanners subcategory
    Given User navigates to Scanners List page
    Then Count of products is displayed Scanners List Page

  @WebCameras @ComponentsCategory
  Scenario: WebCameras subcategory
    Given User navigates to WebCameras List page
    Then Count of products is displayed WebCameras List Page