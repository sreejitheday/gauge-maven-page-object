Specification Heading
=====================
Created by Sreejith on 1/11/2015

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Enter Invalid Credential and verify that login failed
-----------------------------------------------------

* Given I am on "http://www.gmail.com" page
* Then I enter the user name as "jithumangad"
* And click Next button
* Then I enter the password as "test1234"
* And click on Login button
* Then I should see the error message