
Feature: As an administrator, I would like to have a notifications section on the home page so that I can be informed about events on the site.

  Scenario: [US_035 => TC-01] The notification icon should be visible in the admin dashboard panel.

    Given Open your web browser and go to "https://qa.buysellcycle.com/admin/login".
    And Enter a valid email address in the Email address or phone field.
    And Enter a valid password in the Password field.
    And Click on the sign in button.
    Then Verify that the admin panel is loaded.
    Then Verify that the notification icon is visible.
    And Hover over the admin profile photo and press Logout.
    And Close the page.
