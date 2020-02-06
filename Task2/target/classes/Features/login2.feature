Feature: Flights+Accodmation between Brussels and NewYork

  Scenario Outline: Flights between Brussels and NewYork
    Given Navigate to Expedia Page
    Then enter "<source>" and "<destination>"
    When select from and to date
    Then select travellers and click on search
    Then verify result page contains the destination
    And close browser

    Examples: 
      | source                                      | destination |
      | Brussels, Belgium (BRU-Brussels - National) | NewYork     |
