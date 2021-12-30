Feature: Deseo realizar un registro en la pagina de compras

  Scenario: Ingresar a la pagina de compras para realizar un registro
    Given El usuario ingresa a la pagina para registrarse
    When Ingresa los siguientes datos

      |Email    |pepito23@gmail.com |
      |Title    |Mr                 |
      |FirstName|Nicolas            |
      |Lastname |Perez              |
      |Password |Manzana123         |
      |Day      |4                  |
      |Month    |June               |
      |Year     |1967               |
      |Company  |ToolsQA            |
      |Adress   |Calle12#13-25      |
      |Adress2  |Apartment          |
      |City     |Bogota             |
      |State    |Georgia            |
      |Postal   |12345              |
      |Country  |United States      |
      |Homephone|7852436            |
      |Phone    |3124785498         |


    Then Se valida ingreso a la cuenta con la palabra MY ACCOUNT