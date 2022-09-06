Feature: add web table
@regression
  Scenario: add web table
    Given make practice of the demoqa page
    When is a web table created
    Then should create a record

@radioButton
  Scenario: select field
    Given want to practice the demoqa page
    When a field is selected
    Then should show a record

  @WebTable
  Scenario: populate web table
    Given practice page demoqa
    When adding fields to a table
    Then should display a new table

  @Buttons
  Scenario: select buttons
    Given I want to practice on the demoqa page
    When select the buttons on the screen
    Then it should show a success message




