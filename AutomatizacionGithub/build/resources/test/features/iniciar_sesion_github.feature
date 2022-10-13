Feature: Iniciar Sesion en Github
  Como usuario
  Quiero ingresar a la pagina web de github Y colocar mis credenciales en modulo login
  Para poder acceder a la pagina principal del usuario

  Scenario: Iniciar Sesion
    Given Ingresa a la Pagina principal de github
    When Entra al modulo de login
    And Introduce las credenciales
    | pruebaselenium2022@gmail.com | selenium2022! |
    Then podra validar que esta en la pagina home