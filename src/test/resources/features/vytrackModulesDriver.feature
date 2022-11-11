Feature: Vytrack Home Page Drivers Modules visibility.
  User Story: As a driver, I should be accessing all the main modules of the app.
  Drivers should view 4 module names: Fleet, Customers, Activities, System

  @smoke
  Scenario Outline: For drivers result verification
    Given Driver is on login page
    When Driver enters "<driverUserName>" into Username box and pushes Enter
    And Driver enters "<driverPassword>" into Password box
    Then Driver see home page with four modules
    Then Driver logs out
    Examples:
      | driverUserName | driverPassword |
      | user19         | UserUser123    |
      | user20         | UserUser123    |
      | user21         | UserUser123    |
      | user22         | UserUser123    |
      | user23         | UserUser123    |
      | user24         | UserUser123    |