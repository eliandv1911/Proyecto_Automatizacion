Feature: buy products on LINIO
  me as a user of the linio application
  I need to purchase several products

  Scenario: Add and remove products from the shopping cart in LINIO
    Given the user is in the application https://www.linio.com.co/
    Given the user must be in the Hogar category, in the section Colchones, Base Camas y Almohadas
    When the user selects the product Super Mega Combo Azul Queen 160x190 Resortado Marshall
    When the user adds products to the cart 3
    When the user clicks go to cart
    Then the user should see the product, the quantity and the value



