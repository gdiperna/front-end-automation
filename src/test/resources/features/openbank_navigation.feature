Feature: OpenBank homepage navigation

  Scenario: Navigate to registration flow
    Given I open the OpenBank homepage
    When I click the footer "Hazte cliente" button
    And I click "¡Quiero hacerme cliente!"
    Then I should be on the registration page

  Scenario: Access "Preguntas" section
    Given I open the OpenBank homepage
    When I click the "Preguntas" link
    Then I should see the "Preguntas" content

  Scenario: Access "Contáctanos" section
    Given I open the OpenBank homepage
    When I click the "Contáctanos" link
    Then I should see the contact section

  Scenario: Access "Cajeros" section
    Given I open the OpenBank homepage
    When I click the "Cajeros" link
    Then I should see the cajeros map

  Scenario: Access login section
    Given I open the OpenBank homepage
    When I click the "Acceder" button
    Then I should be redirected to the login page
