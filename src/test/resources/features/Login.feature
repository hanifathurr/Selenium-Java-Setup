Feature: Login function

Scenario: Login with valid credentials
  Given The user is on the login page
  When The user enter the username "tester" and password "12345"
  Then The user redirected to the homepage