Feature: Script 1 to test BDD framework.

@login
Scenario Outline: Launch the browser and open the desired url.

Given the user opens the browser "<name>"
Then the user opens the website "<address>"
Then the user quits the browser

Examples:
| name | address | 
| chrome | http://www.facebook.com | 
| chrome | http://www.google.com |

@Login2
Scenario Outline: Launch the browser and open the desired url, using data table concept.

Given the user opens the browser
|chrome|
Then the user opens the website
|https://www.google.com|
|https://www.facebook.com|
Then the user quits the browser

@Login3
Scenario Outline: Launch the browser and open the desired url, using data table concept2.

Given the user opens the browser
|chrome|
Then the user opens the website2
| website |
|https://www.google.com|
|https://www.facebook.com|
Then the user quits the browser
