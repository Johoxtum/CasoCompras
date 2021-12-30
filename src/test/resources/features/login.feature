Feature: Deseo ingresar a mi usuario

  Scenario: Logear el usuario creado en la pagina de compras
    Given El usuario ingresa a la pagina para logearse
    When  El usuario ingresa los siguientes datos

      |Email    |pepito23@gmail.com|
      |Password |Manzana123        |
    Then Se valida logeo exitoso con la palabra MY ACCOUNT