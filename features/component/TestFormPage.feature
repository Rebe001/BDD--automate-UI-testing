Feature: Test Form Page can create form with success
  Created by : rebecca at 2020-06-10
  Last modified by : rebecca at 2020-06-10

  Create a purchase order form from app - This test verifies that a purchase order form can be created
  

  Objetive : This test verifies that a purchase order form can be created
             

  Precondition: Connect with app, admin user is created
  PostCondition: 
  Automated : true
  Type : Functional

  Scenario: Verify a purchase order form can be created
    Given LoginPage click on login button
    When MainPage click on create form button
    And FormPage set product to "<product>"
    And FormPage set quantity to "<quantity>"
    And FormPage click on save button
    Then Verify FormPage success message is displayed

Examples:
  |product    | quantity  |
  |product1   | 1         |
  |product2   | 99        |
