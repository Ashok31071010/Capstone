Feature: Verify functionalities on the-internet.herokuapp.com

  Scenario: Verify title of the Home Page
    Given I launch the URL 
    Then I verify the title of the page is "The Internet"

  Scenario: Verify A/B Testing Page
    Given I launch the URL "http://the-internet.herokuapp.com/"
    When I click on the link "A/B Testing"
    Then I verify the text "A/B Test Variation 1" on the page

  Scenario: Select Option1 from Dropdown
    Given I launch the URL "http://the-internet.herokuapp.com/"
    When I click on the link "Dropdown"
    And I select "Option 1" from the dropdown
    Then I verify "Option 1" is selected

  Scenario: Verify Links on Frames Page
    Given I launch the URL "http://the-internet.herokuapp.com/"
    When I click on the link "Frames"
    Then I verify the presence of link "Nested Frames"
    And I verify the presence of link "iFrame"
