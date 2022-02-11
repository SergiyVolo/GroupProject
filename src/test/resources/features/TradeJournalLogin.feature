@tag
Feature: TradeJournal Login
  I want to be able to login with valid credentials.
  
   #Salam
  @TradeJournalLogin
  Scenario: User should be directed to sign in page
  Given I am on TradeJournal sign in page
  And The sign in button displays
  When  I enter valid username "Salam" and valid password "SuperSalam123!"
  And I click on sign in button
  Then I should be directed to home page
  
  
  
  
    