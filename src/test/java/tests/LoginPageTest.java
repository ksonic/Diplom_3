package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.MainPage;
import pageobject.RegistrationPage;
import pageobject.ResetPasswordPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static helper.Helper.BASE_URL;

public class LoginPageTest{
    @Test
    @DisplayName("Check transition from main page to login form")
    @Description("Basic ui test for pages transition")
    public void mainPageLoginTest() {
        MainPage mainPage = open(BASE_URL,
                        MainPage.class);
       MainPage.mainPageLoginButtonClick();
       webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/login"));
    }

    @Test
    @DisplayName("Check transition from main page to login form by account button")
    @Description("Basic ui test for pages transition")
    public void accountLoginTest() {
        MainPage mainPage =
                open(BASE_URL, MainPage.class);
        MainPage.accountLoginButtonClick();
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/login"));
    }

    @Test
    @DisplayName("Check transition from registration page to login form")
    @Description("Basic ui test for pages transition")
    public void loginFromRegistrationPageTest() {
        RegistrationPage registrationPage =
                open(BASE_URL+"register",RegistrationPage.class);
        RegistrationPage.loginFromRegistrationPageButtonClick();
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/login"));
    }
    @Test
    @DisplayName("Check transition from reset password page to login form")
    @Description("Basic ui test for pages transition")
    public void loginFromResetPasswordPageTest() {
        ResetPasswordPage resetPasswordPage =
                open(BASE_URL+"forgot-password",ResetPasswordPage.class);
        ResetPasswordPage.loginFromResetPasswordPageButtonClick();
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/login"));
    }

}
