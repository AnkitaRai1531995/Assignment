Feature: facebook login
@Regression @Sanity @active
  Scenario: login facebook with valid credentials
    Given User navigates to facebook application
    When user enters valid credentials
    Then user logged in successfully

@Regression @amit
  Scenario Outline: Login facebook with invalid credentials
    Given User navigates to facebook application
    When user enter "<username>" username and "<password>" password
    And user clicks on ok button
    Then user gets validation message

    Examples: 
      | username | password |
      | amit     | xyz      |
      | abc      |      123 |
      
@smoke  @Sanity
  Scenario: login gmail application
    Given user navigates to gmail application
    When user enters valid credentials in gmail
    Then user logged in dashboard successfully
    
 
