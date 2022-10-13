Feature: Crear Repositorio en Github
  Como usuario
  Quiero crear un repositorio publico en github
  Para poder tener mi codigo en la pagina

  Scenario: Crear Repositorio
    Given Ingresa a la Pagina principal de github
    When Introduce las credenciales
    | pruebaselenium2022@gmail.com | selenium2022! |
    And Crea el repositorio publico
    | repoPruebasSelenemium2022 |
    Then podra validar que se pueda subir el proyecto