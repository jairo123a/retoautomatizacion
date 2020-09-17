Feature: Ingresar al sitio web para diligenciar los datos de registro de un usuario y verificar su registro


  @caso1
  Scenario: Ingresar al sitio web utest.com  y realizar un registro de un usuario
    Given Ingresar al sitio web
    When  ingresar a registro y  diligenciar los datos de ingreso
      |nombre|apellido | correo                     |mes        | dia |ano   |lenguaje | city     |codigop   | pais     |pc       |version   |winidioma|password  |confirm   |
      | jairo|henao    |henaoarbelaezjairo@gmail.com|December   |30   |1987  |English  | Medellin |55555     | Colombia |Windonws |10        |Spanish  |Pjario1234|Pjario1234|
    Then  Verificar El registro correcto del usuario "Welcome to the world's largest community of freelance software testers!"
