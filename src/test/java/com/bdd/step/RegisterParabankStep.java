package com.bdd.step;

import com.bdd.page.RegisterParabankPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class RegisterParabankStep extends ScenarioSteps {

    RegisterParabankPage registerParabankPage;

    @Step
    public void queElUsuarioAbreLaPaginaEnElNavegador(String navegador) {
        Assert.assertTrue("La página no se abrió correctamente", registerParabankPage.queElUsuarioAbreLaPaginaEnElNavegador(navegador));
    }

    @Step
    public void hacerClicEnElEnlaceDeRegister() {
        registerParabankPage.hacerClicEnElEnlaceDeRegister();
    }

    @Step
    public void ingresarEnElCampoFirstName(String firstName) {
        registerParabankPage.ingresarEnElCampoFirstName(firstName);
    }

    @Step
    public void ingresarEnElCampoLastName(String lastName) {
        registerParabankPage.ingresarEnElCampoLastName(lastName);
    }

    @Step
    public void ingresarEnElCampoAddress(String adderss) {
        registerParabankPage.ingresarEnElCampoAddress(adderss);
    }

    @Step
    public void ingresarEnElCampoCity(String city) {
        registerParabankPage.ingresarEnElCampoCity(city);
    }

    @Step
    public void ingresarEnElCampoState(String state) {
        registerParabankPage.ingresarEnElCampoState(state);
    }

    @Step
    public void ingresarEnElCampoZipCode(String code) {
        registerParabankPage.ingresarEnElCampoZipCode(code);
    }

    @Step
    public void ingresarEnElCampoPhone(String phone) {
        registerParabankPage.ingresarEnElCampoPhone(phone);
    }

    @Step
    public void ingresarEnElCampoSSN(String ssn) {
        registerParabankPage.ingresarEnElCampoSSN(ssn);
    }

    @Step
    public void ingresarEnElCampoUsername(String username) {
        registerParabankPage.ingresarEnElCampoUsername(username);
    }

    @Step
    public void ingresarEnElCampoPassword(String password) {
        registerParabankPage.ingresarEnElCampoPassword(password);
    }

    @Step
    public void ingresarEnElCampoConfirmPassword(String password) {
        registerParabankPage.ingresarEnElCampoConfirmPassword(password);
    }

    @Step
    public void hacerClicEnElBotonRegister() {
        registerParabankPage.hacerClicEnElBotonRegister();
    }

    @Step
    public void visualizaElMensaje(String messagge) {
        String mensajeActual = registerParabankPage.getSuccessMessage();
        Assert.assertEquals(messagge, mensajeActual);
    }

    @Step
    public void accederALaPaginaDeInicioDeSesionParaAutenticarseConY(String usr, String pass) {
        registerParabankPage.accederALaPaginaDeInicioDeSesionParaAutenticarseConY(usr, pass);
    }
}
