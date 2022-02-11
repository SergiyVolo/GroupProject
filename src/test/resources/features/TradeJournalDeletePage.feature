@tag
Feature: TradeJournal delete functionality
  I want to be able to delete a raw/record

  #Sergiy
  @TradeJournalDelete
  Scenario: User should be able to delete a raw/record
    Given I am signed in with valid username "Sergiy" and password "SuperSergiy123!"
    And The delete button is displayed
    When I click delete button
    Then Message: "Are you sure you want to delete this record?" should be displayed
    When I click on Cancel
    Then modal should close without deleting the record from  the table view
    
