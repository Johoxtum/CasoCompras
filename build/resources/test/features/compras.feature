Feature: Deseo realizar una compra

  Scenario: Realizar compra de ropa
    Given El usuario ingresa a la pagina principal
    When El usuario busca la siguiente ropa a comprar
      |T-shirts |shirt        |
      |dresses  |Printed Dress|
      |Blouses  |Blouse       |
    Then  Se valida el siguiente mensaje de compra Your order on My Store is complete