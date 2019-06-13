Feature: Application login
Scenario: Home page Default login
Given Intialize the Browser
And Navigate to "https:\\google.com" site
And Click on Login
When User enters username "" and password "" and logs in
Then Verify login is success


Scenario: Home page Default login
Given User is on loading page
When User login into applicaion with "hello" and "pass"
Then home page populated
And Cards are not displayed
