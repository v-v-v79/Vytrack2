Feature: Vytrack Home Page Modules visibility.
  User Story: As a manager, I should be accessing all the main modules of the app.
  Store and sales managers should view 8 module names:
  Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, and System

  @smoke
  Scenario Outline: For store and sales managers result verification
    Given Manager is on login page
    When Manager enters "<managerUserName>" into Username box and pushes Enter
    And Manager enters "<managerPassword>" into Password box and pushes Enter
    Then Manager see home page with eight modules
    Then Manager logs out
    Examples:
      | managerUserName | managerPassword |
      | storemanager63  | UserUser123     |
      | storemanager64  | UserUser123     |
      | storemanager65  | UserUser123     |
      | storemanager66  | UserUser123     |