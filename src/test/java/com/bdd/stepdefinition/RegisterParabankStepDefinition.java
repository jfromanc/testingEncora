package com.bdd.stepdefinition;

import com.bdd.step.RegisterParabankStep;
import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegisterParabankStepDefinition {

    @Steps
    RegisterParabankStep registerParabankStep;

    @Dado("^que el usuario abre la pagina en el navegador \"([^\"]*)\"$")
    public void queElUsuarioAbreLaPaginaEnElNavegador(String navegador) throws Throwable {
        registerParabankStep.queElUsuarioAbreLaPaginaEnElNavegador(navegador);
    }

    @Cuando("^hace clic en el enlace de Register")
    public void haceClicEnElEnlaceDeRegister() throws Throwable {
        registerParabankStep.hacerClicEnElEnlaceDeRegister();
    }

    @E("^ingresa \"([^\"]*)\" en el campo First Name$")
    public void ingresaEnElCampoFirstName(String firstName) throws Throwable {
        registerParabankStep.ingresarEnElCampoFirstName(firstName);
    }

    @E("^ingresa \"([^\"]*)\" en el campo Last Name$")
    public void ingresaEnElCampoLastName(String lastName) throws Throwable {
        registerParabankStep.ingresarEnElCampoLastName(lastName);
    }

    @E("^ingresa \"([^\"]*)\" en el campo Address$")
    public void ingresaEnElCampoAddress(String adderss) throws Throwable {
        registerParabankStep.ingresarEnElCampoAddress(adderss);
    }

    @E("^ingresa \"([^\"]*)\" en el campo City$")
    public void ingresaEnElCampoCity(String city) throws Throwable {
        registerParabankStep.ingresarEnElCampoCity(city);
    }

    @E("^ingresa \"([^\"]*)\" en el campo State$")
    public void ingresaEnElCampoState(String state) throws Throwable {
        registerParabankStep.ingresarEnElCampoState(state);
    }

    @E("^ingresa \"([^\"]*)\" en el campo Zip Code$")
    public void ingresaEnElCampoZipCode(String code) throws Throwable {
        registerParabankStep.ingresarEnElCampoZipCode(code);
    }

    @E("^ingresa \"([^\"]*)\" en el campo Phone$")
    public void ingresaEnElCampoPhone(String phone) throws Throwable {
        registerParabankStep.ingresarEnElCampoPhone(phone);
    }

    @E("^ingresa \"([^\"]*)\" en el campo SSN$")
    public void ingresaEnElCampoSSN(String ssn) throws Throwable {
        registerParabankStep.ingresarEnElCampoSSN(ssn);
    }

    @E("^ingresa \"([^\"]*)\" en el campo Username$")
    public void ingresaEnElCampoUsername(String username) throws Throwable {
        registerParabankStep.ingresarEnElCampoUsername(username);
    }

    @E("^ingresa \"([^\"]*)\" en el campo Password$")
    public void ingresaEnElCampoPassword(String password) throws Throwable {
        registerParabankStep.ingresarEnElCampoPassword(password);
    }

    @E("^ingresa \"([^\"]*)\" en el campo Confirm Password$")
    public void ingresaEnElCampoConfirmPassword(String password) throws Throwable {
        registerParabankStep.ingresarEnElCampoConfirmPassword(password);
    }

    @Y("^hace clic en el boton Register$")
    public void haceClicEnElBotonRegister() {
        registerParabankStep.hacerClicEnElBotonRegister();
    }

    @Entonces("^visualiza el mensaje \"([^\"]*)\"$")
    public void visualizaElMensaje(String messagge) throws Throwable {
        registerParabankStep.visualizaElMensaje(messagge);
    }

    @Y("^accede a la pagina de inicio de sesion para autenticarse con \"([^\"]*)\" y \"([^\"]*)\"$")
    public void accedeALaPaginaDeInicioDeSesionParaAutenticarseConY(String usr, String pass) throws Throwable {
        registerParabankStep.accederALaPaginaDeInicioDeSesionParaAutenticarseConY(usr, pass);
    }
}
