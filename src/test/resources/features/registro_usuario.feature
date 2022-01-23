#Autor: Manuel
@stories
Feature: Registro de usuario en Utest
  @scenario

  Scenario:  Registro de manuel en la pagina de Utest
    Given manuel desea registrarse en Utest
    When el usuario ingresa los datos requeridos por el sistems

      |strNombre |strApellido |strEmail             |strDia |strMes |strAno|strCiudad |strZip|strPais     |strDispositivo|strModelo|strSistemaOperativo|strClave      |
      |Manuel    |Leon        |Eeozrut235@gmail.com | 25    |October|1996  |Bogota    |00000 |Colombia    |Apple         |iPhone 7 |iOS 15             |Ballesta251996|
    Then  el registro se completa al ver el boton de complete setup

      |strTextoFinal|
      |Complete Setup|
