

  Feature: Register Functionality

    Scenario: Register Test
      Given Navigate to website
      When Sign in button click
      And Enter an email and click Create an account button
      When Click an radio button
      And Enter firstname and lastname
      And Enter password and date of birth
      When Click register button
      Then Verify successfully registered
      And Verify successfully login
      Then log out Website


