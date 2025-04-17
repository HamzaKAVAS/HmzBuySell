Feature: As a user, I would like to be able to log in with the email and password I registered with the site.

  Scenario: [US_005 => TC-01] It is checked whether the login link in the top bar of the homepage is visible and active.

    Given The user opens the browser and enters the URL address specified in the data into the URL bar.
    Then  the user verifies if the Login link in the top right corner is visible and active
    When  The user closes the browser.