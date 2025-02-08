package com.bdd.page;

import com.bdd.utils.BasePage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")
public class RegisterParabankPage extends PageObject {

    BasePage basePage;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerLink;

    @FindBy(id = "customer.firstName")
    private WebElement firstNameInput;

    @FindBy(id = "customer.lastName")
    private WebElement lastNameInput;

    @FindBy(id = "customer.address.street")
    private WebElement addressInput;

    @FindBy(id = "customer.address.city")
    private WebElement cityInput;

    @FindBy(id = "customer.address.state")
    private WebElement stateInput;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCodeInput;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneInput;

    @FindBy(id = "customer.ssn")
    private WebElement ssnInput;

    @FindBy(id = "customer.username")
    private WebElement usernameInput;

    @FindBy(id = "customer.password")
    private WebElement passwordInput;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPasswordInput;

    @FindBy(css = "input[value='Register']")
    private WebElement registerButton;

    @FindBy(css = "div#rightPanel p")
    private WebElement successMessage;

    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement logOutBtn;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameTxt;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordTxt;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement logInBtn;

    public boolean queElUsuarioAbreLaPaginaEnElNavegador(String navegador) {
        return Browser.Start(this, navegador);
    }

    public void hacerClicEnElEnlaceDeRegister() {
        basePage.waitAndClick(registerLink);
    }

    public void ingresarEnElCampoFirstName(String firstName) {
        basePage.waitAndSendKeys(firstNameInput, firstName);
    }

    public void ingresarEnElCampoLastName(String lastName) {
        basePage.waitAndSendKeys(lastNameInput, lastName);
    }

    public void ingresarEnElCampoAddress(String adderss) {
        basePage.waitAndSendKeys(addressInput, adderss);
    }

    public void ingresarEnElCampoCity(String city) {
        basePage.waitAndSendKeys(cityInput, city);
    }

    public void ingresarEnElCampoState(String state) {
        basePage.waitAndSendKeys(stateInput, state);
    }

    public void ingresarEnElCampoZipCode(String code) {
        basePage.waitAndSendKeys(zipCodeInput, code);
    }

    public void ingresarEnElCampoPhone(String phone) {
        basePage.waitAndSendKeys(phoneInput, phone);
    }

    public void ingresarEnElCampoSSN(String ssn) {
        basePage.waitAndSendKeys(ssnInput, ssn);
    }

    public void ingresarEnElCampoUsername(String username) {
        basePage.waitAndSendKeys(usernameInput, username);
    }

    public void ingresarEnElCampoPassword(String password) {
        basePage.waitAndSendKeys(passwordInput, password);
    }

    public void ingresarEnElCampoConfirmPassword(String password) {
        basePage.waitAndSendKeys(confirmPasswordInput, password);
    }

    public void hacerClicEnElBotonRegister() {
        basePage.waitAndClick(registerButton);
    }

    public String getSuccessMessage() {
        return basePage.waitAndGetText(successMessage);
    }

    public void accederALaPaginaDeInicioDeSesionParaAutenticarseConY(String usr, String pass) {
        logOutBtn.click();
        basePage.waitAndSendKeys(usernameTxt, usr);
        basePage.waitAndSendKeys(passwordTxt, pass);
        logInBtn.click();
    }
}
