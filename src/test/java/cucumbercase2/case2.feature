Feature: TestMe Login

I want to Login using




 
Scenario Outline: opening the login

Given Open Site in browser
 
And Enter the <login> and <Password>
 
Then Click on login 



 
Examples: 
 
|login  | Password  |
|Lalitha|Password123|
|Lalitha|Password123|
