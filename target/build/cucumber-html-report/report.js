$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/web/registerParabank.feature");
formatter.feature({
  "name": "Validar el funcionamiento de los formularios de ParaBank",
  "description": "  Como automatizador web\n  Quiero validar el funcionamiento de los formularios\n  Para registrar usuarios",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@FEATURE_DEMOBLAZE"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Registro exitoso de un nuevo usuario",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@ESCENARIO_PARABANK"
    }
  ]
});
formatter.step({
  "name": "que el usuario abre la pagina en el navegador \"\u003cnavegador\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "hace clic en el enlace de Register",
  "keyword": "Cuando "
});
formatter.step({
  "name": "ingresa \"\u003cfirstName\u003e\" en el campo First Name",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003clastName\u003e\" en el campo Last Name",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003caddress\u003e\" en el campo Address",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003ccity\u003e\" en el campo City",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003cstate\u003e\" en el campo State",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003czipCode\u003e\" en el campo Zip Code",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003cphone\u003e\" en el campo Phone",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003cssn\u003e\" en el campo SSN",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003cusername\u003e\" en el campo Username",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003cpassword\u003e\" en el campo Password",
  "keyword": "E "
});
formatter.step({
  "name": "ingresa \"\u003cpassword\u003e\" en el campo Confirm Password",
  "keyword": "E "
});
formatter.step({
  "name": "hace clic en el boton Register",
  "keyword": "Y "
});
formatter.step({
  "name": "visualiza el mensaje \"Your account was created successfully. You are now logged in.\"",
  "keyword": "Entonces "
});
formatter.step({
  "name": "accede a la pagina de inicio de sesion para autenticarse con \"\u003cusername\u003e\" y \"\u003cpassword\u003e\"",
  "keyword": "Y "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "navegador",
        "firstName",
        "lastName",
        "address",
        "city",
        "state",
        "zipCode",
        "phone",
        "ssn",
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "chrome",
        "Juan",
        "Flores",
        "Calle 123",
        "Madrid",
        "Madrid",
        "28001",
        "555-0101",
        "123-45-6789",
        "testingEncora4",
        "testing1997"
      ]
    },
    {
      "cells": [
        "edge",
        "Juan",
        "Flores",
        "Calle 123",
        "Madrid",
        "Madrid",
        "28001",
        "555-0101",
        "123-45-6789",
        "testingEncora5",
        "testing1997"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Registro exitoso de un nuevo usuario",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@FEATURE_DEMOBLAZE"
    },
    {
      "name": "@ESCENARIO_PARABANK"
    }
  ]
});
formatter.step({
  "name": "que el usuario abre la pagina en el navegador \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.queElUsuarioAbreLaPaginaEnElNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hace clic en el enlace de Register",
  "keyword": "Cuando "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.haceClicEnElEnlaceDeRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Juan\" en el campo First Name",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Flores\" en el campo Last Name",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Calle 123\" en el campo Address",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Madrid\" en el campo City",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Madrid\" en el campo State",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoState(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"28001\" en el campo Zip Code",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"555-0101\" en el campo Phone",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoPhone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"123-45-6789\" en el campo SSN",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"testingEncora4\" en el campo Username",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"testing1997\" en el campo Password",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"testing1997\" en el campo Confirm Password",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoConfirmPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hace clic en el boton Register",
  "keyword": "Y "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.haceClicEnElBotonRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualiza el mensaje \"Your account was created successfully. You are now logged in.\"",
  "keyword": "Entonces "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.visualizaElMensaje(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accede a la pagina de inicio de sesion para autenticarse con \"testingEncora4\" y \"testing1997\"",
  "keyword": "Y "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.accedeALaPaginaDeInicioDeSesionParaAutenticarseConY(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Registro exitoso de un nuevo usuario",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@FEATURE_DEMOBLAZE"
    },
    {
      "name": "@ESCENARIO_PARABANK"
    }
  ]
});
formatter.step({
  "name": "que el usuario abre la pagina en el navegador \"edge\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.queElUsuarioAbreLaPaginaEnElNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hace clic en el enlace de Register",
  "keyword": "Cuando "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.haceClicEnElEnlaceDeRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Juan\" en el campo First Name",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Flores\" en el campo Last Name",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Calle 123\" en el campo Address",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Madrid\" en el campo City",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"Madrid\" en el campo State",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoState(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"28001\" en el campo Zip Code",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"555-0101\" en el campo Phone",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoPhone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"123-45-6789\" en el campo SSN",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"testingEncora5\" en el campo Username",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"testing1997\" en el campo Password",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa \"testing1997\" en el campo Confirm Password",
  "keyword": "E "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.ingresaEnElCampoConfirmPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hace clic en el boton Register",
  "keyword": "Y "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.haceClicEnElBotonRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualiza el mensaje \"Your account was created successfully. You are now logged in.\"",
  "keyword": "Entonces "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.visualizaElMensaje(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accede a la pagina de inicio de sesion para autenticarse con \"testingEncora5\" y \"testing1997\"",
  "keyword": "Y "
});
formatter.match({
  "location": "RegisterParabankStepDefinition.accedeALaPaginaDeInicioDeSesionParaAutenticarseConY(String,String)"
});
formatter.result({
  "status": "passed"
});
});