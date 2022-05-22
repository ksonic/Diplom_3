package tests;

import helper.RegistrationBase;
import helper.User;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.RegistrationPage;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static helper.Credentials.getUserCredentialsWithInvalidPassword;
import static helper.Credentials.getValidUserCredentials;
import static helper.Paths.LOGIN_PAGE_URL;
import static helper.Paths.REGISTRATION_PAGE_URL;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RegistrationPageTest extends RegistrationBase {

    @Test
    @DisplayName("Check registration with valid credentials")
    @Description("Basic ui test for registration")
    public void registrationWithValidCredentialsTest() {
        this.user = getValidUserCredentials();
        registrationPage.setRegistrationForm(this.user);
        webdriver().shouldHave(url(LOGIN_PAGE_URL));
    }

    @Test
    @DisplayName("Check registration with invalid credentials")
    @Description("Basic ui test for registration")
    public void registrationWithInvalidCredentialsTest() {
        User user = getUserCredentialsWithInvalidPassword();
        registrationPage.setRegistrationForm(user);
        assertTrue(RegistrationPage.passwordMessage.isDisplayed());
        webdriver().shouldHave(url(REGISTRATION_PAGE_URL));
    }
}
