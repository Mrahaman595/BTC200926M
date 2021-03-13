Feature: Login verfication 

Background: 
Given open browser 
|chrome|
|firefox|
|ie|
And nevigate to url 
Scenario: login user with verfication cerditionals 

When User type userID  textBOX 
And user type password in passwordBox 
And user click on login button 
Then user should be in his profile page 

Scenario Outline: login user with verfication cerditionals 


When User type "<userID>"  textBOX 
And user type "<password>" in passwordBox 
And user click on login button 
Then user should not be in his profile page 

Examples: 
|userid| password| 
|user1| ds2334| 
|user2| dsf3| 
