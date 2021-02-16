Feature: Etsy Search Functionality

  Background:
    Given user is on Etsy homepage

  @TC51
  Scenario: Etsy Title Verification
    Then user should see title is as expected

    @TC52
    Scenario: Etsy Title Verification (without parameterization)
      When user types Wooden Spoon in the search box and click
      Then user should see Wooden Spoon is in the title

  @TC53
  Scenario: Etsy Title Verification (with parameterization)
    When user types "Wooden spoon" in the search box and click
    Then user should see "Wooden spoon" is in the title




