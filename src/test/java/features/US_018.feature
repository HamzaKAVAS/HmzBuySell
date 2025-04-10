Feature: As a registered user, I would like to have a page on my dashboard where I can view my shopping history

  @google
  Scenario: [US_018 => TC-01] The Purchase History menu item should be visible and active in the Dashboard sideBar.

    Given Open your web browser and go to "https://qa.buysellcycle.com/".
    And On the home page, find and click the Login button in the upper right corner.
    And On the screen that opens, enter a valid email address in the Email address or phone field.
    And Enter a valid password in the Password field.
    And Click on the Sign In button.
    And After logging in, verify that the dashboard home page has loaded.
    Then Verify that Purchase History is visible and active in the left sidebar.
    And Press the logout button.
    And Close the page.

  Scenario: [US_018 => TC-02] Shopping history (with Details, Amount, Delivery Status, Payment Status, Payment Status,
                              Action information) should be viewable on the Purchase History page.

    Given Go to the relevant URL and verify that the user panel has been loaded after completing the relevant login procedures.
    And Click Purchase History in the left sidebar.
    Then Verify that the Purchase History page has loaded.
    Then See if the Details, Amount, Delivery Status, Payment Status, Action headings are displayed.
    And Press the logout button.
    And Close the page.