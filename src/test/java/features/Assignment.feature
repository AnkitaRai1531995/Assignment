Feature: elearning application signup



   @Assignment1
  Scenario Outline: Signup to elearning application 
    Given User navigates to elearning application
    Then User clicks on Signup button
    When user enter "<FirstName>" FirstName and "<lastname>" lastname and "<email>" email and "<Code>" Code and "<Username>" Username and "<Pass>" Pass and "<Confirmpassword>" Confirmpassword
    And user clicks on Submit button
    Then user gets validation message

    Examples: 
      | FirstName | lastname  | email                    |   Code    | Username | Pass    | Confirmpassword |
      | test153   | test      | raianks1531995@gmail.com |   test    | test534  | test127 | test127 |
     

     
   @Assignment2
  Scenario Outline: Signin to elearning application and send mail
    Given User navigates to elearning application
    When user enter "<Username>" Username and "<Pass>" Pass 
    And user clicks on Login button
    Then user clicks on Inbox and compose button
    Then user enter mail details "<sendTo>" as sendTo "<Subject>" as Subject "<Message>" as Message and mail body and send it successfully

    Examples: 
| Username | Pass    | sendTo | Subject | Message |
| test534  | test127 | abc    | test    | Hi Its Working|
     