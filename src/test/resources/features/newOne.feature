
Feature: Test Environment Retail Page

Background: 
    Given User is on test environment homepage
    When user click on myaccount button

  Scenario: Login to Test Environment Retail Page
   	Then user click on login button
    Then user enter username and password
    Then user click on login button to login to the page

    @smoketest
    Scenario Outline: Login to Test environment Retail Page
    Then user click on login button
    Then user enter '<username>' and '<password>'
    Then user click on login button to login to the page
    
    Examples:
    |username | password|
    |eagles@tekschool.us|eagles|
    |hawks@tekschool.us|hawks|
    |falcons@tekschool.us|falcons|
    