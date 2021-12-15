# Big Bank QA Test Assignment
## To assess the manual testing of the calculator modal
Read the two documents '*Big Bank QA Assignment - Manual testing testcases.pdf*' (or '*Big Bank QA Assignment - Manual testing testcases.xlsx*', depending on your file format preference) and '*Big Bank QA Assignment - Bug Report #1.pdf*'.

## To assess the Selenium IDE solution for automated tests of the feature

Download Selenium IDE extension for either FireFox or Chrome from here: https://www.selenium.dev/selenium-ide/
From Selenium IDE import '*bigBank-proovitoo.side*' found in '*solutions*' folder. Press CTRL-R to run the test suite.
When running the tests, adjusting the execution speed might be necessary to give UI elements enough time to load.

## To assess the calculate API verification of calculate endpoint

Have Postman installed (found here: https://www.postman.com/). Import the postman collection '*bigbank.proovitoo.postman_collection.json*'. Most of the tests can be found under '*calculate default*' request, some *under 'zero fees and zero interest rate*' or '*zero loan amount*'. Only '*calculate default*' has been commented detailing which approach I chose and why.


## To assess the Selenide solution for automated tests of the feature
Build the project at hand with gradle. It should download all the necessary dependencies.
Dependencies used:
```sh
testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.2'
testImplementation 'com.codeborne:selenide:6.1.1'
testImplementation 'org.seleniumhq.selenium:selenium-java:4.1.0'
testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.2'
```
Unfortunately this solution is incomplete, since there is no more time left to work on it as the deadline approaches. Given time, I am sure I could develop a good solution to automate the testing of the calculator modal based on the manual testcases I wrote. Doing so, I would be working with Selenide. As much as it pains me to enter a broken project, the solution will be sent as is, since there is no more time left in the bank.
