
@Smoke @Regression @Functional
Feature: login function test

Background: 
Given open browser
And go to para bank application

  @Positive @TC-12
  Scenario: As parabank user, login should success with valid credential
    
    When put valid username
    And put valid password
    And click login button
    Then login should pass logout button should visible
    
    
   @Negative @TC-13
  Scenario: As parabank user, login should fail with invalid credential
    
    When put invalid username
    And put invalid password
    And click login button
    Then login should fail and error msg contains an internal error has occured and has been logged
    
    @Negative @TC-14
  Scenario: As parabank user, login should fail with null credential
    
    When put null username
    And put null password
    And click login button
    Then login should fail and error msg contains please enter a username and password
   

 
