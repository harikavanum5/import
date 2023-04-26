 @tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario: Verify the Registration page
    Given open the browser
    When user enter the url "<https://demo.nopcommerce.com/>"
    Then click on the Register
    When click on the Gender
    Then Enter a Firstname  "<firstname>"
    When enter a Lastname "<lastname>"
    Then enter a dob "<dateofbirth>"
    Then Enter a Email "<Email>"
    When enter the Password"<password>"
    Then Enter a  ConfirmPassword "<ConfirmPassword>"
    When click on a Register button
    Then click on the Login
    When enter the email"<email>"
    And enter the password"<password>"
    Then click on the login button
    When click apparelmodule
    When click on addtocart
    Then click jewllery
    When click on add to cart
 