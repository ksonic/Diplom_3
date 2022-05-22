package tests;

import helper.MainPageBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.MainPage;
import pageobject.RegistrationPage;
import pageobject.ResetPasswordPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static helper.Paths.*;

public class LoginPageTest extends MainPageBase {
    MainPage mainPage;
    RegistrationPage registrationPage;
    ResetPasswordPage resetPasswordPage;

    @Test
    @DisplayName("Check transition from main page to login form")
    @Description("Basic ui test for pages transition")
    public void mainPageLoginTest() {
        mainPage = open(BASE_URL,
                MainPage.class);
        mainPage.mainPageLoginButtonClick();
        webdriver().shouldHave(url(LOGIN_PAGE_URL));
    }

    @Test
    @DisplayName("Check transition from main page to login form by account button")
    @Description("Basic ui test for pages transition")
    public void accountLoginTest() {
        mainPage =
                open(BASE_URL, MainPage.class);
        mainPage.accountLoginButtonClick();
        webdriver().shouldHave(url(LOGIN_PAGE_URL));
    }

    @Test
    @DisplayName("Check transition from registration page to login form")
    @Description("Basic ui test for pages transition")
    public void loginFromRegistrationPageTest() {
        registrationPage =
                open(REGISTRATION_PAGE_URL, RegistrationPage.class);
        registrationPage.loginFromRegistrationPageButtonClick();
        webdriver().shouldHave(url(LOGIN_PAGE_URL));
    }

    @Test
    @DisplayName("Check transition from reset password page to login form")
    @Description("Basic ui test for pages transition")
    public void loginFromResetPasswordPageTest() {
        resetPasswordPage =
                open(FORGOT_PASSWORD_PAGE_URL, ResetPasswordPage.class);
        resetPasswordPage.loginFromResetPasswordPageButtonClick();
        webdriver().shouldHave(url(LOGIN_PAGE_URL));
    }

}
